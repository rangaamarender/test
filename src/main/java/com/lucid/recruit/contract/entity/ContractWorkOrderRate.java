/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.contract.entity;

import java.util.Date;

import com.lucid.core.embeddable.Amount;
import com.lucid.core.entity.AuditableEntity;
import com.lucid.recruit.contract.constants.EnumRateCategory;
import com.lucid.recruit.contract.constants.EnumRateUnits;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
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
import jakarta.persistence.UniqueConstraint;

/**
 * 
 * Table holds the details of W/O rates for T&M contracts.
 */
@Entity
@Table(name = ContractWorkOrderRate.TABLE_NAME, uniqueConstraints = {
		@UniqueConstraint(name = "UQ_CNTRCTWORATE_IDSDWTYPE", columnNames = { "wrkorder_id", "start_dt",
				"category" }) })
public class ContractWorkOrderRate extends AuditableEntity {

	private static final long serialVersionUID = -8734089172619443722L;
	public static final String TABLE_NAME = "c_cntrct_wrkordr_rate";

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "wrkorder_rate_id", nullable = false, length = 75)
	private String worateID;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "wrkorder_id", nullable = false, insertable = false, updatable = false)
	private ContractWorkOrder workOrder;

	@Column(name = "start_dt", nullable = false)
	private Date startDate;

	@Column(name = "end_dt", nullable = false)
	private Date endDate;

	@Enumerated(EnumType.STRING)
	@Column(name = "category", nullable = false, updatable = false)
	private EnumRateCategory category;

	@Enumerated(EnumType.STRING)
	@Column(name = "rate_type", nullable = false, length = 25)
	private EnumRateUnits rateType;

	@Embedded
	private Amount rateMny;

	public String getWorateID() {
		return worateID;
	}

	public void setWorateID(String worateID) {
		this.worateID = worateID;
	}

	public ContractWorkOrder getWorkOrder() {
		return workOrder;
	}

	public void setWorkOrder(ContractWorkOrder workOrder) {
		this.workOrder = workOrder;
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

	public EnumRateCategory getCategory() {
		return category;
	}

	public void setCategory(EnumRateCategory category) {
		this.category = category;
	}

	public EnumRateUnits getRateType() {
		return rateType;
	}

	public void setRateType(EnumRateUnits rateType) {
		this.rateType = rateType;
	}

	public Amount getRateMny() {
		return rateMny;
	}

	public void setRateMny(Amount rateMny) {
		this.rateMny = rateMny;
	}
}
