package com.lucid.recruit.org.entity;

import java.time.LocalDate;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.lucid.core.entity.AuditableEntity;
import com.lucid.recruit.docs.entity.BaseDocument;
import com.lucid.recruit.docs.entity.DocumentDef;

import jakarta.persistence.*;

import javax.swing.text.Document;


/**
 * Documents uploaded by Organization
 *
 * @author chandu
 *
 */

@Entity
@Table(name = OrgDocuments.TABLE_NAME)
@JsonIgnoreProperties({"orgDocumentID", "organization", "documentDef", "docNumber", "issuedDt", "expirationDate"})
public class OrgDocuments extends BaseDocument {

	private static final long serialVersionUID = -2340269968217843623L;
	public static final String TABLE_NAME = "o_org_documents";

	@Id
	@Column(name = "org_doc_id", nullable = false, length = 75)
	@GeneratedValue(strategy = GenerationType.UUID)
	private String orgDocumentID;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "org_id", nullable = false, updatable = false,insertable = false)
	private Organization organization;

	@JoinColumn(name = "doc_def_id", nullable = false, updatable = false)
	private DocumentDef documentDef;

	// document number
	@Column(name = "doc_number", nullable = false, length = 25)
	private String docNumber;


	public String getOrgDocumentID() {
		return orgDocumentID;
	}

	public void setOrgDocumentID(String orgDocumentID) {
		this.orgDocumentID = orgDocumentID;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public DocumentDef getDocumentDef() {
		return documentDef;
	}

	public void setDocumentDef(DocumentDef documentDef) {
		this.documentDef = documentDef;
	}

	public String getDocNumber() {
		return docNumber;
	}

	public void setDocNumber(String docNumber) {
		this.docNumber = docNumber;
	}


}
