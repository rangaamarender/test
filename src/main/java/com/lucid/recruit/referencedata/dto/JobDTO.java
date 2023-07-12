package com.lucid.recruit.referencedata.dto;

import com.lucid.recruit.referencedata.entity.Department;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotNull;

public class JobDTO {
	@NotNull
	private String jobID;
	@Nullable
	private String jobName;
	@Nullable
	private boolean internalJobInd;
	@Nullable
	private Department department;

	public JobDTO() {
		super();
	}

	public JobDTO(@NotNull String jobID, String jobName, boolean internalJobInd, Department department) {
		super();
		this.jobID = jobID;
		this.jobName = jobName;
		this.internalJobInd = internalJobInd;
		this.department = department;
	}

	public JobDTO(@NotNull String jobID) {
		super();
		this.jobID = jobID;
	}

	public String getJobID() {
		return jobID;
	}

	public void setJobID(String jobID) {
		this.jobID = jobID;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public boolean isInternalJobInd() {
		return internalJobInd;
	}

	public void setInternalJobInd(boolean internalJobInd) {
		this.internalJobInd = internalJobInd;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}
