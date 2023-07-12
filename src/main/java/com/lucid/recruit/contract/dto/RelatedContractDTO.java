package com.lucid.recruit.contract.dto;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotNull;

/***
 * 
 * DTO represent the related contract
 *
 */
public class RelatedContractDTO {
	@NotNull
	private String contractID;
	@Nullable
	private String contractName;

	public String getContractID() {
		return contractID;
	}

	public void setContractID(String contractID) {
		this.contractID = contractID;
	}

	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

}
