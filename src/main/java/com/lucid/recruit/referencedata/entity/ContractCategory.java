package com.lucid.recruit.referencedata.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * 
 * Reference Data Entity to configure Contract Categories, Contract Categories
 * like Fixed-price contract, Time and materials contract, Unit price contract
 * etc...
 *
 */
@Entity
@Table(name = ContractCategory.TABLE_NAME)
public class ContractCategory {
	public static final String TABLE_NAME = "ref_contract_category";

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "cntrct_category_id", nullable = false, updatable = false)
	private String contractCategoryID;

	@Column(name = "cntrct_category_name", nullable = false, updatable = false)
	private String contractCategoryName;

	@Column(name = "cntrct_category_desc", nullable = true)
	private String contractCategoryDesc;

	public ContractCategory() {
		super();
	}

	public String getContractCategoryID() {
		return contractCategoryID;
	}

	public void setContractCategoryID(String contractCategoryID) {
		this.contractCategoryID = contractCategoryID;
	}

	public String getContractCategoryName() {
		return contractCategoryName;
	}

	public void setContractCategoryName(String contractCategoryName) {
		this.contractCategoryName = contractCategoryName;
	}

	public String getContractCategoryDesc() {
		return contractCategoryDesc;
	}

	public void setContractCategoryDesc(String contractCategoryDesc) {
		this.contractCategoryDesc = contractCategoryDesc;
	}

}
