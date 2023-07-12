/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.org.entity;

import com.lucid.recruit.docs.entity.BaseSignableDocument;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 */
@Entity
@Table(name = OrganizationSignableDoc.TABLE_NAME)
public class OrganizationSignableDoc extends BaseSignableDocument {
  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = 8439853915481350523L;
  public static final String TABLE_NAME = "o_org_sig_doc";
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Id
  @Column(name = "org_doc_id", nullable = false, length = 75)
  private String organizationDocID;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>OrganizationSignableDoc</code>
   */
  public OrganizationSignableDoc() {
    super();
  }
  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
