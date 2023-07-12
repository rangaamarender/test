/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.attr.entity;

import java.util.List;
import com.lucid.core.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * @author sgutti
 * @date 04-Feb-2023 3:36:33 pm
 */
@Entity
@Table(name = AttributeConditionRule.TABLE_NAME)
public class AttributeConditionRule extends BaseEntity {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = 7890465741698267739L;
  public static final String TABLE_NAME = "xt_attr_condition_rule";
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Id
  @Column(name = "attr_def_id", nullable = false, length = 75)
  private String attrDefID;

  // 1 - SHOW , 2 -HIDE,3 - REQUIRED , 4- OPTIONAL
  @Column(name = "condition_type", nullable = false)
  private Integer conditionType;

  // 1- ALL, 2- ANY
  @Column(name = "condition_match", nullable = false)
  private Integer conditionMatch;

  @OneToMany(fetch = FetchType.EAGER)
  @JoinColumn(name = "target_attr_def_id")
  private List<AttributeMatchRule> attributeMatchRules;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "attr_def_id", nullable = false, insertable = false, updatable = false)
  private AttributeDef attributeDef;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>AttributeConditionRule</code>
   */
  public AttributeConditionRule() {
    super();
  }

  // ---------------------------------------------------------- Public Methods
  /**
   * @return Returns the attrDefID.
   */
  public String getAttrDefID() {
    return attrDefID;
  }

  /**
   * @param attrDefID The attrDefID to set.
   */
  public void setAttrDefID(String attrDefID) {
    this.attrDefID = attrDefID;
  }

  /**
   * @return Returns the conditionType.
   */
  public Integer getConditionType() {
    return conditionType;
  }

  /**
   * @param conditionType The conditionType to set.
   */
  public void setConditionType(Integer conditionType) {
    this.conditionType = conditionType;
  }

  /**
   * @return Returns the conditionMatch.
   */
  public Integer getConditionMatch() {
    return conditionMatch;
  }

  /**
   * @param conditionMatch The conditionMatch to set.
   */
  public void setConditionMatch(Integer conditionMatch) {
    this.conditionMatch = conditionMatch;
  }

  /**
   * @return Returns the attributeMatchRules.
   */
  public List<AttributeMatchRule> getAttributeMatchRules() {
    return attributeMatchRules;
  }

  /**
   * @param attributeMatchRules The attributeMatchRules to set.
   */
  public void setAttributeMatchRules(List<AttributeMatchRule> attributeMatchRules) {
    this.attributeMatchRules = attributeMatchRules;
  }

  /**
   * @return Returns the attributeDef.
   */
  public AttributeDef getAttributeDef() {
    return attributeDef;
  }

  /**
   * @param attributeDef The attributeDef to set.
   */
  public void setAttributeDef(AttributeDef attributeDef) {
    this.attributeDef = attributeDef;
  }

  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
