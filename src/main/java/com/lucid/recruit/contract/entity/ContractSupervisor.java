package com.lucid.recruit.contract.entity;

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
import jakarta.validation.constraints.Email;

@Entity
@Table(name = ContractSupervisor.TABLE_NAME)
public class ContractSupervisor extends AuditableEntity {

	private static final long serialVersionUID = -286472131363904229L;
	public static final String TABLE_NAME = "c_cntrct_supervisor";

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "cntrct_supr_id", nullable = false, length = 75)
	private String contractSupervisorID;

	@Column(name = "start_dat", nullable = false)
	private Date startDate;

	@Column(name = "end_dat", nullable = true)
	private Date endDate;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cntrct_id", nullable = false, updatable = false)
	private Contract contract;

	@Column(name = "supr_fn", nullable = false, length = 100)
	private String firstName;

	@Column(name = "supr_ln", nullable = false, length = 100)
	private String lastName;

	@Email
	@Column(name = "supr_email", nullable = false, length = 100)
	private String email;

	@Column(name = "supr_phone", nullable = false, length = 20)
	private String phone;


	public String getContractSupervisorID() {
		return contractSupervisorID;
	}

	public void setContractSupervisorID(String contractSupervisorID) {
		this.contractSupervisorID = contractSupervisorID;
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

	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
