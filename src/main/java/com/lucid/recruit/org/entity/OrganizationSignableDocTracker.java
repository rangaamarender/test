/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.org.entity;

import com.lucid.recruit.docs.entity.BaseSignableDocTracker;
import jakarta.persistence.*;

/**
 *
 */
@Entity
@Table(name = OrganizationSignableDocTracker.TABLE_NAME)
public class OrganizationSignableDocTracker extends BaseSignableDocTracker {
  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = 8877911633253552918L;
  public static final String TABLE_NAME = "o_org_sig_doc_tracker";
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "org_sig_doc_tracker_id", nullable = false, length = 75)
  private String contractSigDocTrackerID;

  @Column(name = "org_doc_id", nullable = false, length = 75)
  private String contractDocID;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>OrganizationSignableDocTracker</code>
   */
  public OrganizationSignableDocTracker() {
    super();
  }

  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
