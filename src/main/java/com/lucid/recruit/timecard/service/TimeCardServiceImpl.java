package com.lucid.recruit.timecard.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.stereotype.Component;

import com.lucid.core.azure.AzureDocumentUtility;
import com.lucid.core.base.BaseServiceImpl;
import com.lucid.core.exception.ApplicationException;
import com.lucid.core.exception.EntityNotFoundException;
import com.lucid.core.exception.ErrorCodes;
import com.lucid.recruit.contract.repo.ContractRepo;
import com.lucid.recruit.timecard.controller.TimeCardController;
import com.lucid.recruit.timecard.customRepo.TimeCardCustomRepo;
import com.lucid.recruit.timecard.dto.TimeCardDTO;
import com.lucid.recruit.timecard.dto.TimeCardSummaryDTO;
import com.lucid.recruit.timecard.entity.TimeCard;
import com.lucid.recruit.timecard.exception.TimeCardNotFoundException;
import com.lucid.recruit.timecard.repo.TimeCardDocumentRepo;
import com.lucid.recruit.timecard.repo.TimeCardExpenseDocumentRepo;
import com.lucid.recruit.timecard.repo.TimeCardExpenseRepo;
import com.lucid.recruit.timecard.repo.TimeCardItemRepo;
import com.lucid.recruit.timecard.repo.TimeCardRepo;
import com.lucid.recruit.timecard.validations.TimeCardValidator;
import com.lucid.recruit.worker.entity.Worker;
import com.lucid.recruit.worker.repo.WorkerRepository;
import com.lucid.util.FileUtility;

import jakarta.transaction.Transactional;

@Component(TimeCardServiceImpl.SERVICE_NAME)
public class TimeCardServiceImpl extends BaseServiceImpl implements TimeCardService {

	public static final String SERVICE_NAME = "timecardService";
	public static final String ERROR_TC_0001 = "ERROR_TC_0001";
	public static final String ERROR_TC_0002 = "ERROR_TC_0002";
	public static final String ERROR_TC_0003 = "ERROR_TC_0003";

	private static final Logger log = LoggerFactory.getLogger(TimeCardController.class);
	@Autowired
	private TimeCardValidator timeCardValidations;

	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private TimeCardRepo timeCardRepo;
	@Autowired
	private TimeCardItemRepo timeCardItemRepo;
	@Autowired
	private TimeCardExpenseRepo timeCardExpenseRepo;
	@Autowired
	private TimeCardExpenseDocumentRepo timeCardExpenseDocumentRepo;
	@Autowired
	private TimeCardDocumentRepo timeCardDocumentRepo;
	@Autowired
	private WorkerRepository workerRepo;
	@Autowired
	private ContractRepo contractRepo;
	@Autowired
	private TimeCardCustomRepo timeCardCustomRepo;
	// @Autowired
	private AzureDocumentUtility azureDocumentUtility;
	@Autowired
	private FileUtility fileUtility;

	// @Value("${azure.doc.upload.time_card.container}")
	private String containerName;

	@Autowired
	private TimeCardValidator validator;

	public TimeCardServiceImpl() {
		super();
	}

	/**
	 * Creates the time card, time card items, expenses and there related documents
	 * *
	 * 
	 * @param timeCardDTO
	 * @return it returns TimeCardDTO
	 */
	@Override
	@Transactional
	public TimeCardDTO createTimeCard(TimeCardDTO timeCardDTO) {
		// worker ID exist
		Optional<Worker> workerId = workerRepo.findById(timeCardDTO.getWorker().getWorkerID());
		if (workerId.isEmpty()) {
			throw new EntityNotFoundException(ErrorCodes.RESOURCE_NOT_FOUND_404,
					"Worker by id " + timeCardDTO.getWorker().getWorkerID() + " not found");
		}
		// work order ID exist

		// validate the input any failure in validation corresponding exception
		validator.validateTimeCard(timeCardDTO);
		return null;
	}

	/**
	 * @param filterData
	 * @return retrieveAllTimeCards
	 * @throws ApplicationException
	 */
	@Override
	public Page<TimeCardSummaryDTO> retrieveAllTimeCards(Map<String, Object> filterData) {
		List<TimeCardSummaryDTO> timeCardList = new ArrayList<>();
		Page<TimeCard> timeCardEntities = timeCardCustomRepo.fetchTimeCardWithCriteria(filterData);
		if (timeCardEntities == null || timeCardEntities.getContent().isEmpty()) {
			log.info("No organization found in the search");
			return new PageImpl<>(timeCardList, timeCardEntities.getPageable(), timeCardEntities.getTotalElements());
		}
		getSummary(timeCardEntities.getContent(), timeCardList);
		return new PageImpl<>(timeCardList, timeCardEntities.getPageable(), timeCardEntities.getTotalElements());
	}

	/**
	 * @param timeCards
	 * @param timeCardList
	 * @return list of TimeCardSummaryDTO
	 */
	@Override
	public List<TimeCardSummaryDTO> getSummary(List<TimeCard> timeCards, List<TimeCardSummaryDTO> timeCardList) {
		if (timeCards == null || timeCards.isEmpty()) {
			return timeCardList;
		}
		for (TimeCard timeCard : timeCards) {
			TimeCardSummaryDTO timeCardSummaryDTO = new TimeCardSummaryDTO();
			timeCardSummaryDTO.setTimeCardID(timeCardSummaryDTO.getTimeCardID());
			timeCardSummaryDTO.setResources(timeCardSummaryDTO.getResources());
			timeCardSummaryDTO.setRole(timeCardSummaryDTO.getRole());
			timeCardSummaryDTO.setType(timeCardSummaryDTO.getType());
			timeCardSummaryDTO.setContractID(timeCardSummaryDTO.getContractID());
			timeCardSummaryDTO.setContractTitle(timeCardSummaryDTO.getContractTitle());
			timeCardSummaryDTO.setStartDate(timeCardSummaryDTO.getStartDate());
			timeCardSummaryDTO.setEndDate(timeCardSummaryDTO.getEndDate());
			timeCardSummaryDTO.setTotalHours(timeCardSummaryDTO.getTotalHours());
			timeCardSummaryDTO.setStatus(timeCardSummaryDTO.getStatus());

			timeCardList.add(timeCardSummaryDTO);
		}

		return timeCardList;

	}

	/**
	 * @param timeCardID
	 * @return retrieve TimeCard based on TimeCard
	 * @throws ApplicationException
	 */

	@Override
	public TimeCardDTO retrieveTimeCard(String timeCardID) {
		TimeCardDTO timeCardDTO = null;
		try {
			Optional<TimeCard> optionalTimeCard = timeCardRepo.findById(timeCardID);
			if (!optionalTimeCard.isPresent()) {
				log.info("No TimeCard found in the search");
				throw new TimeCardNotFoundException(ERROR_TC_0001, "Time Card not found with :" + timeCardID);
			}
			TimeCard timeCard = optionalTimeCard.get();
			timeCardDTO = modelMapper.map(timeCard, TimeCardDTO.class);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		return timeCardDTO;

	}

	/**
	 * @param timeCardID
	 * @param timeCardDTO
	 * @return
	 */
	@Override
	public TimeCardDTO editTimeCard(String timeCardID, TimeCardDTO timeCardDTO) {
		return null;
	}

}
