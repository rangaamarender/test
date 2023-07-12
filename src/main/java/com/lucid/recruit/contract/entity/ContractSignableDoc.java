/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.contract.entity;

import com.lucid.recruit.docs.entity.BaseSignableDocument;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author sgutti
 * @date 03-Jun-2023 6:01:13 pm
 *
 */
//@Entity
@Table(name = ContractSignableDoc.TABLE_NAME)
public class ContractSignableDoc extends BaseSignableDocument {
	// --------------------------------------------------------------- Constants
	private static final long serialVersionUID = 8439853915481350533L;
	public static final String TABLE_NAME = "c_cntrct_sig_doc";
	// --------------------------------------------------------- Class Variables
	// ----------------------------------------------------- Static Initializers
	// ------------------------------------------------------ Instance Variables
	@Id
	@Column(name = "cntrct_doc_id", nullable = false, length = 75)
	private String contractDocID;

	// ------------------------------------------------------------ Constructors
	/**
	 * Create a new <code>ContractSignableDoc</code>
	 */
	public ContractSignableDoc() {
		super();
	}
	// ---------------------------------------------------------- Public Methods

	/**
	 * @return contractDocID
	 */
	public String getContractDocID() {
		return contractDocID;
	}

	/**
	 * @param contractDocID
	 */
	public void setContractDocID(String contractDocID) {
		this.contractDocID = contractDocID;
	}

	// ------------------------------------------------------- Protected Methods
	// --------------------------------------------------------- Default Methods
	// --------------------------------------------------------- Private Methods
	// ---------------------------------------------------------- Static Methods
	// ----------------------------------------------------------- Inner Classes
}
