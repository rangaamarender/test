package com.lucid.recruit.worker.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.lucid.recruit.referencedata.dto.JobDTO;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotNull;

public class WorkAssignmentDTO {
	@Nullable
	private String workerAssgmtId;
	@NotNull
	private JobDTO job;
	@NotNull
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date startDate;
	@Nullable
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date endDate;
	@NotNull
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date expectedStartDate;
	@Nullable
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date poStartDate;
	@Nullable
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date poEndDate;

	public WorkAssignmentDTO() {
		super();
	}

	public WorkAssignmentDTO(String workerAssgmtId, @NotNull JobDTO job, @NotNull Date startDate, Date endDate,
			@NotNull Date expectedStartDate, Date poStartDate, Date poEndDate) {
		super();
		this.workerAssgmtId = workerAssgmtId;
		this.job = job;
		this.startDate = startDate;
		this.endDate = endDate;
		this.expectedStartDate = expectedStartDate;
		this.poStartDate = poStartDate;
		this.poEndDate = poEndDate;
	}

	public String getWorkerAssgmtId() {
		return workerAssgmtId;
	}

	public void setWorkerAssgmtId(String workerAssgmtId) {
		this.workerAssgmtId = workerAssgmtId;
	}

	public JobDTO getJob() {
		return job;
	}

	public void setJob(JobDTO job) {
		this.job = job;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getExpectedStartDate() {
		return expectedStartDate;
	}

	public void setExpectedStartDate(Date expectedStartDate) {
		this.expectedStartDate = expectedStartDate;
	}

	public Date getPoStartDate() {
		return poStartDate;
	}

	public void setPoStartDate(Date poStartDate) {
		this.poStartDate = poStartDate;
	}

	public Date getPoEndDate() {
		return poEndDate;
	}

	public void setPoEndDate(Date poEndDate) {
		this.poEndDate = poEndDate;
	}

}
