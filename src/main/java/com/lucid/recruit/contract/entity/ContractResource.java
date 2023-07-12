/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.contract.entity;

import com.lucid.core.entity.AuditableEntity;
import com.lucid.recruit.referencedata.entity.WorkerType;
import com.lucid.recruit.worker.entity.Worker;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;

@Entity
@Table(name = ContractResource.TABLE_NAME)
public class ContractResource extends AuditableEntity {

	private static final long serialVersionUID = 1050096144385248029L;
	public static final String TABLE_NAME = "c_cntrct_resource";
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "cntrct_resrc_id", nullable = false, length = 75)
	private String contractresID;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "wrkorder_id", nullable = false, insertable = false, updatable = false)
	private ContractWorkOrder workOrder;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "worker_id", nullable = false, insertable = false, updatable = false)
	private Worker worker;

	// The relationship of the worker to the organization.
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "worker_type_code", nullable = false)
	private WorkerType workerType;

	@Column(name = "work_email", nullable = false, length = 200)
	@Email
	private String workEmail;

	@Column(name = "work_phone", nullable = false, length = 25)
	private String workPhone;

	@Column(name = "remote_wrk_loc", nullable = false)
	private boolean remotewrkLoc;

	@OneToOne(mappedBy = "contractResource")
	private ContractPayProfile payProfile;

	public String getContractresID() {
		return contractresID;
	}

	public void setContractresID(String contractresID) {
		this.contractresID = contractresID;
	}

	public ContractWorkOrder getWorkOrder() {
		return workOrder;
	}

	public void setWorkOrder(ContractWorkOrder workOrder) {
		this.workOrder = workOrder;
	}

	public Worker getWorker() {
		return worker;
	}

	public void setWorker(Worker worker) {
		this.worker = worker;
	}

	public WorkerType getWorkerType() {
		return workerType;
	}

	public void setWorkerType(WorkerType workerType) {
		this.workerType = workerType;
	}

	public String getWorkEmail() {
		return workEmail;
	}

	public void setWorkEmail(String workEmail) {
		this.workEmail = workEmail;
	}

	public String getWorkPhone() {
		return workPhone;
	}

	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}

	public boolean isRemotewrkLoc() {
		return remotewrkLoc;
	}

	public void setRemotewrkLoc(boolean remotewrkLoc) {
		this.remotewrkLoc = remotewrkLoc;
	}

	public ContractPayProfile getPayProfile() {
		return payProfile;
	}

	public void setPayProfile(ContractPayProfile payProfile) {
		this.payProfile = payProfile;
	}
}
