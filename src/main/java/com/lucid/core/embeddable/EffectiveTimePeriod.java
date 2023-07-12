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
public class EffectiveTimePeriod {

  // --------------------------------------------------------------- Constants
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Column(name = "effective_valid_from_dtm", nullable = true)
  private Date effectiveValidFromDtm;

  @Column(name = "effective_valid_to_dtm", nullable = true)
  private Date effectiveValidToDtm;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>DateTimePeriod</code>
   */
  public EffectiveTimePeriod() {
    super();
  }

  // ---------------------------------------------------------- Public Methods
  /**
   * @return Returns the effectiveValidFromDtm.
   */
  public Date getEffectiveValidFromDtm() {
    return effectiveValidFromDtm;
  }


  /**
   * @param effectiveValidFromDtm The effectiveValidFromDtm to set.
   */
  public void setEffectiveValidFromDtm(Date effectiveValidFromDtm) {
    this.effectiveValidFromDtm = effectiveValidFromDtm;
  }


  /**
   * @return Returns the effectiveValidToDtm.
   */
  public Date getEffectiveValidToDtm() {
    return effectiveValidToDtm;
  }


  /**
   * @param effectiveValidToDtm The effectiveValidToDtm to set.
   */
  public void setEffectiveValidToDtm(Date effectiveValidToDtm) {
    this.effectiveValidToDtm = effectiveValidToDtm;
  }

  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
