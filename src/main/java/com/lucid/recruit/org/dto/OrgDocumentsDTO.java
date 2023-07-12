package com.lucid.recruit.org.dto;

import com.lucid.recruit.docs.dto.BaseDocumentDTO;
import com.lucid.recruit.docs.dto.DocumentDefDTO;

import java.time.LocalDate;
import java.util.Date;

public class OrgDocumentsDTO extends BaseDocumentDTO {
    private String orgDocumentID;

    private DocumentDefDTO documentDef;

    // document number
    private String docNumber;

    // The date the document was issued.
    private LocalDate issuedDt;

    // The date the document expires.
    private LocalDate expirationDate;
    //documentName name
    private String documentName;

    public String orgDocumentID() {
        return orgDocumentID;
    }

    public OrgDocumentsDTO setOrgDocumentID(String orgDocumentID) {
        this.orgDocumentID = orgDocumentID;
        return this;
    }


    public DocumentDefDTO documentDef() {
        return documentDef;
    }

    public OrgDocumentsDTO setDocumentDef(DocumentDefDTO documentDef) {
        this.documentDef = documentDef;
        return this;
    }

    public String docNumber() {
        return docNumber;
    }

    public OrgDocumentsDTO setDocNumber(String docNumber) {
        this.docNumber = docNumber;
        return this;
    }

    public String getOrgDocumentID() {
        return orgDocumentID;
    }

    public DocumentDefDTO getDocumentDef() {
        return documentDef;
    }

    public String getDocNumber() {
        return docNumber;
    }

    public LocalDate getIssuedDt() {
        return issuedDt;
    }

    public void setIssuedDt(LocalDate issuedDt) {
        this.issuedDt = issuedDt;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }
}
