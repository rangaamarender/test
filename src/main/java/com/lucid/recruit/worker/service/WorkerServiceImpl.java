package com.lucid.recruit.worker.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lucid.core.exception.EntityNotFoundException;
import com.lucid.recruit.org.dto.OrganizationDTO;
import com.lucid.recruit.org.entity.Organization;
import com.lucid.recruit.org.repo.OrganizationRepo;
import com.lucid.recruit.person.dto.PersonContactDetailsDTO;
import com.lucid.recruit.person.dto.PersonLegalDTO;
import com.lucid.recruit.person.dto.PersonLegalSummaryDTO;
import com.lucid.recruit.person.entity.PersonContactDetails;
import com.lucid.recruit.person.entity.PersonLegal;
import com.lucid.recruit.person.repo.PersonContactDetailsRepo;
import com.lucid.recruit.person.repo.PersonLegalRepo;
import com.lucid.recruit.referencedata.entity.Job;
import com.lucid.recruit.referencedata.entity.WorkerType;
import com.lucid.recruit.referencedata.repo.JobRepo;
import com.lucid.recruit.referencedata.repo.WorkerTypeRepo;
import com.lucid.recruit.worker.dto.WorkAssignmentDTO;
import com.lucid.recruit.worker.dto.WorkerCurrentStatusDTO;
import com.lucid.recruit.worker.dto.WorkerDTO;
import com.lucid.recruit.worker.dto.WorkerStatusDTO;
import com.lucid.recruit.worker.dto.WorkerSummaryDTO;
import com.lucid.recruit.worker.entity.WorkAssignment;
import com.lucid.recruit.worker.entity.Worker;
import com.lucid.recruit.worker.entity.WorkerStatus;
import com.lucid.recruit.worker.exception.JobNotFoundException;
import com.lucid.recruit.worker.exception.OrgNotFoundException;
import com.lucid.recruit.worker.repo.WorkeAssignmentRepo;
import com.lucid.recruit.worker.repo.WorkerRepository;
import com.lucid.recruit.worker.repo.WorkerStatusRepository;

/**
 * 
 * @author chandu
 *
 */
@Service
public class WorkerServiceImpl implements WorkerService {
	@Autowired
	private WorkerRepository workerRepo;
	@Autowired
	private OrganizationRepo organizationRepo;
	@Autowired
	private PersonLegalRepo personLegalRepo;
	@Autowired
	private PersonContactDetailsRepo personContactRepo;
	@Autowired
	private WorkerStatusRepository workerStatusRepo;
	@Autowired
	private WorkeAssignmentRepo workeAssigmentRepo;
	@Autowired
	private JobRepo jobRepo;
	@Autowired
	private WorkerTypeRepo workerTypeRepo;

	@Autowired
	private ModelMapper modelMapper;

	public WorkerServiceImpl() {
		super();
	}

	@Override
	@Transactional
	public WorkerDTO createWorker(WorkerDTO workerDto) {

		// Validate the Worker Type
		Optional<WorkerType> workerTyOptional = workerTypeRepo.findById(workerDto.getWorkerType().getWorkerTypeCode());
		if (!workerTyOptional.isPresent()) {
			throw new EntityNotFoundException(
					"Worker Type by Id " + workerDto.getWorkerType().getWorkerTypeCode() + " not found");
		}

		// Handle Organization
		Optional<Organization> orgEntityOptional = organizationRepo
				.findById(workerDto.getOrganization().getOrganizationID());
		if (!orgEntityOptional.isPresent()) {
			throw new OrgNotFoundException(
					"Organization by Id " + workerDto.getOrganization().getOrganizationID() + " not found");
		}
		// Handle Person
		PersonLegal personLegal = convertToEntity(workerDto.getPersonLegal());
		personLegalRepo.save(personLegal);
		// Handle Person Contact, only 1st element will be considered other elements
		// will be discarded
		PersonContactDetailsDTO contactDTO = workerDto.getPersonLegal().getPersonContactDetails().get(0);

		PersonContactDetails contact = convertToEntity(contactDTO);
		contact.setPersonLegal(personLegal);
		personContactRepo.save(contact);

		// Handle Worker
		Worker worker = convertToEntity(workerDto);
		worker.setPersonLegal(personLegal);
		workerRepo.save(worker);

		// Handle WorkerStatus
		// 1st Element will be consider in Create rest will be discarded
		WorkerStatus workerStatus = convertToEntity(workerDto.getWorkerStatus().get(0));
		workerStatus.setWorker(worker);
		workerStatusRepo.save(workerStatus);

		// Handle WorkAssigment
		// 1st Element will be consider in Create rest will be discarded
		// Check valid job id
		Optional<Job> jobOptional = jobRepo.findById(workerDto.getWorkerAssignment().get(0).getJob().getJobID());
		if (!jobOptional.isPresent()) {
			throw new JobNotFoundException(
					"Job by Id " + workerDto.getWorkerAssignment().get(0).getJob().getJobID() + " not found");
		}

		WorkAssignment workeAssigment = convertToEntity(workerDto.getWorkerAssignment().get(0));
		workeAssigment.setJob(jobOptional.get());
		workeAssigment.setWorker(worker);
		workeAssigmentRepo.save(workeAssigment);

		// Prepare Response
		WorkerDTO responseDTO = convertToDto(worker);

		PersonLegalDTO respPrsnLegalDto = convertToDto(personLegal);
		ArrayList<PersonContactDetailsDTO> rspPrsnContatDtsList = new ArrayList<>();
		rspPrsnContatDtsList.add(convertToDto(contact));
		respPrsnLegalDto.setPersonContactDetails(rspPrsnContatDtsList);
		responseDTO.setPersonLegal(respPrsnLegalDto);

		responseDTO.setOrganization(convertToDto(orgEntityOptional.get()));
		ArrayList<WorkerStatusDTO> rspworkerStatusList = new ArrayList<>();
		rspworkerStatusList.add(convertToDto(workerStatus));
		responseDTO.setWorkerStatus(rspworkerStatusList);

		ArrayList<WorkAssignmentDTO> rspworkerAssgmtList = new ArrayList<>();
		rspworkerAssgmtList.add(convertToDto(workeAssigment));
		responseDTO.setWorkerAssignment(rspworkerAssgmtList);

		return responseDTO;
	}

	public List<WorkerSummaryDTO> retriveAllWorkers() {
		List<Worker> workers = workerRepo.findAll();
//		List<WorkerDTO> workerDto = workers.stream().map(worker -> modelMapper.map(worker, WorkerDTO.class))
//				.collect(Collectors.toList());
		List<WorkerSummaryDTO> workerDto = workers.stream().map(worker -> convertToSummary(worker))
				.collect(Collectors.toList());
		return workerDto;
	}

	public WorkerDTO retriveWorkerById(String workerId) {
		Optional<Worker> worker = workerRepo.findById(workerId);
		if (!worker.isPresent()) {
			throw new JobNotFoundException("Worker by Id " + workerId + " not found");
		}

		WorkerDTO workerDto = convertToDto(worker.get());

		workerDto.setWorkerAssignment(worker.get().getWorkAssigment().stream()
				.map(workAssigment -> modelMapper.map(workAssigment, WorkAssignmentDTO.class))
				.collect(Collectors.toList()));

		return workerDto;
	}

	private WorkerSummaryDTO convertToSummary(Worker worker) {
		WorkerSummaryDTO workerSummary = new WorkerSummaryDTO();
		workerSummary.setWorkerID(worker.getWorkerID());
		workerSummary.setWorkerCode(worker.getWorkerCode());
		workerSummary.setWorkerType(worker.getWorkerType());
		PersonLegalSummaryDTO prsnDto = new PersonLegalSummaryDTO(worker.getPersonLegal().getPersonLegalID(),
				worker.getPersonLegal().getGivenName(), worker.getPersonLegal().getMiddleName(),
				worker.getPersonLegal().getFamilyName(), worker.getPersonLegal().getPreferredName());
		workerSummary.setPersonLegal(prsnDto);
		WorkerCurrentStatusDTO workerStatus = new WorkerCurrentStatusDTO(
				worker.getWorkerStatus().get(0).getWorkerStatusId(), worker.getWorkerStatus().get(0).getStatus(),
				worker.getWorkerStatus().get(0).getEffectiveDate());
		workerSummary.setWorkerStatus(workerStatus);
		return workerSummary;
	}

	private WorkerDTO convertToDto(Worker worker) {
		WorkerDTO workerDTO = modelMapper.map(worker, WorkerDTO.class);
		return workerDTO;
	}

	private PersonLegalDTO convertToDto(PersonLegal personLegal) {
		PersonLegalDTO personLegalDto = modelMapper.map(personLegal, PersonLegalDTO.class);
		return personLegalDto;
	}

	private WorkerStatusDTO convertToDto(WorkerStatus workerStatus) {
		WorkerStatusDTO workerStatusDTO = modelMapper.map(workerStatus, WorkerStatusDTO.class);
		return workerStatusDTO;
	}

	private OrganizationDTO convertToDto(Organization organization) {
		OrganizationDTO organizationDto = modelMapper.map(organization, OrganizationDTO.class);
		return organizationDto;
	}

	private PersonContactDetailsDTO convertToDto(PersonContactDetails personContact) {
		PersonContactDetailsDTO personContactDto = modelMapper.map(personContact, PersonContactDetailsDTO.class);
		return personContactDto;
	}

	private Worker convertToEntity(WorkerDTO workerDto) {
		Worker worker = modelMapper.map(workerDto, Worker.class);
		return worker;
	}

	private PersonLegal convertToEntity(PersonLegalDTO personDto) {
		PersonLegal person = modelMapper.map(personDto, PersonLegal.class);
		return person;
	}

	private PersonContactDetails convertToEntity(PersonContactDetailsDTO personContactDto) {
		PersonContactDetails personContact = modelMapper.map(personContactDto, PersonContactDetails.class);
		return personContact;
	}

	private WorkerStatus convertToEntity(WorkerStatusDTO workerStatusDto) {
		WorkerStatus workerStatus = modelMapper.map(workerStatusDto, WorkerStatus.class);
		return workerStatus;
	}

	private WorkAssignment convertToEntity(WorkAssignmentDTO workAssigmentDto) {
		WorkAssignment workAssigment = modelMapper.map(workAssigmentDto, WorkAssignment.class);
		return workAssigment;
	}

	private WorkAssignmentDTO convertToDto(WorkAssignment workAssigment) {
		WorkAssignmentDTO workAssigmentDto = modelMapper.map(workAssigment, WorkAssignmentDTO.class);
		return workAssigmentDto;
	}

}
