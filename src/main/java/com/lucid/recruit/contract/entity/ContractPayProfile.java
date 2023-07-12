/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.contract.entity;

import java.util.List;

import com.lucid.core.entity.AuditableEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = ContractPayProfile.TABLE_NAME)
public class ContractPayProfile extends AuditableEntity {

	// --------------------------------------------------------------- Constants
	private static final long serialVersionUID = -8734089172619443722L;
	public static final String TABLE_NAME = "c_cntrct_payprofile";

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "cntrct_pp_id", nullable = false, length = 75)
	private String contractPayProfileID;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cntrct_resrc_id", nullable = false, insertable = false, updatable = false)
	private ContractResource contractResource;

	@Column(name = "pp_code", nullable = false, length = 15)
	private String payProfileCode;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "payProfile")
	private List<ContractPayProfileRate> payProfileRate;

	public String getContractPayProfileID() {
		return contractPayProfileID;
	}

	public void setContractPayProfileID(String contractPayProfileID) {
		this.contractPayProfileID = contractPayProfileID;
	}

	public ContractResource getContractResource() {
		return contractResource;
	}

	public void setContractResource(ContractResource contractResource) {
		this.contractResource = contractResource;
	}

	public String getPayProfileCode() {
		return payProfileCode;
	}

	public void setPayProfileCode(String payProfileCode) {
		this.payProfileCode = payProfileCode;
	}

	public List<ContractPayProfileRate> getPayProfileRate() {
		return payProfileRate;
	}

	public void setPayProfileRate(List<ContractPayProfileRate> payProfileRate) {
		this.payProfileRate = payProfileRate;
	}

}
