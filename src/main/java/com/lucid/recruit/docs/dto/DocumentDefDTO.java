package com.lucid.recruit.docs.dto;

import com.lucid.core.dto.BaseDTO;
import jakarta.persistence.Column;

public class DocumentDefDTO extends BaseDTO {

    private String documentDefID;

    // Signable,Uploaded,Monitor,Download
    private String documentType;

    // Standard name given to the document name by system
    private String documentName;

    // unique code for document referred in the system like W9-FORM etc
    private String documentInternalCode;

    // Document is active/inactive/discarded in the system
    private Integer status;

    // Document is 1- Internal Only, 2 - Tenant Only, 3 - EndUser Only
    private Integer documentScope;

    // Document can be access by WHOM
    private Integer documentAccessability;

    // associated entity like EMPLOYEE,CONTRACT etc
    private String relatedType;

    // associated relatedSubType for an relatedType like W2C,C2C,1099
    private String relatedSubType;

    public String documentDefID() {
        return documentDefID;
    }

    public DocumentDefDTO setDocumentDefID(String documentDefID) {
        this.documentDefID = documentDefID;
        return this;
    }

    public String documentType() {
        return documentType;
    }

    public DocumentDefDTO setDocumentType(String documentType) {
        this.documentType = documentType;
        return this;
    }

    public String documentName() {
        return documentName;
    }

    public DocumentDefDTO setDocumentName(String documentName) {
        this.documentName = documentName;
        return this;
    }

    public String documentInternalCode() {
        return documentInternalCode;
    }

    public DocumentDefDTO setDocumentInternalCode(String documentInternalCode) {
        this.documentInternalCode = documentInternalCode;
        return this;
    }

    public Integer status() {
        return status;
    }

    public DocumentDefDTO setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Integer documentScope() {
        return documentScope;
    }

    public DocumentDefDTO setDocumentScope(Integer documentScope) {
        this.documentScope = documentScope;
        return this;
    }

    public Integer documentAccessability() {
        return documentAccessability;
    }

    public DocumentDefDTO setDocumentAccessability(Integer documentAccessability) {
        this.documentAccessability = documentAccessability;
        return this;
    }

    public String relatedType() {
        return relatedType;
    }

    public DocumentDefDTO setRelatedType(String relatedType) {
        this.relatedType = relatedType;
        return this;
    }

    public String relatedSubType() {
        return relatedSubType;
    }

    public DocumentDefDTO setRelatedSubType(String relatedSubType) {
        this.relatedSubType = relatedSubType;
        return this;
    }
}
