/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.person.vo;

import com.lucid.core.vo.BaseVO;

/**
 * @author sgutti
 * @date 18-Mar-2023 9:55:27 am
 *
 */
public class BasePersonNameVO extends BaseVO {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = -187218195074383712L;

  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  private String formattedName;
  private String legalName;
  private String givenName;
  private String preferredName;
  private String middleName;
  private String family;
  private String familyPrefix;
  private String alais;
  private String preferredSalutationCode;
  private String generationAffixCode;
  private String qualificationAffixCode;
  private String titleAffixCode;
  private String initials;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>BasePersonNameVO</code>
   */
  public BasePersonNameVO() {
    super();
  }
  // ---------------------------------------------------------- Public Methods


  /**
   * @return Returns the formattedName.
   */
  public String getFormattedName() {
    return formattedName;
  }


  /**
   * @return Returns the legalName.
   */
  public String getLegalName() {
    return legalName;
  }


  /**
   * @return Returns the givenName.
   */
  public String getGivenName() {
    return givenName;
  }


  /**
   * @return Returns the preferredName.
   */
  public String getPreferredName() {
    return preferredName;
  }


  /**
   * @return Returns the middleName.
   */
  public String getMiddleName() {
    return middleName;
  }


  /**
   * @return Returns the family.
   */
  public String getFamily() {
    return family;
  }


  /**
   * @return Returns the familyPrefix.
   */
  public String getFamilyPrefix() {
    return familyPrefix;
  }


  /**
   * @return Returns the alais.
   */
  public String getAlais() {
    return alais;
  }


  /**
   * @return Returns the preferredSalutationCode.
   */
  public String getPreferredSalutationCode() {
    return preferredSalutationCode;
  }


  /**
   * @return Returns the generationAffixCode.
   */
  public String getGenerationAffixCode() {
    return generationAffixCode;
  }


  /**
   * @return Returns the qualificationAffixCode.
   */
  public String getQualificationAffixCode() {
    return qualificationAffixCode;
  }


  /**
   * @return Returns the titleAffixCode.
   */
  public String getTitleAffixCode() {
    return titleAffixCode;
  }


  /**
   * @return Returns the initials.
   */
  public String getInitials() {
    return initials;
  }


  /**
   * @param formattedName The formattedName to set.
   */
  public void setFormattedName(String formattedName) {
    this.formattedName = formattedName;
  }


  /**
   * @param legalName The legalName to set.
   */
  public void setLegalName(String legalName) {
    this.legalName = legalName;
  }


  /**
   * @param givenName The givenName to set.
   */
  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }


  /**
   * @param preferredName The preferredName to set.
   */
  public void setPreferredName(String preferredName) {
    this.preferredName = preferredName;
  }


  /**
   * @param middleName The middleName to set.
   */
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }


  /**
   * @param family The family to set.
   */
  public void setFamily(String family) {
    this.family = family;
  }


  /**
   * @param familyPrefix The familyPrefix to set.
   */
  public void setFamilyPrefix(String familyPrefix) {
    this.familyPrefix = familyPrefix;
  }


  /**
   * @param alais The alais to set.
   */
  public void setAlais(String alais) {
    this.alais = alais;
  }


  /**
   * @param preferredSalutationCode The preferredSalutationCode to set.
   */
  public void setPreferredSalutationCode(String preferredSalutationCode) {
    this.preferredSalutationCode = preferredSalutationCode;
  }


  /**
   * @param generationAffixCode The generationAffixCode to set.
   */
  public void setGenerationAffixCode(String generationAffixCode) {
    this.generationAffixCode = generationAffixCode;
  }


  /**
   * @param qualificationAffixCode The qualificationAffixCode to set.
   */
  public void setQualificationAffixCode(String qualificationAffixCode) {
    this.qualificationAffixCode = qualificationAffixCode;
  }


  /**
   * @param titleAffixCode The titleAffixCode to set.
   */
  public void setTitleAffixCode(String titleAffixCode) {
    this.titleAffixCode = titleAffixCode;
  }


  /**
   * @param initials The initials to set.
   */
  public void setInitials(String initials) {
    this.initials = initials;
  }
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
