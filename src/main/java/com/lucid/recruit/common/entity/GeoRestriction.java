/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.common.entity;

import com.lucid.core.entity.BaseEntity;
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
 * @date 20-Feb-2023 9:47:45 am
 *
 */
@Entity
@Table(name = GeoRestriction.TABLE_NAME)
public class GeoRestriction extends BaseEntity {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = -9089115970616048727L;
  public static final String TABLE_NAME = "t_geo_restrict";

  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "geo_restrict_id", nullable = false, length = 75)
  private String geoRestrictionID;


  // The Country (represented by an ISO 3166 2 letter code) under which the data protection policy
  // applies. If the policy applies to the world, the country is optional.
  @Column(name = "cntry_code", nullable = false, length = 2)
  private String countryCode;


  // An optional further restriction or application of the data protection policy based on a region
  // within the associated country. It should contain an ISO 3166-2 code for the country. Example
  // would be 'US-CA' for California for further restrictions based on the CCPA regulation.
  @Column(name = "cntry_sub_divs", nullable = true, length = 200)
  private String countrySubDivisions;

  @Column(name = "policy_code", nullable = true, length = 25)
  private String policyCode;

  // The description of the data protection policy (optionally associated with the country and
  // optional region).
  @Column(name = "policy", nullable = true, length = 200)
  private String policy;

  @Column(name = "data_protction_policy_id", nullable = false, length = 75)
  private String dataProtectionPolicyID;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "data_protction_policy_id", insertable = false, updatable = false)
  private DataProtectionPolicy dataProtectionPolicy;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>GeoRestriction</code>
   */
  public GeoRestriction() {
    super();
  }

  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
