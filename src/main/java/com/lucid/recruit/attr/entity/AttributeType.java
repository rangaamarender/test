/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.attr.entity;

import com.lucid.core.entity.AuditableEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author sgutti
 * @date 04-Feb-2023 2:46:15 pm
 *
 */
@Entity
@Table(name = AttributeType.TABLE_NAME)
public class AttributeType extends AuditableEntity {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = 8205131049193030365L;
  public static final String TABLE_NAME = "xt_attr_type";
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Id
  @Column(name = "attr_type_id", nullable = false)
  private Long attrTypeID;

  @Column(name = "name", nullable = false, length = 50)
  private String name;

  @Column(name = "description", nullable = true, length = 400)
  private String description;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>AttributeType</code>
   */
  public AttributeType() {
    super();
  }
  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
