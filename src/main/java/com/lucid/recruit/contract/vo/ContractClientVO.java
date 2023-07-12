/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.contract.vo;

import com.lucid.core.vo.BaseVO;
import com.lucid.recruit.org.vo.WorkLocationVO;


/**
 * @author sgutti
 * @date 16-Mar-2023 5:29:58 am
 *
 */
public class ContractClientVO extends BaseVO {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = -3550760008637864260L;

  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  private String contractID;
  private String organizationID;
  private String workLocationID;

  private WorkLocationVO worklocation;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>ContractClientVO</code>
   */
  public ContractClientVO() {
    super();
  }
  // ---------------------------------------------------------- Public Methods

  /**
   * @return Returns the contractID.
   */
  public String getContractID() {
    return contractID;
  }

  /**
   * @param contractID The contractID to set.
   */
  public void setContractID(String contractID) {
    this.contractID = contractID;
  }

  /**
   * @return Returns the organizationID.
   */
  public String getOrganizationID() {
    return organizationID;
  }

  /**
   * @param organizationID The organizationID to set.
   */
  public void setOrganizationID(String organizationID) {
    this.organizationID = organizationID;
  }

  /**
   * @return Returns the workLocationID.
   */
  public String getWorkLocationID() {
    return workLocationID;
  }

  /**
   * @param workLocationID The workLocationID to set.
   */
  public void setWorkLocationID(String workLocationID) {
    this.workLocationID = workLocationID;
  }

  /**
   * @return Returns the worklocation.
   */
  public WorkLocationVO getWorklocation() {
    return worklocation;
  }

  /**
   * @param worklocation The worklocation to set.
   */
  public void setWorklocation(WorkLocationVO worklocation) {
    this.worklocation = worklocation;
  }

  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
