package com.lucid.recruit.worker.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.lucid.recruit.worker.entity.WorkerStatusCode;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotNull;

public class WorkerStatusDTO {
	@Nullable
	private String id;
	@NotNull
	private WorkerStatusCode status;
	@NotNull
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date effectiveDate;
	@NotNull
	private String reasonCode;
	@NotNull
	private String statusReasonText;

	public WorkerStatusDTO() {
		super();
	}

	public WorkerStatusDTO(WorkerStatusCode status, Date effectiveDate, String reasonCode, String statusReasonText) {
		super();
		this.status = status;
		this.effectiveDate = effectiveDate;
		this.reasonCode = reasonCode;
		this.statusReasonText = statusReasonText;
	}

	public WorkerStatusDTO(String id, @NotNull WorkerStatusCode status, @NotNull Date effectiveDate,
			@NotNull String reasonCode, @NotNull String statusReasonText) {
		super();
		this.id = id;
		this.status = status;
		this.effectiveDate = effectiveDate;
		this.reasonCode = reasonCode;
		this.statusReasonText = statusReasonText;
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

	public String getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	public String getStatusReasonText() {
		return statusReasonText;
	}

	public void setStatusReasonText(String statusReasonText) {
		this.statusReasonText = statusReasonText;
	}
}
