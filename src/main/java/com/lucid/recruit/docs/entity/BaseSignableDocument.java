/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.docs.entity;

import com.lucid.core.entity.BaseEntity;
import jakarta.persistence.Column;

/**
 * @author sgutti
 * @date 01-May-2023 8:34:52 pm
 *
 */
public class BaseSignableDocument extends BaseEntity {
  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = 8692569169877888781L;

  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  // does this document needs multiple
  @Column(name = "multiple_ind", nullable = true)
  private Boolean multipleInd;

  // document comments if any
  @Column(name = "comments", nullable = true, length = 500)
  private String comments;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>BaseSignableDocument</code>
   */
  public BaseSignableDocument() {
    super();
  }
  // ---------------------------------------------------------- Public Methods

  /**
   * @return multipleInd
   */
  public Boolean getMultipleInd() {
    return multipleInd;
  }

  /**
   * @param multipleInd
   */
  public void setMultipleInd(Boolean multipleInd) {
    this.multipleInd = multipleInd;
  }

  /**
   * @return comments
   */
  public String getComments() {
    return comments;
  }

  /**
   * @param comments
   */
  public void setComments(String comments) {
    this.comments = comments;
  }


  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
