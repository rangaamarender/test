package com.lucid.recruit.org.entity;

import java.time.LocalDate;
import java.util.Date;

public class OrgRoleID {
	private Organization organization;
	private OrgRoleEnum role;
	private LocalDate startDate;

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

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

}
