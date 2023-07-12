package com.lucid.recruit.timecard.validations;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lucid.core.exception.ErrorCodes;
import com.lucid.core.exception.InvalidDataException;
import com.lucid.recruit.contract.entity.ContractResource;
import com.lucid.recruit.contract.repo.ContractResourceRepo;
import com.lucid.recruit.timecard.controller.TimeCardController;
import com.lucid.recruit.timecard.dto.TimeCardDTO;
import com.lucid.recruit.timecard.entity.TimeCard;
import com.lucid.recruit.timecard.repo.TimeCardRepo;

@Component
public class TimeCardValidator {
	private static final Logger log = LoggerFactory.getLogger(TimeCardController.class);

	@Autowired
	private ContractResourceRepo cntrctResRepo;

	@Autowired
	private TimeCardRepo timeCardRepo;

	public void validateTimeCard(TimeCardDTO timeCardDTO) {
		log.info("validate timecard input request ");
		// end date should equal or after start date
		if (timeCardDTO.getStartDate().isAfter(timeCardDTO.getEndDate())) {
			throw new InvalidDataException(ErrorCodes.INVALID_DATA, "timeCard", "startDate",
					timeCardDTO.getStartDate().toString(), "start date shall be before end date");
		}

		// Work-order is assigned to worker and active for the given period
		List<ContractResource> findByWoTSDates = cntrctResRepo.findByWoDates(timeCardDTO.getWorker().getWorkerID(),
				timeCardDTO.getWorkOrder().getWorkOrderID(), timeCardDTO.getStartDate(), timeCardDTO.getEndDate());
		if (findByWoTSDates == null || findByWoTSDates.size() == 0) {
			throw new InvalidDataException(ErrorCodes.TS_BV_0001, "timeCard", "Worker",
					timeCardDTO.getWorker().getWorkerID(),
					"Worker " + timeCardDTO.getWorker().getWorkerID() + " does not have active work order "
							+ timeCardDTO.getWorkOrder().getWorkOrderID() + " from " + timeCardDTO.getStartDate()
							+ " to " + timeCardDTO.getEndDate());

		}

		// check if any overlap of time for the given worker, work order & period
		List<TimeCard> findByTSWoDates = timeCardRepo.findByWoDates(timeCardDTO.getWorker().getWorkerID(),
				timeCardDTO.getWorkOrder().getWorkOrderID(), timeCardDTO.getStartDate(), timeCardDTO.getEndDate());

		if (findByTSWoDates != null && findByTSWoDates.size() > 0) {
			throw new InvalidDataException(ErrorCodes.TS_BV_0002, "timeCard", "Start date/End Date",
					timeCardDTO.getStartDate().toString(),
					"Worker " + timeCardDTO.getWorker().getWorkerID() + " work order "
							+ timeCardDTO.getWorkOrder().getWorkOrderID() + " from " + timeCardDTO.getStartDate()
							+ " to " + timeCardDTO.getEndDate() + " have overlap time ");
		}

	}

}
