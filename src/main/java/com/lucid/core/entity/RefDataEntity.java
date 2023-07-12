/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.core.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

/**
 * @author sgutti
 * @date May 28, 2017 12:43:40 AM
 */
@MappedSuperclass
public class RefDataEntity extends AuditableEntity {
  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = -1155109304668435213L;
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Column(name = "description", nullable = false, length = 200)
  private String description;

  @Column(name = "code", nullable = true, length = 50)
  private String code;

  @Column(name = "sort_order", nullable = true)
  private Integer sortOrder;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>RefDataEntity</code>
   */
  public RefDataEntity() {
    super();
  }

  // ---------------------------------------------------------- Public Methods
  /**
   * @param description The description to set.
   */
  public String getDescription() {
    return description;
  }

  /**
   * @return Returns the description.
   */
  public void setDescription(final String description) {
    this.description = description;
  }

  /**
   * @param code The code to set.
   */
  public String getCode() {
    return code;
  }

  /**
   * @return Returns the code.
   */
  public void setCode(final String code) {
    this.code = code;
  }

  /**
   * @param sortOrder The sortOrder to set.
   */
  public Integer getSortOrder() {
    return sortOrder;
  }

  /**
   * @return Returns the sortOrder.
   */
  public void setSortOrder(final Integer sortOrder) {
    this.sortOrder = sortOrder;
  }
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
