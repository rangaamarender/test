/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.org.entity;

import com.lucid.recruit.docs.entity.BaseMonitorableDocument;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author sgutti
 * @date 03-Jun-2023 5:58:29 pm
 *
 */
@Entity
@Table(name = OrganizationMonitorableDoc.TABLE_NAME)
public class OrganizationMonitorableDoc extends BaseMonitorableDocument {
  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = 4713260016929514483L;
  public static final String TABLE_NAME = "o_org_mon_doc";
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Id
  @Column(name = "cntrct_doc_id", nullable = false, length = 75)
  private String organizationDocID;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>ContractMonitorableDoc</code>
   */
  public OrganizationMonitorableDoc() {
    super();
  }
  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
