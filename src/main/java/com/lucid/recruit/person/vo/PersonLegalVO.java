/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.person.vo;

import java.util.Date;
import java.util.List;
import com.lucid.core.vo.BaseVO;
import com.lucid.recruit.person.entity.PersonLegalCmnc;
import jakarta.persistence.Embedded;


/**
 * @author sgutti
 * @date 18-Mar-2023 9:49:12 am
 *
 */
public class PersonLegalVO extends BaseVO {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = 4523594310779699560L;

  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  private String personLegalID;
  private String legalId;
  private String previousLegalId;
  private Date birthDate;
  // The gender of a person.
  private String gender;
  // The citizenships that a person holds. This is a legal citizenship in a country (as opposed to
  // nationality which may or may not be a country).
  private String citizenship;

  // The country (or countries) where a person currently resides.
  private String residenceCountry;

  // The military status of a person.
  private String militaryStatus;

  // The ethnicity (or ethnicities) of a person. A country may define which of these terms (race,
  // nationality, ethnicity) be used and how they are defined. One or more properties may be used by
  // a country. A predefined country list allows a person to specify their ethnicity.
  private String ethnicity;


  @Embedded
  private BasePersonNameVO name;

  private List<PersonLegalCmnc> communiation;

  private String primaryLanguage;

  // The surname of the father of the person.
  private String fatherName;


  // The surname of the mother of the person.
  private String motherName;

  // The identified race(s) of the person. A country may define which of these terms (race,
  // nationality, ethnicity) will be used and how they are defined. One or more properties may be
  // used by a country. A predefined country list allows a person to specify their race.
  private String race;

  // The birth place of the person.
  private String birthPlace;

  // If the person is deceased, the legal date that the person died.
  private Date deathDate;

  // The nationality (or nationalities) of the person. A country may define which of these terms
  // (race, nationality, ethnicity) be used and how they are defined. One or more properties may be
  // used by a country. A predefined country list allows a person to specify their nationality.
  private String nationality;

  // The marital status of the person.
  private String maritalStatus;

  private Date maritalStatusDate;

  // The religions of the person of the person.
  private String religion;

  // The type of student (if the person is a student). Typically used to indicate 'full-time' or
  // 'part-time' status.
  private String studentType;

  // An indicator as to whether the individual currently is enrolled as a student within a specific
  // class of educational institution. This is component is attributed with effective dating.
  private Boolean studentIndicator;

  // The status of the student (if the person is a student). Typically used to indicate special
  // states such as 'Suspended'.
  private String studentStatus;

  private Boolean disabilityIndicator;

  // The permissions of a person to work (within an administrative unit).
  // private List<EmploymentPermit> employmentPermits;


  // Legal Documents.
  // private List<LegalDocument> legalDocuments;


  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>PersonLegalVO</code>
   */
  public PersonLegalVO() {
    super();
  }
  // ---------------------------------------------------------- Public Methods


  /**
   * @return Returns the personLegalID.
   */
  public String getPersonLegalID() {
    return personLegalID;
  }


  /**
   * @return Returns the legalId.
   */
  public String getLegalId() {
    return legalId;
  }


  /**
   * @return Returns the previousLegalId.
   */
  public String getPreviousLegalId() {
    return previousLegalId;
  }


  /**
   * @return Returns the birthDate.
   */
  public Date getBirthDate() {
    return birthDate;
  }


  /**
   * @return Returns the gender.
   */
  public String getGender() {
    return gender;
  }


  /**
   * @return Returns the citizenship.
   */
  public String getCitizenship() {
    return citizenship;
  }


  /**
   * @return Returns the residenceCountry.
   */
  public String getResidenceCountry() {
    return residenceCountry;
  }


  /**
   * @return Returns the militaryStatus.
   */
  public String getMilitaryStatus() {
    return militaryStatus;
  }


  /**
   * @return Returns the ethnicity.
   */
  public String getEthnicity() {
    return ethnicity;
  }


  /**
   * @return Returns the name.
   */
  public BasePersonNameVO getName() {
    return name;
  }


  /**
   * @return Returns the communiation.
   */
  public List<PersonLegalCmnc> getCommuniation() {
    return communiation;
  }


  /**
   * @return Returns the primaryLanguage.
   */
  public String getPrimaryLanguage() {
    return primaryLanguage;
  }


  /**
   * @return Returns the fatherName.
   */
  public String getFatherName() {
    return fatherName;
  }


  /**
   * @return Returns the motherName.
   */
  public String getMotherName() {
    return motherName;
  }


  /**
   * @return Returns the race.
   */
  public String getRace() {
    return race;
  }


  /**
   * @return Returns the birthPlace.
   */
  public String getBirthPlace() {
    return birthPlace;
  }


  /**
   * @return Returns the deathDate.
   */
  public Date getDeathDate() {
    return deathDate;
  }


  /**
   * @return Returns the nationality.
   */
  public String getNationality() {
    return nationality;
  }


  /**
   * @return Returns the maritalStatus.
   */
  public String getMaritalStatus() {
    return maritalStatus;
  }


  /**
   * @return Returns the maritalStatusDate.
   */
  public Date getMaritalStatusDate() {
    return maritalStatusDate;
  }


  /**
   * @return Returns the religion.
   */
  public String getReligion() {
    return religion;
  }


  /**
   * @return Returns the studentType.
   */
  public String getStudentType() {
    return studentType;
  }


  /**
   * @return Returns the studentIndicator.
   */
  public Boolean getStudentIndicator() {
    return studentIndicator;
  }


  /**
   * @return Returns the studentStatus.
   */
  public String getStudentStatus() {
    return studentStatus;
  }


  /**
   * @return Returns the disabilityIndicator.
   */
  public Boolean getDisabilityIndicator() {
    return disabilityIndicator;
  }


  /**
   * @param personLegalID The personLegalID to set.
   */
  public void setPersonLegalID(String personLegalID) {
    this.personLegalID = personLegalID;
  }


  /**
   * @param legalId The legalId to set.
   */
  public void setLegalId(String legalId) {
    this.legalId = legalId;
  }


  /**
   * @param previousLegalId The previousLegalId to set.
   */
  public void setPreviousLegalId(String previousLegalId) {
    this.previousLegalId = previousLegalId;
  }


  /**
   * @param birthDate The birthDate to set.
   */
  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }


  /**
   * @param gender The gender to set.
   */
  public void setGender(String gender) {
    this.gender = gender;
  }


  /**
   * @param citizenship The citizenship to set.
   */
  public void setCitizenship(String citizenship) {
    this.citizenship = citizenship;
  }


  /**
   * @param residenceCountry The residenceCountry to set.
   */
  public void setResidenceCountry(String residenceCountry) {
    this.residenceCountry = residenceCountry;
  }


  /**
   * @param militaryStatus The militaryStatus to set.
   */
  public void setMilitaryStatus(String militaryStatus) {
    this.militaryStatus = militaryStatus;
  }


  /**
   * @param ethnicity The ethnicity to set.
   */
  public void setEthnicity(String ethnicity) {
    this.ethnicity = ethnicity;
  }


  /**
   * @param name The name to set.
   */
  public void setName(BasePersonNameVO name) {
    this.name = name;
  }


  /**
   * @param communiation The communiation to set.
   */
  public void setCommuniation(List<PersonLegalCmnc> communiation) {
    this.communiation = communiation;
  }


  /**
   * @param primaryLanguage The primaryLanguage to set.
   */
  public void setPrimaryLanguage(String primaryLanguage) {
    this.primaryLanguage = primaryLanguage;
  }


  /**
   * @param fatherName The fatherName to set.
   */
  public void setFatherName(String fatherName) {
    this.fatherName = fatherName;
  }


  /**
   * @param motherName The motherName to set.
   */
  public void setMotherName(String motherName) {
    this.motherName = motherName;
  }


  /**
   * @param race The race to set.
   */
  public void setRace(String race) {
    this.race = race;
  }


  /**
   * @param birthPlace The birthPlace to set.
   */
  public void setBirthPlace(String birthPlace) {
    this.birthPlace = birthPlace;
  }


  /**
   * @param deathDate The deathDate to set.
   */
  public void setDeathDate(Date deathDate) {
    this.deathDate = deathDate;
  }


  /**
   * @param nationality The nationality to set.
   */
  public void setNationality(String nationality) {
    this.nationality = nationality;
  }


  /**
   * @param maritalStatus The maritalStatus to set.
   */
  public void setMaritalStatus(String maritalStatus) {
    this.maritalStatus = maritalStatus;
  }


  /**
   * @param maritalStatusDate The maritalStatusDate to set.
   */
  public void setMaritalStatusDate(Date maritalStatusDate) {
    this.maritalStatusDate = maritalStatusDate;
  }


  /**
   * @param religion The religion to set.
   */
  public void setReligion(String religion) {
    this.religion = religion;
  }


  /**
   * @param studentType The studentType to set.
   */
  public void setStudentType(String studentType) {
    this.studentType = studentType;
  }


  /**
   * @param studentIndicator The studentIndicator to set.
   */
  public void setStudentIndicator(Boolean studentIndicator) {
    this.studentIndicator = studentIndicator;
  }


  /**
   * @param studentStatus The studentStatus to set.
   */
  public void setStudentStatus(String studentStatus) {
    this.studentStatus = studentStatus;
  }


  /**
   * @param disabilityIndicator The disabilityIndicator to set.
   */
  public void setDisabilityIndicator(Boolean disabilityIndicator) {
    this.disabilityIndicator = disabilityIndicator;
  }

  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
