/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.contract.entity;

import java.time.LocalDate;

import com.lucid.core.entity.AuditableEntity;
import com.lucid.recruit.contract.constants.EnumContractStatus;
import com.lucid.recruit.org.entity.Organization;

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
import jakarta.persistence.UniqueConstraint;

/**
 * 
 * Table holds details of MSA
 */
@Entity
@Table(name = ContractMSA.TABLE_NAME, uniqueConstraints = {
		@UniqueConstraint(name = "UQ_CMSAWC", columnNames = { "wbs_code" }) })
public class ContractMSA extends AuditableEntity {

	private static final long serialVersionUID = -9066543402704476240L;

	public static final String TABLE_NAME = "c_contract_msa";

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "c_msa_id", nullable = false, updatable = false, length = 75)
	private String contractMSAID;

	// Name (title) of the MSA
	@Column(name = "c_msa_name", nullable = false, updatable = false, length = 255)
	private String contractMSAName;

	// Client organization id
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "client_id", referencedColumnName = "org_id", nullable = false, updatable = false)
	private Organization clientOrg;

	// End client organization id, null if end client is not there
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "end_client_id", referencedColumnName = "org_id", nullable = true, updatable = false)
	private Organization endClientOrg;

	// WBS code, unique for each MSA
	@Column(name = "wbs_code", nullable = false, updatable = false, length = 50)
	private String wbsCode;

	// start date
	@Column(name = "start_dt", nullable = false)
	private LocalDate startDate;

	// end date
	@Column(name = "end_dt", nullable = true)
	private LocalDate endDate;

	// end date
	@Column(name = "billing_curr_code", nullable = false, updatable = false, length = 3)
	private String billingCurrencyCode;

	// notes
	@Column(name = "notes", nullable = true, length = 2500)
	private String notes;

	// MSA status
	@Enumerated(EnumType.STRING)
	@Column(name = "c_msa_status", nullable = false)
	private EnumContractStatus status;

	// termination date
	@Column(name = "termination_dt", nullable = true)
	private LocalDate terminationDate;

	// end date
	@Column(name = "termination_code", nullable = true, length = 40)
	private String terminationCode;

	// notes
	@Column(name = "termination_reason_notes", nullable = true, length = 2500)
	private String terminationNotes;

	public String getContractMSAID() {
		return contractMSAID;
	}

	public void setContractMSAID(String contractMSAID) {
		this.contractMSAID = contractMSAID;
	}

	public String getContractMSAName() {
		return contractMSAName;
	}

	public void setContractMSAName(String contractMSAName) {
		this.contractMSAName = contractMSAName;
	}

	public Organization getClientOrg() {
		return clientOrg;
	}

	public void setClientOrg(Organization clientOrg) {
		this.clientOrg = clientOrg;
	}

	public Organization getEndClientOrg() {
		return endClientOrg;
	}

	public void setEndClientOrg(Organization endClientOrg) {
		this.endClientOrg = endClientOrg;
	}

	public String getWbsCode() {
		return wbsCode;
	}

	public void setWbsCode(String wbsCode) {
		this.wbsCode = wbsCode;
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

	public String getBillingCurrencyCode() {
		return billingCurrencyCode;
	}

	public void setBillingCurrencyCode(String billingCurrencyCode) {
		this.billingCurrencyCode = billingCurrencyCode;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public EnumContractStatus getStatus() {
		return status;
	}

	public void setStatus(EnumContractStatus status) {
		this.status = status;
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
}
