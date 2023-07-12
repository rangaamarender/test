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
public class DateTimePeriod {

  // --------------------------------------------------------------- Constants
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Column(name = "start_dt", nullable = true)
  private Date startDt;

  @Column(name = "end_dt", nullable = true)
  private Date endDt;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>DateTimePeriod</code>
   */
  public DateTimePeriod() {
    super();
  }


  // ---------------------------------------------------------- Public Methods

  /**
   * @return Returns the startDt.
   */
  public Date getStartDt() {
    return startDt;
  }


  /**
   * @param startDt The startDt to set.
   */
  public void setStartDt(Date startDt) {
    this.startDt = startDt;
  }


  /**
   * @return Returns the endDt.
   */
  public Date getEndDt() {
    return endDt;
  }


  /**
   * @param endDt The endDt to set.
   */
  public void setEndDt(Date endDt) {
    this.endDt = endDt;
  }

  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
