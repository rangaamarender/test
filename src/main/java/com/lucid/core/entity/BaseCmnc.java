/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.core.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

/**
 * @author sgutti
 * @date 11-Feb-2023 4:29:19 pm
 *
 */
@MappedSuperclass
public abstract class BaseCmnc extends AuditableEntity {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = 5888098569675041989L;

  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Column(name = "cmnc_type", nullable = false, length = 25)
  private String communicationType;

  // This will hold the email address or website url based on the communication type
  @Column(name = "cmnc_value", nullable = true, length = 255)
  private String cmncValue;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>BaseCmnc</code>
   */
  public BaseCmnc() {
    super();
  }
  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
