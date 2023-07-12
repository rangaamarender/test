/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.contract.entity;

import com.lucid.recruit.docs.entity.BaseMonitorableDocument;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author sgutti
 * @date 03-Jun-2023 5:58:29 pm
 *
 */
//@Entity
@Table(name = ContractMonitorableDoc.TABLE_NAME)
public class  ContractMonitorableDoc extends BaseMonitorableDocument {
  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = 4713260016929514483L;
  public static final String TABLE_NAME = "c_cntrct_mon_doc";
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Id
  @Column(name = "cntrct_doc_id", nullable = false, length = 75)
  private String contractDocID;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>ContractMonitorableDoc</code>
   */
  public ContractMonitorableDoc() {
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
