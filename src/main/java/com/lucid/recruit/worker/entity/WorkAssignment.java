package com.lucid.recruit.worker.entity;

import java.util.Date;

import com.lucid.core.entity.AuditableEntity;
import com.lucid.recruit.referencedata.entity.Job;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * Worker assignments of the worker organization.
 * 
 * @author chandu
 *
 */
@Entity
@Table(name = WorkAssignment.TABLE_NAME)
public class WorkAssignment extends AuditableEntity {
	public static final String TABLE_NAME = "w_work_assignment";
	private static final long serialVersionUID = -4060856231425415538L;

	// Worker Assignment Unique Integration ID UUID value
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "work_assignment_id", nullable = false)
	private String workerAssgmtId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "worker_id", nullable = false, updatable = false)
	private Worker worker;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "job_id", nullable = false, updatable = false)
	private Job job;

	@Column(name = "strat_date", nullable = false)
	private Date startDate;

	@Column(name = "end_date", nullable = true)
	private Date endDate;

	@Column(name = "expected_start_date", nullable = false)
	private Date expectedStartDate;

	@Column(name = "probationary_start_date", nullable = true)
	private Date poStartDate;

	@Column(name = "probationary_end_date", nullable = true)
	private Date poEndDate;

	public WorkAssignment() {
		super();
	}

	public WorkAssignment(String workerAssgmtId, Worker worker, Job job, Date startDate, Date endDate,
			Date expectedStartDate, Date poStartDate, Date poEndDate) {
		super();
		this.workerAssgmtId = workerAssgmtId;
		this.worker = worker;
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

	public Worker getWorker() {
		return worker;
	}

	public void setWorker(Worker worker) {
		this.worker = worker;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
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
