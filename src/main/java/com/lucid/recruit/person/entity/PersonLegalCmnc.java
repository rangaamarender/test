/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.person.entity;

import com.lucid.core.entity.BaseCmnc;
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
 * @date 25-Jan-2023 11:40:50 pm
 */
//@Entity
@Table(name = PersonLegalCmnc.TABLE_NAME)
public class PersonLegalCmnc extends BaseCmnc {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = 1511878007648695013L;
  public static final String TABLE_NAME = "p_prsn_legal_cmnc";
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "prsn_legal_cmnc_id", nullable = false, length = 75)
  private String personLegalCmncID;

  @Column(name = "person_legal_id", nullable = false)
  private String personLegalID;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "person_legal_id", nullable = false, insertable = false, updatable = false)
  private PersonLegal personLegal;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>PersonLegalCmnc</code>
   */
  public PersonLegalCmnc() {
    super();
  }
  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
