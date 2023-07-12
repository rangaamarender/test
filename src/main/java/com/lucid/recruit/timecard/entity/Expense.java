/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.timecard.entity;

import com.lucid.core.embeddable.Amount;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


/**
 * 
 * This allows for the reporting of expenses for reimbursement or payment. TimeCard is not designed
 * as an all-purpose expense-reporting format, but rather is designed to accommodate the type of
 * expenses that are reported and reimbursed in the context of staffing assignments.
 * 
 * @author sgutti
 * @date 25-Feb-2023 8:01:01 am
 *
 */
@Entity
@Table(name = Expense.TABLE_NAME)
public class Expense extends BaseExpAllw {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = -2315752050897625175L;
  public static final String TABLE_NAME = "tci_expense";
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "expense_id", nullable = false, length = 75)
  private String expenseID;

  @Embedded
  private Amount amount;


  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>Expense</code>
   */
  public Expense() {
    super();
  }

  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
