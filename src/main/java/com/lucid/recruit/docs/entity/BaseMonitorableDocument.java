/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.docs.entity;

import java.util.Date;
import com.lucid.core.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

/**
 * @author sgutti
 * @date 09-Apr-2023 12:18:08 pm
 *
 */
@MappedSuperclass
public abstract class BaseMonitorableDocument extends BaseEntity {
  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = 7462082016062864507L;

  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  // does this document expires
  @Column(name = "expires_ind", nullable = true)
  private Boolean expiresInd;

  // document expiration date
  @Column(name = "expiration_date", nullable = false, length = 25)
  private Date expirationDate;

  // document comments if any
  @Column(name = "comments", nullable = true, length = 500)
  private String comments;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>BaseMonitorDocument</code>
   */
  public BaseMonitorableDocument() {
    super();
  }
  // ---------------------------------------------------------- Public Methods

  /**
   * @return expiresInd
   */
  public Boolean getExpiresInd() {
    return expiresInd;
  }

  /**
   * @param expiresInd
   */
  public void setExpiresInd(Boolean expiresInd) {
    this.expiresInd = expiresInd;
  }

  /**
   * @return expirationDate
   */
  public Date getExpirationDate() {
    return expirationDate;
  }

  /**
   * @param expirationDate
   */
  public void setExpirationDate(Date expirationDate) {
    this.expirationDate = expirationDate;
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
