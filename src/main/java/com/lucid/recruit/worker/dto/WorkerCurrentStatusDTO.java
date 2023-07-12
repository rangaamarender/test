package com.lucid.recruit.worker.dto;

import java.util.Date;

import com.lucid.recruit.worker.entity.WorkerStatusCode;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotNull;

public class WorkerCurrentStatusDTO {
	@Nullable
	private String id;
	@NotNull
	private WorkerStatusCode status;
	@NotNull
	private Date effectiveDate;

	public WorkerCurrentStatusDTO() {
		super();

	}

	public WorkerCurrentStatusDTO(String id, @NotNull WorkerStatusCode status, @NotNull Date effectiveDate) {
		super();
		this.id = id;
		this.status = status;
		this.effectiveDate = effectiveDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public WorkerStatusCode getStatus() {
		return status;
	}

	public void setStatus(WorkerStatusCode status) {
		this.status = status;
	}

	public Date getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

}
