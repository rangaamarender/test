package com.lucid.recruit.org.dto;

import com.lucid.core.dto.BaseAddressDTO;
import com.lucid.recruit.org.entity.OrgCommunication;

import java.time.LocalDate;
import java.util.Date;

public class OrgAddressDTO extends BaseAddressDTO {

    private String orgAddressID;

    private OrgCommunicationDTO orgCMNC;

    private LocalDate startDate;

    private LocalDate endDate;

    public OrgAddressDTO() {
        super();
    }

    public String orgAddressID() {
        return orgAddressID;
    }

    public OrgAddressDTO setOrgAddressID(String orgAddressID) {
        this.orgAddressID = orgAddressID;
        return this;
    }

    public OrgCommunicationDTO orgCMNC() {
        return orgCMNC;
    }

    public OrgAddressDTO setOrgCMNC(OrgCommunicationDTO orgCMNC) {
        this.orgCMNC = orgCMNC;
        return this;
    }


    public String getOrgAddressID() {
        return orgAddressID;
    }

    public OrgCommunicationDTO getOrgCMNC() {
        return orgCMNC;
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
}
