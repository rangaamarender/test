/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.person.entity;

import com.lucid.core.embeddable.BasePersonName;
import com.lucid.core.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


/**
 * Contains information to identify a person associated with the interaction or entity.
 * 
 * @author sgutti
 * @date 18-Feb-2023 9:05:24 pm
 *
 */
@Entity
@Table(name = SpecifiedPerson.TABLE_NAME)
public class SpecifiedPerson extends BaseEntity {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = -1236217820960039462L;
  public static final String TABLE_NAME = "p_specified_person";
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "specified_person_id", nullable = false, length = 75)
  private String specifiedPersonID;

  @Embedded
  private BasePersonName name;

  @Column(name = "primary_lang", nullable = true, length = 25)
  private String primaryLanguage;

  @Column(name = "role_code", nullable = true, length = 25)
  private String roleCode;


  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>SpecifiedPerson</code>
   */
  public SpecifiedPerson() {
    super();
  }

  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
