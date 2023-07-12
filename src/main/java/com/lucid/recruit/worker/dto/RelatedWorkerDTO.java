package com.lucid.recruit.worker.dto;

import com.lucid.recruit.referencedata.dto.WorkerTypeDTO;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotNull;

public class RelatedWorkerDTO {
	@NotNull
	private String workerID;
	@Nullable
	private String workerCode;
	@Nullable
	private WorkerTypeDTO workerType;

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

}
