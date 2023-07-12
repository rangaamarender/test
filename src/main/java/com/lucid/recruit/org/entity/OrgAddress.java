/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.org.entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.Optional;

import com.lucid.core.entity.BaseAddress;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = OrgAddress.TABLE_NAME)
public class OrgAddress extends BaseAddress {

	// --------------------------------------------------------------- Constants
	private static final long serialVersionUID = -3047943864801805071L;
	public static final String TABLE_NAME = "o_org_addr";

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "org_address_id", nullable = false, length = 75)
	private String orgAddressID;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "organizationID", insertable = false, updatable = false)
	private Organization organization;

	@Column(name = "start_date", nullable = false)
	private LocalDate startDate;

	@Column(name = "end_date", nullable = true)
	private LocalDate endDate;

	public OrgAddress() {
	}

	public String getOrgAddressID() {
		return orgAddressID;
	}

	public void setOrgAddressID(String orgAddressID) {
		this.orgAddressID = orgAddressID;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
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

    public void setOrganization(Optional<Organization> organization) {
    }

	/*@Override
	public String toString() {
		return "OrgAddress [orgAddressID=" + orgAddressID + ", organization=" + organization + ", startDate="
				+ startDate + ", endDate=" + endDate + "]";
	}*/
    
    
}
