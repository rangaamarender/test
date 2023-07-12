/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.referencedata.entity;

import com.lucid.core.entity.RefDataEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author sgutti
 * @date 17-May-2023 2:40:22 pm
 *
 */
@Entity
@Table(name = PayTypeCode.TABLE_NAME)
public class PayTypeCode extends RefDataEntity {
  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = 2032083721060524814L;
  public static final String TABLE_NAME = "ref_paytype_code";
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "paytype_code_id", nullable = false)
  private Integer payTypeCodeID;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>PayTypeCode</code>
   */
  public PayTypeCode() {
    super();
  }
  // ---------------------------------------------------------- Public Methods

  /**
   * @return Returns the payTypeCodeID.
   */
  public Integer getPayTypeCodeID() {
    return payTypeCodeID;
  }

  /**
   * @param payTypeCodeID The payTypeCodeID to set.
   */
  public void setPayTypeCodeID(Integer payTypeCodeID) {
    this.payTypeCodeID = payTypeCodeID;
  }
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
