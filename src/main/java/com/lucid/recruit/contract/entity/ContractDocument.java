/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.contract.entity;

import com.lucid.recruit.docs.entity.BaseDocument;
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
 * @author sgutti
 * @date 26-Jan-2023 12:57:54 am
 */
@Entity
@Table(name = ContractDocument.TABLE_NAME)
public class ContractDocument extends BaseDocument {

	private static final long serialVersionUID = 8419402802337278054L;
	public static final String TABLE_NAME = "c_cntrct_doc";

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "cntrct_doc_id", nullable = false, length = 75)
	private String contractDocID;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cntrct_id", nullable = false, updatable = false)
	private Contract contract;

	/**
	 * Create a new <code>ContractDocument</code>
	 */
	public ContractDocument() {
		super();
	}

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

	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}

}
