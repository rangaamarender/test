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
 * @date 25-Feb-2023 2:10:05 pm
 *
 */
//@Entity
@Table(name = AllowancePayRate.TABLE_NAME)
public class AllowancePayRate extends BasePayRate {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = -5328443573597271732L;
  public static final String TABLE_NAME = "tci_allowance_payrate";

  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "allowance_payrate_id", nullable = false, length = 75)
  private String allowancePayRateID;

  @Column(name = "allowance_id", nullable = false, length = 75)
  private String allowanceID;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "allowance_id", nullable = false, insertable = false, updatable = false)
  private Allowance allowance;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>AllowancePayRate</code>
   */
  public AllowancePayRate() {
    super();
  }

  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
