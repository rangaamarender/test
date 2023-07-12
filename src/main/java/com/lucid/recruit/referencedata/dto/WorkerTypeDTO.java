package com.lucid.recruit.referencedata.dto;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class WorkerTypeDTO {
	@NotNull
	@NotEmpty
	private String workerTypeCode;
	@Nullable
	private String workerTypeName;
	@Nullable
	private String workerTypeDesc;

	public WorkerTypeDTO() {
		super();
	}

	public WorkerTypeDTO(@NotNull @NotEmpty String workerTypeCode, String workerTypeName, String workerTypeDesc) {
		super();
		this.workerTypeCode = workerTypeCode;
		this.workerTypeName = workerTypeName;
		this.workerTypeDesc = workerTypeDesc;
	}

	public String getWorkerTypeCode() {
		return workerTypeCode;
	}

	public void setWorkerTypeCode(String workerTypeCode) {
		this.workerTypeCode = workerTypeCode;
	}

	public String getWorkerTypeName() {
		return workerTypeName;
	}

	public void setWorkerTypeName(String workerTypeName) {
		this.workerTypeName = workerTypeName;
	}

	public String getWorkerTypeDesc() {
		return workerTypeDesc;
	}

	public void setWorkerTypeDesc(String workerTypeDesc) {
		this.workerTypeDesc = workerTypeDesc;
	}

}
