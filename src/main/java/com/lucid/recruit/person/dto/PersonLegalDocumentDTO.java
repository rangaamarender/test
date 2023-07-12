package com.lucid.recruit.person.dto;

import java.util.Date;

public class PersonLegalDocumentDTO {
	private String id;
	private String legalDocumentID;
	private String value;
	private String description;
	private String schemeAgencyId;
	private String schemeLink;
	private String agencyUri;
	private String documentType;
	private String issuingAuthority;
	private Date issuedDt;
	private Date expirationDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLegalDocumentID() {
		return legalDocumentID;
	}

	public void setLegalDocumentID(String legalDocumentID) {
		this.legalDocumentID = legalDocumentID;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSchemeAgencyId() {
		return schemeAgencyId;
	}

	public void setSchemeAgencyId(String schemeAgencyId) {
		this.schemeAgencyId = schemeAgencyId;
	}

	public String getSchemeLink() {
		return schemeLink;
	}

	public void setSchemeLink(String schemeLink) {
		this.schemeLink = schemeLink;
	}

	public String getAgencyUri() {
		return agencyUri;
	}

	public void setAgencyUri(String agencyUri) {
		this.agencyUri = agencyUri;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getIssuingAuthority() {
		return issuingAuthority;
	}

	public void setIssuingAuthority(String issuingAuthority) {
		this.issuingAuthority = issuingAuthority;
	}

	public Date getIssuedDt() {
		return issuedDt;
	}

	public void setIssuedDt(Date issuedDt) {
		this.issuedDt = issuedDt;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

}
