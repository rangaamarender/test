package com.lucid.recruit.referencedata.entity;

import java.io.Serializable;

public class WrkTypeDefDocsID implements Serializable {

	private static final long serialVersionUID = 1529375883940886306L;
	private String workerTypeCode;
	private String documentDef;

	public String getWorkerTypeCode() {
		return workerTypeCode;
	}

	public void setWorkerTypeCode(String workerTypeCode) {
		this.workerTypeCode = workerTypeCode;
	}

	public String getDocumentDef() {
		return documentDef;
	}

	public void setDocumentDef(String documentDef) {
		this.documentDef = documentDef;
	}

}
