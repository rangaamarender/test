/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.common.entity;

import com.lucid.core.embeddable.Amount;
import com.lucid.core.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


/**
 * 
 * Associates billing and/or pay rate information with time worked information reported on an
 * entity.
 * 
 * @author sgutti
 * @date 25-Feb-2023 1:46:22 pm
 *
 */
public class PayRate extends BaseEntity {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = 3424619674302047994L;
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "pay_rate_id", nullable = false, length = 75)
  private String payRateID;

  @Column(name = "name", nullable = true, length = 50)
  private String name;

  @Column(name = "code", nullable = true, length = 25)
  private String code;

  @Embedded
  private Amount amount;

  @Column(name = "interval_code", nullable = true, length = 25)
  private String intervalCode;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>PayRate</code>
   */
  public PayRate() {
    super();
  }

  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
