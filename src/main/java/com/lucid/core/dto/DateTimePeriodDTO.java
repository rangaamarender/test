
package com.lucid.core.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Date;
public class DateTimePeriodDTO {

  // --------------------------------------------------------------- Constants
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @NotNull
  private Date startDt;
  @NotNull
  private Date endDt;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>DateTimePeriod</code>
   */
  public DateTimePeriodDTO() {
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
