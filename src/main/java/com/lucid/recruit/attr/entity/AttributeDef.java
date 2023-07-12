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
 * @date 04-Feb-2023 1:29:32 pm
 */
@Entity
@Table(name = AttributeDef.TABLE_NAME)
public class AttributeDef extends AuditableEntity {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = 4232069658035044147L;
  public static final String TABLE_NAME = "xt_attr_def";
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "attr_def_id", nullable = false, length = 75)
  private String attrDefID;

  @Column(name = "name", nullable = false, length = 50)
  private String name;

  @Column(name = "description", nullable = true, length = 400)
  private String description;

  @Column(name = "display_order", nullable = false)
  private Integer displayOrder;

  @Column(name = "internal_code", nullable = true, length = 25)
  private String internalCode;

  @Column(name = "status", nullable = false)
  private Integer status;

  @Column(name = "attr_group_def_id", nullable = false, length = 75)
  private String attrGroupDefID;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "attr_group_def_id", nullable = false, insertable = false, updatable = false)
  private AttributeGroupDef attributeGroupDef;

  @Column(name = "attr_type_id", nullable = false)
  private Long attrTypeID;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "attr_type_id", nullable = false, insertable = false, updatable = false)
  private AttributeType attributeType;
  //
  @Column(name = "is_required", nullable = true)
  private Boolean required;

  @Column(name = "is_multiple", nullable = true)
  private Boolean multiple;

  @Column(name = "default_value", nullable = true, length = 200)
  private String defaultValue;

  @Column(name = "mask", nullable = true, length = 200)
  private String mask;

  @Column(name = "tool_tip", nullable = true, length = 200)
  private String toolTip;


  //
  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>AttributeDef</code>
   */
  public AttributeDef() {
    super();
  }
  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
