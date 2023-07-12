/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.timecard.entity;

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
 * @date 25-Feb-2023 6:19:53 pm
 *
 */
//@Entity
@Table(name = TimeCardPayRate.TABLE_NAME)
public class TimeCardPayRate extends BasePayRate {

  // --------------------------------------------------------- Class Variables
  private static final long serialVersionUID = 6277588183480388581L;
  public static final String TABLE_NAME = "tc_payrate";

  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "timecard_payrate_id", nullable = false, length = 75)
  private String timeCardPayRateID;

  @Column(name = "timecard_id", nullable = false, length = 75)
  private String timecardID;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "timecard_id", nullable = false, insertable = false, updatable = false)
  private TimeCard timeCard;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>TimeCardPayRate</code>
   */
  public TimeCardPayRate() {
    super();
  }
  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
