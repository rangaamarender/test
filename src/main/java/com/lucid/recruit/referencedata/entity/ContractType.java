package com.lucid.recruit.referencedata.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * 
 * Reference Data Entity to configure Contract Type, Contract Types like Long
 * term, Mid term, Short term represent duration of the contract.
 *
 */
@Entity
@Table(name = ContractType.TABLE_NAME)
public class ContractType {
	public static final String TABLE_NAME = "ref_contract_type";

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "cntrct_type_id", nullable = false, updatable = false)
	private String contractTypeID;

	@Column(name = "cntrct_type_name", nullable = false, updatable = false)
	private String contractTypeName;

	@Column(name = "cntrct_type_desc", nullable = true)
	private String contractTypeDesc;

	public ContractType() {
		super();
	}

	public String getContractTypeID() {
		return contractTypeID;
	}

	public void setContractTypeID(String contractTypeID) {
		this.contractTypeID = contractTypeID;
	}

	public String getContractTypeName() {
		return contractTypeName;
	}

	public void setContractTypeName(String contractTypeName) {
		this.contractTypeName = contractTypeName;
	}

	public String getContractTypeDesc() {
		return contractTypeDesc;
	}

	public void setContractTypeDesc(String contractTypeDesc) {
		this.contractTypeDesc = contractTypeDesc;
	}

}
