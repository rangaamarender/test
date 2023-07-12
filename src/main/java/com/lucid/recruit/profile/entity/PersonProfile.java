/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.profile.entity;

import java.util.Date;
import com.lucid.core.embeddable.BasePersonName;
import com.lucid.core.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


/**
 * @author sgutti
 * @date 18-Feb-2023 9:52:43 pm
 *
 */
@Entity
@Table(name = PersonProfile.TABLE_NAME)
public class PersonProfile extends BaseEntity {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = 6258862428480462007L;
  public static final String TABLE_NAME = "p_person_profile";
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "person_profile_id", nullable = false, length = 75)
  private String personProfileID;

  @Column(name = "legal_id", nullable = false, length = 25)
  private String legalId;

  @Column(name = "previous_legal_id", nullable = false, length = 25)
  private String previousLegalId;

  // The birth date of a person.
  @Column(name = "birth_dt", nullable = false)
  private Date birthDate;

  // The gender of a person.
  @Column(name = "gender", nullable = true, length = 15)
  private String gender;

  // The citizenships that a person holds. This is a legal citizenship in a country (as opposed to
  // nationality which may or may not be a country).
  @Column(name = "citizenship", nullable = true, length = 100)
  private String citizenship;

  // The country (or countries) where a person currently resides.
  @Column(name = "residence_cntry", nullable = true, length = 25)
  private String residenceCountry;

  // The military status of a person.
  @Column(name = "military_status", nullable = true, length = 15)
  private String militaryStatus;

  // The ethnicity (or ethnicities) of a person. A country may define which of these terms (race,
  // nationality, ethnicity) be used and how they are defined. One or more properties may be used by
  // a country. A predefined country list allows a person to specify their ethnicity.
  @Column(name = "ethnicity", nullable = true, length = 100)
  private String ethnicity;


  @Embedded
  private BasePersonName name;

  // TODO - communication

  @Column(name = "primary_lang", nullable = true, length = 25)
  private String primaryLanguage;

  @Column(name = "profile_name", nullable = true, length = 50)
  private String profileName;

  @Column(name = "language_code", nullable = true, length = 25)
  private String languageCode;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>PersonProfile</code>
   */
  public PersonProfile() {
    super();
  }

  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
