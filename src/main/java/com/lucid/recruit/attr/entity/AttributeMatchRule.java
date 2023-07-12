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
 * @date 04-Feb-2023 3:06:13 pm
 */
@Entity
@Table(name = AttributeMatchRule.TABLE_NAME)
public class AttributeMatchRule extends AuditableEntity {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = 5963934580554988324L;
  public static final String TABLE_NAME = "xt_attr_match_rule";
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "attr_match_rule_id", nullable = false, length = 75)
  private String attrMatchRuleID;

  // 0 - IS / 1- IS_NOT
  @Column(name = "rule_type", nullable = false)
  private Integer ruleType;

  @Column(name = "rule_value", nullable = false, length = 200)
  private String ruleValue;

  @Column(name = "target_attr_def_id", nullable = false, length = 75)
  private String targetAttrDefID;

  @Column(name = "attr_def_id", nullable = false, length = 75)
  private String attrDefID;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "target_attr_def_id", nullable = false, insertable = false, updatable = false)
  private AttributeDef targetAttributeDef;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "attr_def_id", nullable = false, insertable = false, updatable = false)
  private AttributeDef attributeDef;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>AttributeMatchRule</code>
   */
  public AttributeMatchRule() {
    super();
  }
  // ---------------------------------------------------------- Public Methods


  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
