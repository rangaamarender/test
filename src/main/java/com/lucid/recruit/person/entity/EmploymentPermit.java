/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.person.entity;

import java.util.Date;
import com.lucid.core.embeddable.EffectiveTimePeriod;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * 
 * A type that gives information on the permissions of a person to work.
 * 
 * @author sgutti
 * @date 11-Feb-2023 8:54:59 pm
 *
 */
@Entity
@Table(name = EmploymentPermit.TABLE_NAME)
public class EmploymentPermit extends PersonBased {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = -8692804395690002374L;
  public static final String TABLE_NAME = "p_prsn_emplymnt_permit";
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "emplymnt_permit_id", nullable = false, length = 75)
  private String employmentPermitID;


  // A unique identifier to the certificate as defined by the issuing authority.
  @Column(name = "id", nullable = false, length = 25)
  private String id;

  // The common name of the certificate.
  @Column(name = "name", nullable = true, length = 50)
  private String name;

  // The status of the certificate. While this is an open string, common status include active,
  // expired, pending, suspended.
  @Column(name = "status", nullable = true, length = 15)
  private String status;

  // The time period for which the certificate is valid and considered active.
  @Embedded
  private EffectiveTimePeriod effectiveTimePeriod;

  // The most recent issue date of the certificate. This might be of relevance if it differs from
  // the start date of the valid time period or is a renewal of a previous certificate.
  @Column(name = "issued_dt", nullable = true)
  private Date issuedDt;

  // The original issue date of the certificate. Often this is useful when the certificates need to
  // be renewed often, and it is important to know how long the certificate has been held.
  @Column(name = "first_issued_dt", nullable = true)
  private Date firstIssuedDt;

  @Column(name = "cntry_code", nullable = true, length = 15)
  private String countryCode;

  // The organization that issued the certificate.
  @Column(name = "issuing_authority", nullable = true, length = 100)
  private String issuingAuthority;

  // TODO - attachments,countrySubDivisions

  // ------------------------------------------------------------ Constructors

  /**
   * Create a new <code>EmploymentPermit</code>
   */
  public EmploymentPermit() {
    super();
  }

  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
