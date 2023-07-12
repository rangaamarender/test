/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.common.entity;

import com.lucid.core.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * @author sgutti
 * @date 30-Mar-2023 9:05:28 pm
 *
 */
public class SystemRegistry extends BaseEntity {
  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = 1521253786309503457L;
  public static final String TABLE_NAME = "t_sys_regsitry";

  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "sys_registry_id", nullable = false, length = 75)
  private String systemRegistryID;

  @Column(name = "name", nullable = false, length = 50)
  private String name;

  @Column(name = "value", nullable = false, length = 150)
  private String value;

  @Column(name = "value", nullable = false, length = 150)
  private String dataType;

  @Column(name = "status", nullable = false)
  private Integer status;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>SystemRegistry</code>
   */
  public SystemRegistry() {
    super();
  }

  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
