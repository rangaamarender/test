/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.attr.entity;

import com.lucid.core.entity.AuditableEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author sgutti
 * @date 04-Feb-2023 1:20:13 pm
 */
@Entity
@Table(name = AttributeGroupDef.TABLE_NAME)
public class AttributeGroupDef extends AuditableEntity {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = 3743016163806117580L;
  public static final String TABLE_NAME = "xt_attr_group_def";
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "attr_group_def_id", nullable = false, length = 75)
  private String attrGroupDefID;

  @Column(name = "name", nullable = false, length = 50)
  private String name;

  @Column(name = "description", nullable = true, length = 400)
  private String description;

  @Column(name = "display_order", nullable = false)
  private Integer displayOrder;

  // 0-PUBLIC, 1- PRIVATE , 2-SYSTEM,3-INTERNAL
  @Column(name = "scope", nullable = false)
  private Integer scope;

  @Column(name = "internal_code", nullable = true, length = 25)
  private String internalCode;

  @Column(name = "status", nullable = false)
  private Integer status;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>AttributeGroupDef</code>
   */
  public AttributeGroupDef() {
    super();
  }
  // ---------------------------------------------------------- Public Methods

  /**
   * @return Returns the attrGroupDefID.
   */
  public String getAttrGroupDefID() {
    return attrGroupDefID;
  }

  /**
   * @param attrGroupDefID The attrGroupDefID to set.
   */
  public void setAttrGroupDefID(String attrGroupDefID) {
    this.attrGroupDefID = attrGroupDefID;
  }

  /**
   * @return Returns the name.
   */
  public String getName() {
    return name;
  }

  /**
   * @param name The name to set.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return Returns the description.
   */
  public String getDescription() {
    return description;
  }

  /**
   * @param description The description to set.
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * @return Returns the displayOrder.
   */
  public Integer getDisplayOrder() {
    return displayOrder;
  }

  /**
   * @param displayOrder The displayOrder to set.
   */
  public void setDisplayOrder(Integer displayOrder) {
    this.displayOrder = displayOrder;
  }

  /**
   * @return Returns the scope.
   */
  public Integer getScope() {
    return scope;
  }

  /**
   * @param scope The scope to set.
   */
  public void setScope(Integer scope) {
    this.scope = scope;
  }

  /**
   * @return Returns the internalCode.
   */
  public String getInternalCode() {
    return internalCode;
  }

  /**
   * @param internalCode The internalCode to set.
   */
  public void setInternalCode(String internalCode) {
    this.internalCode = internalCode;
  }

  /**
   * @return Returns the status.
   */
  public Integer getStatus() {
    return status;
  }

  /**
   * @param status The status to set.
   */
  public void setStatus(Integer status) {
    this.status = status;
  }

  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
