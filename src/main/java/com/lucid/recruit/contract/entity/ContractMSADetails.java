/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.contract.entity;

import java.time.LocalDate;
import java.util.List;

import com.lucid.core.entity.AuditableEntity;
import com.lucid.recruit.contract.constants.EnumMSAInvPeriodUnits;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * 
 * Table holds the history details of MSA
 */
@Entity
@Table(name = ContractMSADetails.TABLE_NAME)
public class ContractMSADetails extends AuditableEntity {

	private static final long serialVersionUID = 8609487266697232690L;

	public static final String TABLE_NAME = "c_contract_msa_details";

	@EmbeddedId
	private ContractMSADetailsID id;

	// end date
	@Column(name = "end_dt", nullable = true)
	private LocalDate endDate;

	// invoice period
	@Column(name = "inv_period", nullable = false, updatable = false)
	private int invPeriod;

	// invoice period units
	@Enumerated(EnumType.STRING)
	@Column(name = "inv_period_units", nullable = false, updatable = false)
	private EnumMSAInvPeriodUnits invPeriodUnits;

	// invoice Cycle
	@Column(name = "invoice_cycle", nullable = false, updatable = false, length = 2)
	private String invCycle;

	// payment terms
	@Column(name = "payment_terms", nullable = false, updatable = false, length = 50)
	private String paymentTerms;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
	private List<ContractMSADetails> contractMSADetails;

	public ContractMSADetailsID getId() {
		return id;
	}

	public void setId(ContractMSADetailsID id) {
		this.id = id;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public int getInvPeriod() {
		return invPeriod;
	}

	public void setInvPeriod(int invPeriod) {
		this.invPeriod = invPeriod;
	}

	public EnumMSAInvPeriodUnits getInvPeriodUnits() {
		return invPeriodUnits;
	}

	public void setInvPeriodUnits(EnumMSAInvPeriodUnits invPeriodUnits) {
		this.invPeriodUnits = invPeriodUnits;
	}

	public String getInvCycle() {
		return invCycle;
	}

	public void setInvCycle(String invCycle) {
		this.invCycle = invCycle;
	}

	public String getPaymentTerms() {
		return paymentTerms;
	}

	public void setPaymentTerms(String paymentTerms) {
		this.paymentTerms = paymentTerms;
	}

	public List<ContractMSADetails> getContractMSADetails() {
		return contractMSADetails;
	}

	public void setContractMSADetails(List<ContractMSADetails> contractMSADetails) {
		this.contractMSADetails = contractMSADetails;
	}	
}
