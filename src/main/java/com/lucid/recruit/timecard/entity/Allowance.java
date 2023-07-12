/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.timecard.entity;

import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * 
 * Allows for the reporting of allowances that may be associated with the particular time worked.
 * For example, some workers may be due per diems to cover expenses incurred during an assignment or
 * may receive allowances to cover the cost of items such as uniforms.
 * 
 * @author sgutti
 * @date 25-Feb-2023 2:05:32 pm
 *
 */
//@Entity
@Table(name = Allowance.TABLE_NAME)
public class Allowance extends BaseExpAllw {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = 3627742065009335233L;
  public static final String TABLE_NAME = "tci_allowance";

  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "allowance_id", nullable = false, length = 75)
  private String allowanceID;

  @OneToMany(fetch = FetchType.EAGER, mappedBy = "allowance")
  private List<AllowancePayRate> payRates;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>Allowance</code>
   */
  public Allowance() {
    super();
  }

  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
