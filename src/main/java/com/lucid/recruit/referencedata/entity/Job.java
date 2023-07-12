package com.lucid.recruit.referencedata.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * JOB Reference data
 * 
 * @author chandu
 *
 */
@Entity
@Table(name = Job.TABLE_NAME)
public class Job {
	public static final String TABLE_NAME = "ref_job";

	// JOB Unique Integration ID UUID value
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "job_id", nullable = false)
	private String jobID;

	@Column(name = "job_name", nullable = false)
	private String jobName;

	@Column(name = "internal_job_ind", nullable = true)
	private boolean internalJobInd;

	// Department of the job
	@ManyToOne
	@JoinColumn(name = "dept_id", nullable = false)
	private Department department;

	public Job(String jobID, String jobName, boolean internalJobInd, Department department) {
		super();
		this.jobID = jobID;
		this.jobName = jobName;
		this.internalJobInd = internalJobInd;
		this.department = department;
	}

	public Job() {
		super();

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
