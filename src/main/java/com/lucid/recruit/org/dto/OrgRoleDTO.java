package com.lucid.recruit.org.dto;

import com.lucid.core.dto.BaseDTO;

import com.lucid.recruit.org.entity.Organization;

import java.time.LocalDate;
import java.util.Date;

public class OrgRoleDTO extends BaseDTO {

    private orgRoleStatus status;
    private Date endDate;
    private Date startDate;
    private OrgRoleEnum role;
    private Organization organization;

    public orgRoleStatus getStatus() {
        return status;
    }

    public void setStatus(orgRoleStatus status) {
        this.status = status;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public OrgRoleEnum getRole() {
        return role;
    }

    public void setRole(OrgRoleEnum role) {
        this.role = role;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }


    enum orgRoleStatus {
        ACTIVE, INACTIVE
    }

    enum OrgRoleEnum {
        CLIENT, VENDOR, GATEKEEPER;
    }
}
