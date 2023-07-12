/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.contract.entity;

import java.time.LocalDate;

import com.lucid.core.embeddable.Amount;
import com.lucid.core.entity.AuditableEntity;
import com.lucid.recruit.contract.constants.EnumRateCategory;
import com.lucid.recruit.contract.constants.EnumRateUnits;
import com.lucid.recruit.referencedata.entity.ContractOrderType;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
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

@Entity
@Table(name = ContractPayProfileRate.TABLE_NAME, uniqueConstraints = {
		@UniqueConstraint(name = "UQ_CNTRCTPPR_IDSDWTYPE", columnNames = { "cntrct_pp_id", "start_dt", "category" }) })
public class ContractPayProfileRate extends AuditableEntity {

	private static final long serialVersionUID = -8734089172619443722L;
	public static final String TABLE_NAME = "c_cntrct_payprofile_rate";

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "cntrct_pp_rate_id", nullable = false, length = 75)
	private String contractPayProfileRateID;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cntrct_pp_id", nullable = false, insertable = false, updatable = false)
	private ContractPayProfile payProfile;

	@Column(name = "start_dt", nullable = false)
	private LocalDate startDate;

	@Column(name = "end_dt", nullable = true)
	private LocalDate endDate;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "pp_type_id", nullable = false, updatable = false)
	private ContractOrderType payProfileType;

	@Enumerated(EnumType.STRING)
	@Column(name = "category", nullable = false, updatable = false)
	private EnumRateCategory category;

	@Enumerated(EnumType.STRING)
	@Column(name = "rate_type", nullable = false, length = 25)
	private EnumRateUnits rateType;

	@Embedded
	private Amount rateMny;

	public String getContractPayProfileRateID() {
		return contractPayProfileRateID;
	}

	public void setContractPayProfileRateID(String contractPayProfileRateID) {
		this.contractPayProfileRateID = contractPayProfileRateID;
	}

	public ContractPayProfile getPayProfile() {
		return payProfile;
	}

	public void setPayProfile(ContractPayProfile payProfile) {
		this.payProfile = payProfile;
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

	public ContractOrderType getPayProfileType() {
		return payProfileType;
	}

	public void setPayProfileType(ContractOrderType payProfileType) {
		this.payProfileType = payProfileType;
	}

	public EnumRateCategory getCategory() {
		return category;
	}

	public void setCategory(EnumRateCategory category) {
		this.category = category;
	}

	public EnumRateUnits getRateType() {
		return rateType;
	}

	public void setRateType(EnumRateUnits rateType) {
		this.rateType = rateType;
	}

	public Amount getRateMny() {
		return rateMny;
	}

	public void setRateMny(Amount rateMny) {
		this.rateMny = rateMny;
	}

}
