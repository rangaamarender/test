/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.contract.entity;

import java.time.LocalDate;

import com.lucid.core.embeddable.Amount;
import com.lucid.core.entity.AuditableEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * 
 * Table holds the details of W/O fixed prices for Fixed Price contracts.
 */
@Entity
@Table(name = ContractWorkOrderFP.TABLE_NAME)
public class ContractWorkOrderFP extends AuditableEntity {

	private static final long serialVersionUID = -8734089172619443722L;
	public static final String TABLE_NAME = "c_cntrct_wrkordr_fp";

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "wrkorder_fp_id", nullable = false, length = 75)
	private String wofixedpriceID;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "wrkorder_id", nullable = false, insertable = false, updatable = false)
	private ContractWorkOrder workOrder;

	@Column(name = "start_dt", nullable = false)
	private LocalDate startDate;

	@Column(name = "end_dt", nullable = true)
	private LocalDate endDate;

	@Embedded
	private Amount fixedprice;

	public String getWofixedpriceID() {
		return wofixedpriceID;
	}

	public void setWofixedpriceID(String wofixedpriceID) {
		this.wofixedpriceID = wofixedpriceID;
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

	public Amount getFixedprice() {
		return fixedprice;
	}

	public void setFixedprice(Amount fixedprice) {
		this.fixedprice = fixedprice;
	}
}
