/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.contract.entity;

import com.lucid.recruit.docs.entity.BaseSignableDocTracker;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author sgutti
 * @date 03-Jun-2023 6:06:50 pm
 *
 */
//@Entity
@Table(name = ContractSignableDocTracker.TABLE_NAME)
public class ContractSignableDocTracker extends BaseSignableDocTracker {
	// --------------------------------------------------------------- Constants
	private static final long serialVersionUID = 8877911633253552918L;
	public static final String TABLE_NAME = "c_cntrct_sig_doc_tracker";
	// --------------------------------------------------------- Class Variables
	// ----------------------------------------------------- Static Initializers
	// ------------------------------------------------------ Instance Variables
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "cntrct_sig_doc_tracker_id", nullable = false, length = 75)
	private String contractSigDocTrackerID;

	@Column(name = "cntrct_doc_id", nullable = false, length = 75)
	private String contractDocID;

	// ------------------------------------------------------------ Constructors
	/**
	 * Create a new <code>ContractSignableDocTracker</code>
	 */
	public ContractSignableDocTracker() {
		super();
	}

	// ---------------------------------------------------------- Public Methods

	public String getContractSigDocTrackerID() {
		return contractSigDocTrackerID;
	}

	public void setContractSigDocTrackerID(String contractSigDocTrackerID) {
		this.contractSigDocTrackerID = contractSigDocTrackerID;
	}

	public String getContractDocID() {
		return contractDocID;
	}

	public void setContractDocID(String contractDocID) {
		this.contractDocID = contractDocID;
	}

	// ------------------------------------------------------- Protected Methods
	// --------------------------------------------------------- Default Methods
	// --------------------------------------------------------- Private Methods
	// ---------------------------------------------------------- Static Methods
	// ----------------------------------------------------------- Inner Classes
}
