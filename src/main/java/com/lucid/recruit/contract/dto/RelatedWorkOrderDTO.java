package com.lucid.recruit.contract.dto;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotNull;

/***
 * 
 * DTO represent the related work order
 *
 */
public class RelatedWorkOrderDTO {
	@NotNull
	private String workOrderID;
	@Nullable
	private String workorderName;
	@Nullable
	private String workorderCode;
	@Nullable
	private RelatedContractDTO contract;

	public String getWorkOrderID() {
		return workOrderID;
	}

	public void setWorkOrderID(String workOrderID) {
		this.workOrderID = workOrderID;
	}

	public String getWorkorderName() {
		return workorderName;
	}

	public void setWorkorderName(String workorderName) {
		this.workorderName = workorderName;
	}

	public String getWorkorderCode() {
		return workorderCode;
	}

	public void setWorkorderCode(String workorderCode) {
		this.workorderCode = workorderCode;
	}

	public RelatedContractDTO getContract() {
		return contract;
	}

	public void setContract(RelatedContractDTO contract) {
		this.contract = contract;
	}

}
