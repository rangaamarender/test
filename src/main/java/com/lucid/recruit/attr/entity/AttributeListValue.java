/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.attr.entity;

import com.lucid.core.entity.AuditableEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * @author sgutti
 * @date 04-Feb-2023 2:54:52 pm
 */
@Entity
@Table(name = AttributeListValue.TABLE_NAME)
public class AttributeListValue extends AuditableEntity {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = -789790508275105499L;
  public static final String TABLE_NAME = "xt_attr_list_value";
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "attr_list_value_id", nullable = false, length = 75)
  private String attrListValueID;

  @Column(name = "attr_list_value", nullable = false, length = 200)
  private String value;

  @Column(name = "display_order", nullable = false)
  private Integer displayOrder;

  @Column(name = "attr_def_id", nullable = false, length = 75)
  private String attrDefID;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "attr_def_id", nullable = false, insertable = false, updatable = false)
  private AttributeDef attributeDef;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>AttributeListValue</code>
   */
  public AttributeListValue() {
    super();
  }
  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
