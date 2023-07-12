/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.org.entity;

import com.lucid.core.entity.BasePhoneNbr;
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
 * @date 16-Apr-2023 5:00:15 pm
 *
 */
@Entity
@Table(name = OrgPhoneNbr.TABLE_NAME)
public class OrgPhoneNbr extends BasePhoneNbr {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = 940644098590052L;
  public static final String TABLE_NAME = "o_org_phonenbr";

  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "org_phonenbr_id", nullable = false, length = 75)
  private String orgPhoneNbrID;

  @Column(name = "org_cmnc_id", nullable = false, length = 75)
  private String orgCmncID;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "org_cmnc_id", nullable = false, insertable = false, updatable = false)
  private OrgCommunication orgCmnc;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>OrgPhoneNbr</code>
   */
  public OrgPhoneNbr() {
    super();
  }

  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
