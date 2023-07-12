/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.core.embeddable;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

/**
 * Single period between date/times. Both start and end are required.
 * 
 * @author sgutti
 * @date 11-Feb-2023 5:10:28 pm
 *
 */
@Embeddable
public class ValidPeriod {

  // --------------------------------------------------------------- Constants
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Column(name = "valid_from_dt", nullable = true)
  private Date validFromDate;

  @Column(name = "valid_to_dt", nullable = true)
  private Date validToDate;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>ValidPeriod</code>
   */
  public ValidPeriod() {
    super();
  }

  // ---------------------------------------------------------- Public Methods
  /**
   * @return Returns the validFromDate.
   */
  public Date getValidFromDate() {
    return validFromDate;
  }

  /**
   * @param validFromDate The validFromDate to set.
   */
  public void setValidFromDate(Date validFromDate) {
    this.validFromDate = validFromDate;
  }

  /**
   * @return Returns the validToDate.
   */
  public Date getValidToDate() {
    return validToDate;
  }

  /**
   * @param validToDate The validToDate to set.
   */
  public void setValidToDate(Date validToDate) {
    this.validToDate = validToDate;
  }
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
