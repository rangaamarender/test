package com.lucid.recruit.worker.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.lucid.recruit.org.dto.OrganizationDTO;
import com.lucid.recruit.person.dto.PersonLegalDTO;
import com.lucid.recruit.referencedata.dto.WorkerTypeDTO;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotNull;

public class WorkerDTO {
	@Nullable
	private String workerID;
	@Nullable
	private String workerCode;
	@NotNull
	private WorkerTypeDTO workerType;

	@NotNull
	private PersonLegalDTO personLegal;
	@JsonIgnoreProperties({ "description", "taxId" })
	@NotNull
	private OrganizationDTO organization;
	@NotNull
	private List<WorkerStatusDTO> workerStatus;
	@NotNull
	private List<WorkAssignmentDTO> workAssignment;

	public WorkerDTO() {
		super();
	}

	public WorkerDTO(String workerID, String workerCode, @NotNull WorkerTypeDTO workerType,
			@NotNull PersonLegalDTO personLegal, @NotNull OrganizationDTO organization,
			@NotNull List<WorkerStatusDTO> workerStatus, @NotNull List<WorkAssignmentDTO> workAssignment) {
		super();
		this.workerID = workerID;
		this.workerCode = workerCode;
		this.workerType = workerType;
		this.personLegal = personLegal;
		this.organization = organization;
		this.workerStatus = workerStatus;
		this.workAssignment = workAssignment;
	}

	public String getWorkerID() {
		return workerID;
	}

	public void setWorkerID(String workerID) {
		this.workerID = workerID;
	}

	public String getWorkerCode() {
		return workerCode;
	}

	public void setWorkerCode(String workerCode) {
		this.workerCode = workerCode;
	}

	public WorkerTypeDTO getWorkerType() {
		return workerType;
	}

	public void setWorkerType(WorkerTypeDTO workerType) {
		this.workerType = workerType;
	}

	public List<WorkAssignmentDTO> getWorkAssignment() {
		return workAssignment;
	}

	public void setWorkAssignment(List<WorkAssignmentDTO> workAssignment) {
		this.workAssignment = workAssignment;
	}

	public PersonLegalDTO getPersonLegal() {
		return personLegal;
	}

	public void setPersonLegal(PersonLegalDTO personLegal) {
		this.personLegal = personLegal;
	}

	public OrganizationDTO getOrganization() {
		return organization;
	}

	public void setOrganization(OrganizationDTO organization) {
		this.organization = organization;
	}

	public List<WorkerStatusDTO> getWorkerStatus() {
		return workerStatus;
	}

	public void setWorkerStatus(List<WorkerStatusDTO> workerStatus) {
		this.workerStatus = workerStatus;
	}

	public List<WorkAssignmentDTO> getWorkerAssignment() {
		return workAssignment;
	}

	public void setWorkerAssignment(List<WorkAssignmentDTO> workerAssignment) {
		this.workAssignment = workerAssignment;
	}

}
