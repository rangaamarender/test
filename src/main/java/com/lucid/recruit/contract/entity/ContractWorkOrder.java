/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.contract.entity;

import java.time.LocalDate;
import java.util.List;

import com.lucid.core.entity.AuditableEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = ContractWorkOrder.TABLE_NAME)
public class ContractWorkOrder extends AuditableEntity {

	// --------------------------------------------------------------- Constants
	private static final long serialVersionUID = -8734089172619443722L;
	public static final String TABLE_NAME = "c_cntrct_wrkordr";

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "wrkorder_id", nullable = false, length = 75)
	private String workOrderID;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cntrct_id", nullable = false, insertable = false, updatable = false)
	private Contract contract;

	@Column(name = "wrkordr_code", nullable = false, length = 15)
	private String workorderCode;

	@Column(name = "wrkorder_name", nullable = false, length = 75)
	private String workorderName;

	@Column(name = "allow_expenses", nullable = false)
	private boolean allowExpenses;

	// start date
	@Column(name = "start_dt", nullable = false)
	private LocalDate startDate;

	// end date
	@Column(name = "end_dt", nullable = true)
	private LocalDate endDate;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "workOrder")
	private List<ContractWorkOrderRate> contractwoRate;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "workOrder")
	private List<ContractWorkOrderFP> contractwoFP;

	// List of Contract Work location historic data
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "workOrder")
	private List<ContractWorkLocation> contractWL;

	// List of Contract resources
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "workOrder")
	private List<ContractResource> contractResource;

	public String getWorkOrderID() {
		return workOrderID;
	}

	public void setWorkOrderID(String workOrderID) {
		this.workOrderID = workOrderID;
	}

	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}

	public String getWorkorderCode() {
		return workorderCode;
	}

	public void setWorkorderCode(String workorderCode) {
		this.workorderCode = workorderCode;
	}

	public String getWorkorderName() {
		return workorderName;
	}

	public void setWorkorderName(String workorderName) {
		this.workorderName = workorderName;
	}

	public boolean isAllowExpenses() {
		return allowExpenses;
	}

	public void setAllowExpenses(boolean allowExpenses) {
		this.allowExpenses = allowExpenses;
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

	public List<ContractWorkOrderRate> getContractwoRate() {
		return contractwoRate;
	}

	public void setContractwoRate(List<ContractWorkOrderRate> contractwoRate) {
		this.contractwoRate = contractwoRate;
	}

	public List<ContractWorkOrderFP> getContractwoFP() {
		return contractwoFP;
	}

	public void setContractwoFP(List<ContractWorkOrderFP> contractwoFP) {
		this.contractwoFP = contractwoFP;
	}

	public List<ContractWorkLocation> getContractWL() {
		return contractWL;
	}

	public void setContractWL(List<ContractWorkLocation> contractWL) {
		this.contractWL = contractWL;
	}

	public List<ContractResource> getContractResource() {
		return contractResource;
	}

	public void setContractResource(List<ContractResource> contractResource) {
		this.contractResource = contractResource;
	}
}
