/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.person.entity;

import java.util.Date;

import com.lucid.core.entity.AuditableEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * 
 * Identifying information for a legal document, e.g. Passport, Visa, etc.
 * 
 * @author sgutti
 * @date 12-Feb-2023 4:48:16 pm
 *
 */
@Entity
@Table(name = PersonLegalDocument.TABLE_NAME)
public class PersonLegalDocument extends AuditableEntity {

	private static final long serialVersionUID = 7591561944068781281L;
	public static final String TABLE_NAME = "p_prsn_legal_doc";

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "legal_doc_id", nullable = false, length = 75)
	private String legalDocumentID;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "person_legal_id", nullable = false, insertable = false, updatable = false)
	private PersonLegal personLegal;

	// Identifying information for a legal document, e.g. Passport, Visa, etc.
	@Column(name = "legal_doc_value", nullable = false, length = 25)
	private String value;

	// The description of the identifier.
	@Column(name = "description", nullable = false, length = 200)
	private String description;

	// The identification of the agency that manages the identifier scheme.
	@Column(name = "schema_agency_id", nullable = true, length = 50)
	private String schemeAgencyId;

	// he URI that identifies where the identification scheme data is located.
	@Column(name = "scheme_link", nullable = true, length = 400)
	private String schemeLink;

	// The URI that identifies where the identification scheme is located.
	@Column(name = "agency_uri", nullable = true, length = 400)
	private String agencyUri;

	// The type of document, e.g. SSN, Passport, Visa, National Registration Card.
	@Column(name = "document_type", nullable = true, length = 50)
	private String documentType;

	// The name of the organization that issued the document. E.g. American
	// Consulate, UK Passport
	// Authority.
	@Column(name = "issuing_authority", nullable = true, length = 100)
	private String issuingAuthority;

	// The date the document was issued.
	@Column(name = "issued_dt", nullable = true)
	private Date issuedDt;

	// The date the document expires.
	@Column(name = "expiration_dt", nullable = true)
	private Date expirationDate;

	// ------------------------------------------------------------ Constructors
	/**
	 * Create a new <code>LegalDocument</code>
	 */
	public PersonLegalDocument() {
		super();
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
