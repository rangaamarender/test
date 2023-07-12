package com.lucid.recruit.referencedata.dto;

import com.lucid.recruit.docs.entity.dto.DocumentDefDTO;

public class WorkerTypeDefaultDocsDTO {
	private WorkerTypeDTO workerType;
	private DocumentDefDTO documentDef;

	public WorkerTypeDefaultDocsDTO() {
		super();
	}

	public WorkerTypeDefaultDocsDTO(WorkerTypeDTO workerType, DocumentDefDTO documentDef) {
		super();
		this.workerType = workerType;
		this.documentDef = documentDef;
	}

	public WorkerTypeDTO getWorkerType() {
		return workerType;
	}

	public void setWorkerType(WorkerTypeDTO workerType) {
		this.workerType = workerType;
	}

	public DocumentDefDTO getDocumentDef() {
		return documentDef;
	}

	public void setDocumentDef(DocumentDefDTO documentDef) {
		this.documentDef = documentDef;
	}

}
