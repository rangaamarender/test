/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.docs.entity;

import java.util.Date;

import com.lucid.core.entity.AuditableEntity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

/**
 * @author sgutti
 * @date 09-Apr-2023 11:30:59 am
 *
 */
@MappedSuperclass
public abstract class BaseDocument extends AuditableEntity {
	// --------------------------------------------------------------- Constants
	private static final long serialVersionUID = 8085608713400344403L;

	// --------------------------------------------------------- Class Variables
	// ----------------------------------------------------- Static Initializers
	// ------------------------------------------------------ Instance Variables
	// Type of document like Signable, monitor,upload
	@Column(name = "doc_type", nullable = false, length = 25)
	private String documentType;

	// Standard name given to the document name by system
	@Column(name = "doc_name", nullable = false, length = 50)
	private String documentName;

	// Document code from external system like tax exempt doc #,tax # etc
	@Column(name = "external_doc_code", nullable = true, length = 50)
	private String externalDocCode;

	// End user specified name if any for the document,if not specified it would be
	// same as
	// documentName
	@Column(name = "doc_label", nullable = true, length = 50)
	private String documentLabel;

	// Provision to create a tag for the document to group the documents
	@Column(name = "doc_tag", nullable = true, length = 25)
	private String documentTag;

	// Document file type, pdf, excel, xml etc
	@Column(name = "file_type", nullable = false, length = 25)
	private String fileType;

	// Document file extension
	@Column(name = "file_ext", nullable = false, length = 25)
	private String fileExt;

	// Document path in the CDN system
	@Column(name = "url", nullable = false, length = 500)
	private String url;

	// Document source like SYSTEM (loaded), DOCSIGN etc
	@Column(name = "doc_source", nullable = false, length = 25)
	private String documentSource;

	// Document is active/inactive/discarded in the system
	@Column(name = "status", nullable = false)
	private Integer status;

	// Reference to the document definition ID
	@Column(name = "doc_def_id", nullable = false, length = 75)
	private String documentDefID;

	// The date the document was issued.
	@Column(name = "issued_dt", nullable = true)
	private Date issuedDt;

	// The date the document expires.
	@Column(name = "expiration_dt", nullable = true)
	private Date expirationDate;

	// ------------------------------------------------------------ Constructors
	/**
	 * Create a new <code>BaseDocument</code>
	 */
	public BaseDocument() {
		super();
	}

	// ---------------------------------------------------------- Public Methods

	/**
	 * @return documentType
	 */
	public String getDocumentType() {
		return documentType;
	}

	/**
	 * @param documentType
	 */
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	/**
	 * @return documentName
	 */
	public String getDocumentName() {
		return documentName;
	}

	/**
	 * @param documentName
	 */
	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	/**
	 * @return externalDocCode
	 */
	public String getExternalDocCode() {
		return externalDocCode;
	}

	/**
	 * @param externalDocCode
	 */
	public void setExternalDocCode(String externalDocCode) {
		this.externalDocCode = externalDocCode;
	}

	/**
	 * @return documentLabel
	 */
	public String getDocumentLabel() {
		return documentLabel;
	}

	/**
	 * @param documentLabel
	 */
	public void setDocumentLabel(String documentLabel) {
		this.documentLabel = documentLabel;
	}

	/**
	 * @return documentTag
	 */
	public String getDocumentTag() {
		return documentTag;
	}

	/**
	 * @param documentTag
	 */
	public void setDocumentTag(String documentTag) {
		this.documentTag = documentTag;
	}

	/**
	 * @return fileType
	 */
	public String getFileType() {
		return fileType;
	}

	/**
	 * @param fileType
	 */
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	/**
	 * @return fileExt
	 */
	public String getFileExt() {
		return fileExt;
	}

	/**
	 * @param fileExt
	 */
	public void setFileExt(String fileExt) {
		this.fileExt = fileExt;
	}

	/**
	 * @return
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return documentSource
	 */
	public String getDocumentSource() {
		return documentSource;
	}

	/**
	 * @param documentSource
	 */
	public void setDocumentSource(String documentSource) {
		this.documentSource = documentSource;
	}

	/**
	 * @return status
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * @param status
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * @return documentDefID
	 */
	public String getDocumentDefID() {
		return documentDefID;
	}

	/**
	 * @param documentDefID
	 */
	public void setDocumentDefID(String documentDefID) {
		this.documentDefID = documentDefID;
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
