package com.lucid.recruit.org.entity;

import java.util.Date;

/**
 * Roles of Orginization 
 * 
 * @author chandu
 *
 */

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = OrgRole.TABLE_NAME)
@IdClass(OrgRoleID.class)
public class OrgRole {
	public static final String TABLE_NAME = "o_org_role";

	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "org_id", nullable = false, updatable = false)
	private Organization organization;

	@Id
	@Column(name = "org_role", nullable = false, updatable = false)
	@Enumerated(EnumType.STRING)
	private OrgRoleEnum role;


	@Id
	@Column(name = "start_dat", nullable = false)
	private Date startDate;


	@Column(name = "end_dat", nullable = true)
	private Date endDate;


	@Column(name = "status", nullable = false)
	@Enumerated(EnumType.STRING)

	private orgRoleStatus status;


	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public OrgRoleEnum getRole() {
		return role;
	}

	public void setRole(OrgRoleEnum role) {
		this.role = role;
	}

	public orgRoleStatus getStatus() {
		return status;
	}

	public void setStatus(orgRoleStatus status) {
		this.status = status;
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

}

enum orgRoleStatus {
	ACTIVE, INACTIVE
}

enum OrgRoleEnum {
	CLIENT, VENDOR, GATEKEEPER;
}