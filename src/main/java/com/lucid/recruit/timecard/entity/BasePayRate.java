/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.timecard.entity;

import com.lucid.core.embeddable.Amount;
import com.lucid.core.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.MappedSuperclass;


/**
 * @author sgutti
 * @date 25-Feb-2023 6:15:38 pm
 *
 */
//@MappedSuperclass
public abstract class BasePayRate extends BaseEntity {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = 8340134809569876578L;

  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
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
   * Create a new <code>BasePayRate</code>
   */
  public BasePayRate() {
    super();
  }

  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
