package com.lucid.recruit.contract.entity;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class ContractMSADetailsID implements Serializable {

	private static final long serialVersionUID = 554753269722705200L;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "c_msa_id", nullable = false, updatable = false)
	private ContractMSA contractMSA;

	// start date
	@Column(name = "start_dt", nullable = false)
	private LocalDate startDate;

	public ContractMSA getContractMSA() {
		return contractMSA;
	}

	public void setContractMSA(ContractMSA contractMSA) {
		this.contractMSA = contractMSA;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

}
