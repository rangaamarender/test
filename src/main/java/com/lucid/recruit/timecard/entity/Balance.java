/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.timecard.entity;

import com.lucid.core.embeddable.Amount;
import com.lucid.core.embeddable.Quantity;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author sgutti
 * @date 25-Feb-2023 3:51:17 pm
 *
 */
//@Entity
@Table(name = Balance.TABLE_NAME)
public class Balance extends BaseExpAllw {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = -178902324288399426L;
  public static final String TABLE_NAME = "tci_balance";
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "balance_id", nullable = false, length = 75)
  private String balanceID;

  @Embedded
  private Amount amount;

  @Embedded
  private Quantity quantity;


  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>Balance</code>
   */
  public Balance() {
    super();
  }

  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
