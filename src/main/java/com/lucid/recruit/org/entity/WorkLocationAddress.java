/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.org.entity;

import com.lucid.core.entity.BaseAddress;
import jakarta.persistence.*;


/**
 * @author sgutti
 * @date 18-Feb-2023 8:54:59 pm
 *
 */
@Entity
@Table(name = WorkLocationAddress.TABLE_NAME)
public class WorkLocationAddress extends BaseAddress {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = 8629858182182995537L;
  public static final String TABLE_NAME = "w_work_location_addr";
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Id
  @Column(name = "work_location_addr_id", nullable = false, length = 75)
  @GeneratedValue(strategy = GenerationType.UUID)
  private String workLocationAddressID;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>WorkLocationAddress</code>
   */
  public WorkLocationAddress() {
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

// ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
