/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.docs.vo;

import com.lucid.core.vo.BaseVO;

/**
 * @author sgutti
 * @date 22-Apr-2023 3:19:17 pm
 *
 */
public class DocumentDefVO extends BaseVO {
  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = 1277874706888737841L;

  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  private String documentDefID;

  // Signable,Uploaded,Monitor,Download
  private String documentType;

  // Standard name given to the document name by system
  private String documentName;

  // unique code for document referred in the system like W9-FORM etc
  private String documentInternalCode;

  // Document is active/inactive/discarded in the system
  private Integer status;

  // Document is 1- Internal Only, 2 - Tenant Only, 3 - EndUser Only
  private Integer documentScope;

  // Document can be access by WHOM
  private Integer documentAccessability;

  // associated entity like EMPLOYEE,CONTRACT etc
  private String relatedType;

  // associated relatedSubType for an relatedType like W2C,C2C,1099
  private String relatedSubType;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>DocumentDefVO</code>
   */
  public DocumentDefVO() {
    super();
  }
  // ---------------------------------------------------------- Public Methods

  /**
   * @return Returns the documentDefID.
   */
  public String getDocumentDefID() {
    return documentDefID;
  }

  /**
   * @param documentDefID The documentDefID to set.
   */
  public void setDocumentDefID(String documentDefID) {
    this.documentDefID = documentDefID;
  }

  /**
   * @return Returns the documentType.
   */
  public String getDocumentType() {
    return documentType;
  }

  /**
   * @param documentType The documentType to set.
   */
  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }

  /**
   * @return Returns the documentName.
   */
  public String getDocumentName() {
    return documentName;
  }

  /**
   * @param documentName The documentName to set.
   */
  public void setDocumentName(String documentName) {
    this.documentName = documentName;
  }

  /**
   * @return Returns the documentInternalCode.
   */
  public String getDocumentInternalCode() {
    return documentInternalCode;
  }

  /**
   * @param documentInternalCode The documentInternalCode to set.
   */
  public void setDocumentInternalCode(String documentInternalCode) {
    this.documentInternalCode = documentInternalCode;
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

  /**
   * @return Returns the documentScope.
   */
  public Integer getDocumentScope() {
    return documentScope;
  }

  /**
   * @param documentScope The documentScope to set.
   */
  public void setDocumentScope(Integer documentScope) {
    this.documentScope = documentScope;
  }

  /**
   * @return Returns the documentAccessability.
   */
  public Integer getDocumentAccessability() {
    return documentAccessability;
  }

  /**
   * @param documentAccessability The documentAccessability to set.
   */
  public void setDocumentAccessability(Integer documentAccessability) {
    this.documentAccessability = documentAccessability;
  }

  /**
   * @return Returns the relatedType.
   */
  public String getRelatedType() {
    return relatedType;
  }

  /**
   * @param relatedType The relatedType to set.
   */
  public void setRelatedType(String relatedType) {
    this.relatedType = relatedType;
  }

  /**
   * @return Returns the relatedSubType.
   */
  public String getRelatedSubType() {
    return relatedSubType;
  }

  /**
   * @param relatedSubType The relatedSubType to set.
   */
  public void setRelatedSubType(String relatedSubType) {
    this.relatedSubType = relatedSubType;
  }
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
