package com.lucid.recruit.docs.entity.dto;

/**
 * 
 * @author chandu
 *
 */
public class DocumentDefDTO {
	private String documentDefID;
	private String documentType;
	private String documentName;
	private String documentInternalCode;
	private Integer status;
	private Integer documentScope;
	private Integer documentAccessability;

	public DocumentDefDTO() {
		super();
	}

	public DocumentDefDTO(String documentDefID, String documentType, String documentName, String documentInternalCode,
			Integer status, Integer documentScope, Integer documentAccessability) {
		super();
		this.documentDefID = documentDefID;
		this.documentType = documentType;
		this.documentName = documentName;
		this.documentInternalCode = documentInternalCode;
		this.status = status;
		this.documentScope = documentScope;
		this.documentAccessability = documentAccessability;
	}

	public String getDocumentDefID() {
		return documentDefID;
	}

	public void setDocumentDefID(String documentDefID) {
		this.documentDefID = documentDefID;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getDocumentName() {
		return documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	public String getDocumentInternalCode() {
		return documentInternalCode;
	}

	public void setDocumentInternalCode(String documentInternalCode) {
		this.documentInternalCode = documentInternalCode;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getDocumentScope() {
		return documentScope;
	}

	public void setDocumentScope(Integer documentScope) {
		this.documentScope = documentScope;
	}

	public Integer getDocumentAccessability() {
		return documentAccessability;
	}

	public void setDocumentAccessability(Integer documentAccessability) {
		this.documentAccessability = documentAccessability;
	}

}
