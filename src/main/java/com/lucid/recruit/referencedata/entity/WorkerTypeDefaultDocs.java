package com.lucid.recruit.referencedata.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

/**
 * Worker Type default type docs ref data *
 * 
 * @author chandu *
 */
@Entity
@Table(name = WorkerTypeDefaultDocs.TABLE_NAME)
@IdClass(WrkTypeDefDocsID.class)
public class WorkerTypeDefaultDocs {
	public static final String TABLE_NAME = "ref_wrktype_defdocs";

	@Id
	@Column(name = "worker_type_code", nullable = false)
	private String workerTypeCode;

	@Id
	@Column(name = "doc_def_id", nullable = false)
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
