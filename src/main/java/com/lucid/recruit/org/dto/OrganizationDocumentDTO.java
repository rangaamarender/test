package com.lucid.recruit.org.dto;


import com.lucid.recruit.contract.dto.SignableUserDTO;
import com.lucid.recruit.docs.dto.BaseDocumentDTO;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class OrganizationDocumentDTO extends BaseDocumentDTO {
    private String organizationDocID;

    private String organizationID;

    //If document type is Monitorable we need expirationDate
    private LocalDate expirationDate;

    //if documentType is signable then weNeed multipleInd true or false
    private Boolean multipleInd;

    //if documentType is signable we need signableRequestable userDeatils

    private List<SignableUserDTO> signableUsers;

    private LocalDate issuedDt;
    private String docNumber;


    public String getOrganizationDocID() {
        return organizationDocID;
    }

    public void setOrganizationDocID(String contractDocID) {
        this.organizationDocID = contractDocID;
    }

    public String getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(String organizationID) {
        this.organizationID = organizationID;
    }

    public Boolean getMultipleInd() {
        return multipleInd;
    }

    public void setMultipleInd(Boolean multipleInd) {
        this.multipleInd = multipleInd;
    }

    public List<SignableUserDTO> getSignableUsers() {
        return signableUsers;
    }

    public void setSignableUsers(List<SignableUserDTO> signableUsers) {
        this.signableUsers = signableUsers;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }


    public LocalDate getIssuedDt() {
        return issuedDt;
    }

    public void setIssuedDt(LocalDate issuedDt) {
        this.issuedDt = issuedDt;
    }

    public String getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }
}
