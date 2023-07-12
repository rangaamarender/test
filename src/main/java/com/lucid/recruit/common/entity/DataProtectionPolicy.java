/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.common.entity;

import java.util.Date;
import com.lucid.core.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


/**
 * 
 * @author sgutti
 * @date 20-Feb-2023 9:18:59 am
 *
 */
@Entity
@Table(name = DataProtectionPolicy.TABLE_NAME)
public class DataProtectionPolicy extends BaseEntity {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = -6386010816428735300L;
  public static final String TABLE_NAME = "t_data_protction_policy";

  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "data_protction_policy_id", nullable = false, length = 75)
  private String dataProtectionPolicyID;

  // Date until allowed to keep privacy data. In case 'retentionDays' is also present, earlier one
  // is taken as retention limit. In case of no retention property present, data can be kept
  // indefinitely.
  @Column(name = "retention_dt", nullable = true)
  private Date retentionDate;

  // Number of days allowed to keep privacy data. In case 'retentionDate' is also present, earlier
  // one is taken as retention limit. In case of no retention property present, data can be kept
  // indefinitely.
  @Column(name = "retention_days", nullable = true)
  private Integer retentionDays;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>DataProtectionPolicy</code>
   */
  public DataProtectionPolicy() {
    super();
  }

  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
