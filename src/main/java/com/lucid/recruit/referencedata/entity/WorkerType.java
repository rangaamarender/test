package com.lucid.recruit.referencedata.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Worker Type Reference data *
 * 
 * @author chandu *
 */
@Entity
@Table(name = WorkerType.TABLE_NAME)
public class WorkerType {
	public static final String TABLE_NAME = "ref_workertype";

	@Id
	@Column(name = "worker_type_code", nullable = false, updatable = false)
	private String workerTypeCode;

	@Column(name = "worker_type_name", nullable = false, updatable = false)
	private String workerTypeName;

	@Column(name = "worker_type_desc", nullable = true)
	private String workerTypeDesc;

	public WorkerType() {
		super();

	}

	public WorkerType(String workerTypeCode, String workerTypeName, String workerTypeDesc) {
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
