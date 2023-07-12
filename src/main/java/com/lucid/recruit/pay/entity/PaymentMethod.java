/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.pay.entity;

import com.lucid.core.entity.BaseEntity;
import jakarta.persistence.Column;


/**
 * 
 * Defines how a payment is paid.
 * 
 * @author sgutti
 * @date 18-Feb-2023 9:34:35 pm
 *
 */
public abstract class PaymentMethod extends BaseEntity {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = 8021085433914093123L;

  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  // The manner is which a payment is made. E.g. Direct Deposit, Check, etc.
  @Column(name = "method_type", nullable = true, length = 25)
  private String methodType;

  // An account ID within a bank into which a payroll payment is deposited. The schemeID would
  // include the word 'IBAN' or 'SWIFT' to reference the ID Type.
  @Column(name = "account_id", nullable = true, length = 25)
  private String accountId;

  // A bank account into which a payment is deposited.
  @Column(name = "accounty_type", nullable = true, length = 25)
  private String accountType;

  // The name of the person on the bank account
  @Column(name = "name_on_acct", nullable = true, length = 100)
  private String nameOnAccount;

  // This is a number or identifier for a bank used in the context of electronic funds transfer.
  // Usually, only a single BankID needs to be specified in the context of a given transaction. The
  // bankId may have different names in different parts of the world. E.g. BIC in Europe, Routing
  // Number in the US, and Sort Code in UK.
  @Column(name = "bank_id", nullable = true, length = 25)
  private String bankId;

  // The country code where the bank is located.
  @Column(name = "cntry_code", nullable = true, length = 15)
  private String countryCode;

  // The currency of the payment to be made.
  @Column(name = "currency_code", nullable = true, length = 15)
  private String currencyCode;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>PaymentMethod</code>
   */
  public PaymentMethod() {
    super();
  }
  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
