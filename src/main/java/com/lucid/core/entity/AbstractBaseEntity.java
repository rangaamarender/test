/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.core.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

/**
 * @author sgutti
 * @date 21-Jul-2016 11:14:09 am
 */
@MappedSuperclass
public class AbstractBaseEntity extends AuditableEntity {
  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = -6494735151906576625L;
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Column(name = "tenant_id", nullable = false)
  private Long tenantID;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>AbstractBaseEntity</code>
   */
  public AbstractBaseEntity() {
    super();
  }

  // ---------------------------------------------------------- Public Methods
  /**
   * @return Returns the tenantID.
   */
  public Long getTenantID() {
    return tenantID;
  }

  /**
   * @param tenantID The tenantID to set.
   */
  public void setTenantID(Long tenantID) {
    this.tenantID = tenantID;
  }
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
