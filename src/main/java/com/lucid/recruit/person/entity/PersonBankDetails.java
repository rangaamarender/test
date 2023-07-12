package com.lucid.recruit.person.entity;

import java.util.Date;

import com.lucid.core.entity.AuditableEntity;

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

@Entity
@Table(name = PersonBankDetails.TABLE_NAME, uniqueConstraints = @UniqueConstraint(name = "UQPRSNBank", columnNames = {
		"person_legal_id", "valid_from" }))
public class PersonBankDetails extends AuditableEntity {

	private static final long serialVersionUID = 7609349402750903434L;
	public static final String TABLE_NAME = "p_prsn_bank_details";

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "prsn_bank_details_id", nullable = false, length = 75)
	private String personBankDetailsID;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "person_legal_id", nullable = false, insertable = false, updatable = false)
	private PersonLegal personLegal;
	
	// The name of the person on the bank account
	@Column(name = "account_name", nullable = false)
	private String accountName;

	// The bank account number
	@Column(name = "account_number", nullable = false)
	private String accountNumber;

	// The bank account number
	@Column(name = "bank_name", nullable = false)
	private String bankName;

	// The bank branch name
	@Column(name = "branch_name", nullable = false)
	private String branchName;

	// The bank branch id
	@Column(name = "bank_id", nullable = false)
	private String bankID;

	// The bank routing number
	@Column(name = "routing_number", nullable = false)
	private String routingNumber;

	// The bank accountTyoe
	@Column(name = "account_type", nullable = false)
	private String accountType;
	
	@Column(name = "valid_from", nullable = false, updatable = false)
	private Date validFrom;

	@Column(name = "valid_to", nullable = false, updatable = false)
	private Date validTo;


	public PersonLegal getPersonLegal() {
		return personLegal;
	}

	public void setPersonLegal(PersonLegal personLegal) {
		this.personLegal = personLegal;
	}

	public Date getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}

	public Date getValidTo() {
		return validTo;
	}

	public void setValidTo(Date validTo) {
		this.validTo = validTo;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBankID() {
		return bankID;
	}

	public void setBankID(String bankID) {
		this.bankID = bankID;
	}

	public String getRoutingNumber() {
		return routingNumber;
	}

	public void setRoutingNumber(String routingNumber) {
		this.routingNumber = routingNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

}
