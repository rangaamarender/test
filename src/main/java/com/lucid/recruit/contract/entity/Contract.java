/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.contract.entity;

import java.time.LocalDate;

import com.lucid.core.entity.AuditableEntity;
import com.lucid.recruit.contract.constants.EnumContractStatus;
import com.lucid.recruit.referencedata.entity.ContractType;

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
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/**
 * 
 * Contract entity allows to define the type of contract, WO/PAY Rates and
 * on-boards the resource to client
 *
 */
@Entity
@Table(name = Contract.TABLE_NAME)
public class Contract extends AuditableEntity {

	private static final long serialVersionUID = 1067742755203960531L;
	public static final String TABLE_NAME = "c_contract";

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "cntrct_id", nullable = false, length = 75)
	private String contractID;

	@Column(name = "cntrct_code", nullable = false, length = 25)
	private String contractCode;

	@Column(name = "cntrct_name", nullable = false, length = 50)
	private String contractName;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "c_msa_id", nullable = false, updatable = false)
	private ContractMSA contractMSA;

	@Column(name = "cntrct_notes", nullable = true, length = 2500)
	private String notes;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cntrct_type_id", nullable = false, updatable = false)
	private ContractType contractType;

	// Total estimated in hours
	@Column(name = "estimated_hours", nullable = false)
	private double estimatedHours;

	// Total estimated in budget in operating currency
	@Column(name = "estimated_budget", nullable = false)
	private double estimatedBudget;

	@Column(name = "start_dt", nullable = false)
	private LocalDate startDate;

	@Column(name = "end_dt", nullable = true)
	private LocalDate endDate;

	// status
	@Enumerated(EnumType.STRING)
	@Column(name = "cntrct_status", nullable = false, length = 15)
	private EnumContractStatus status;

	@Column(name = "multi_resource_boo", nullable = false)
	private boolean multiResource;

	@Column(name = "blended_rates_boo", nullable = false)
	private boolean blendedRates;

	// termination date
	@Column(name = "termination_dt", nullable = true)
	private LocalDate terminationDate;

	// end date
	@Column(name = "termination_code", nullable = true, length = 40)
	private String terminationCode;

	// notes
	@Column(name = "termination_reason_notes", nullable = true, length = 2500)
	private String terminationNotes;

	// Contract work order
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "contract")
	private ContractWorkOrder contractWorkOrder;

	// Contract pay profile
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "contract")
	private ContractSupervisor contractSupervisor;

	// Contract pay profile
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "contract")
	private ContractDocument contractDocument;

	public Contract() {
		super();
	}

	public String getContractID() {
		return contractID;
	}

	public void setContractID(String contractID) {
		this.contractID = contractID;
	}

	public String getContractCode() {
		return contractCode;
	}

	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}

	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public ContractMSA getContractMSA() {
		return contractMSA;
	}

	public void setContractMSA(ContractMSA contractMSA) {
		this.contractMSA = contractMSA;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public ContractType getContractType() {
		return contractType;
	}

	public void setContractType(ContractType contractType) {
		this.contractType = contractType;
	}

	public double getEstimatedHours() {
		return estimatedHours;
	}

	public void setEstimatedHours(double estimatedHours) {
		this.estimatedHours = estimatedHours;
	}

	public double getEstimatedBudget() {
		return estimatedBudget;
	}

	public void setEstimatedBudget(double estimatedBudget) {
		this.estimatedBudget = estimatedBudget;
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

	public EnumContractStatus getStatus() {
		return status;
	}

	public void setStatus(EnumContractStatus status) {
		this.status = status;
	}

	public boolean isMultiResource() {
		return multiResource;
	}

	public void setMultiResource(boolean multiResource) {
		this.multiResource = multiResource;
	}

	public boolean isBlendedRates() {
		return blendedRates;
	}

	public void setBlendedRates(boolean blendedRates) {
		this.blendedRates = blendedRates;
	}

	public LocalDate getTerminationDate() {
		return terminationDate;
	}

	public void setTerminationDate(LocalDate terminationDate) {
		this.terminationDate = terminationDate;
	}

	public String getTerminationCode() {
		return terminationCode;
	}

	public void setTerminationCode(String terminationCode) {
		this.terminationCode = terminationCode;
	}

	public String getTerminationNotes() {
		return terminationNotes;
	}

	public void setTerminationNotes(String terminationNotes) {
		this.terminationNotes = terminationNotes;
	}

	public ContractWorkOrder getContractWorkOrder() {
		return contractWorkOrder;
	}

	public void setContractWorkOrder(ContractWorkOrder contractWorkOrder) {
		this.contractWorkOrder = contractWorkOrder;
	}

	public ContractSupervisor getContractSupervisor() {
		return contractSupervisor;
	}

	public void setContractSupervisor(ContractSupervisor contractSupervisor) {
		this.contractSupervisor = contractSupervisor;
	}

	public ContractDocument getContractDocument() {
		return contractDocument;
	}

	public void setContractDocument(ContractDocument contractDocument) {
		this.contractDocument = contractDocument;
	}
}
