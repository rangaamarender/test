package com.lucid.recruit.contract.entity;

import java.time.LocalDate;

import com.lucid.core.entity.BaseAddress;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

/*
 * Contract work location
 */
@Entity
@Table(name = ContractWorkLocation.TABLE_NAME, uniqueConstraints = {
		@UniqueConstraint(name = "UQ_WL_SD", columnNames = { "cntrct_wrkordr_id", "start_dt" }) })
public class ContractWorkLocation extends BaseAddress {
	public static final String TABLE_NAME = "c_cntrct_workloc";
	private static final long serialVersionUID = 8423905393070824737L;

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "cntrct_wl_id", nullable = false, length = 75)
	private String contractwlID;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cntrct_wrkordr_id", nullable = false, insertable = false, updatable = false)
	private ContractWorkOrder workOrder;

	@Column(name = "start_dt", nullable = false)
	private LocalDate startDate;

	@Column(name = "end_dt", nullable = true)
	private LocalDate endDate;

	public String getContractwlID() {
		return contractwlID;
	}

	public void setContractwlID(String contractwlID) {
		this.contractwlID = contractwlID;
	}

	public ContractWorkOrder getWorkOrder() {
		return workOrder;
	}

	public void setWorkOrder(ContractWorkOrder workOrder) {
		this.workOrder = workOrder;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
}
