package com.lucid.recruit.worker.entity;

import java.util.Date;

import com.lucid.core.entity.AuditableEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.UniqueConstraint;

/**
 * Worker life cycle
 * 
 * @author chandu
 */
@Entity
@Table(name = WorkerStatus.TABLE_NAME, uniqueConstraints = @UniqueConstraint(name = "UQWorkerStatus", columnNames = {
		"worker_id", "status_code", "effective_date" }))
public class WorkerStatus extends AuditableEntity {

	// Constants
	public static final String TABLE_NAME = "w_worker_status";
	private static final long serialVersionUID = -3050129609537165192L;

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "worker_status_id", nullable = false, length = 75)
	private String workerStatusId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "worker_id", nullable = false, updatable = false)
	private Worker worker;

	@Enumerated(EnumType.STRING)
	@Column(name = "status_code", nullable = false)
	// Date from when the status is effective
	private WorkerStatusCode status;

	@Temporal(TemporalType.DATE)
	@Column(name = "effective_date", nullable = false)
	private Date effectiveDate;

	// The employer's reason for the work relationship status.
	// TODO Chandu need to define the reason code reference data and link here

	@Column(name = "reason_code", nullable = false)
	private String reasonCode;

	// A description of the status. Free flow
	@Column(name = "status_reason_text", nullable = true)
	private String status_reason_text;

	public String getWorkerStatusId() {
		return workerStatusId;
	}

	public void setWorkerStatusId(String workerStatusId) {
		this.workerStatusId = workerStatusId;
	}

	public Worker getWorker() {
		return worker;
	}

	public void setWorker(Worker worker) {
		this.worker = worker;
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

	public String getStatus_reason_text() {
		return status_reason_text;
	}

	public void setStatus_reason_text(String status_reason_text) {
		this.status_reason_text = status_reason_text;
	}

}
