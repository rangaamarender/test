/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.core.embeddable;

import java.math.BigDecimal;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

/**
 * 
 * A quantity is a counted number of non-monetary units, possibly including fractions.
 * 
 * @author sgutti
 * @date 25-Feb-2023 10:19:05 am
 *
 */
@Embeddable
public class Quantity {

  // --------------------------------------------------------------- Constants
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  // The number of quantity
  @Column(name = "qntity_value", nullable = true)
  private BigDecimal quantityValue;

  // The unit of quantity.
  @Column(name = "qntity_unit_code", nullable = true, length = 25)
  private String quantityUnitCode;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>Quantity</code>
   */
  public Quantity() {
    super();
  }

  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
