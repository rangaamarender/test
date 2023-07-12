package com.lucid.recruit.org.dto;

import com.lucid.core.dto.BaseDTO;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class OrgSummaryDTO extends BaseDTO {

    private String organizationID;

    private String name;

    private String orgRoles;

    private String location;

    private String ceoName;

    private String ceoPhone;

    private LocalDate createdOn;

    public OrgSummaryDTO(){
        super();
    }

    public String getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(String organizationID) {
        this.organizationID = organizationID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrgRoles() {
        return orgRoles;
    }

    public void setOrgRoles(String orgRoles) {
        this.orgRoles = orgRoles;
    }

    public String location() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String ceoName() {
        return ceoName;
    }

    public void setCeoName(String ceoName) {
        this.ceoName = ceoName;
    }

    public String ceoPhone() {
        return ceoPhone;
    }

    public void setCeoPhone(String ceoPhone) {
        this.ceoPhone = ceoPhone;
    }

    public LocalDate createdOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDate createdOn) {
        this.createdOn = createdOn;
    }

}
