/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.org.dto;

import com.lucid.core.dto.BaseAddressDTO;


/**
 * @author sgutti
 * @date 16-Mar-2023 5:37:49 am
 *
 */
public class WorkLocationAddressDTO extends BaseAddressDTO {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = 8212855664783273920L;
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  private String workLocationAddressID;

  private String workLocationID;
  // ------------------------------------------------------------ Constructors

  /**
   * Create a new <code>WorkLocationAddressVO</code>
   */
  public WorkLocationAddressDTO() {
    super();
  }

  // ---------------------------------------------------------- Public Methods
  /**
   * @return Returns the workLocationAddressID.
   */
  public String getWorkLocationAddressID() {
    return workLocationAddressID;
  }


  /**
   * @param workLocationAddressID The workLocationAddressID to set.
   */
  public void setWorkLocationAddressID(String workLocationAddressID) {
    this.workLocationAddressID = workLocationAddressID;
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


  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
