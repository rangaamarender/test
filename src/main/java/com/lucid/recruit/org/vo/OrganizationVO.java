/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.org.vo;

import com.lucid.core.vo.BaseVO;
import com.lucid.recruit.org.constants.OrgStatus;


/**
 * @author sgutti
 * @date 16-Mar-2023 5:50:49 am
 *
 */
public class OrganizationVO extends BaseVO {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = -1279820498407966403L;

  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  private String organizationID;
  private String responsibilityCode;
  private Long communicationID;
  private String name;
  private String description;
  private String code;
  private String taxId;
  private String legalId;
  private String industryCode;
  private String companySizeCode;
  private String annualRevenueCode;
  private String geoResponsibilityCode;
  private String ownershipTypeCode;
  private String stockSymbol;
  private String workEnvironmentCode;
  private String tradeName;
  private OrgStatus statusCode;
  private String domainName;
  private String parentCompanyTaxId;
  private String parentCompanyName;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>OrganizationVO</code>
   */
  public OrganizationVO() {
    super();
  }

  // ---------------------------------------------------------- Public Methods
  /**
   * @return Returns the organizationID.
   */
  public String getOrganizationID() {
    return organizationID;
  }


  /**
   * @param organizationID The organizationID to set.
   */
  public void setOrganizationID(String organizationID) {
    this.organizationID = organizationID;
  }


  /**
   * @return Returns the responsibilityCode.
   */
  public String getResponsibilityCode() {
    return responsibilityCode;
  }


  /**
   * @param responsibilityCode The responsibilityCode to set.
   */
  public void setResponsibilityCode(String responsibilityCode) {
    this.responsibilityCode = responsibilityCode;
  }


  /**
   * @return Returns the communicationID.
   */
  public Long getCommunicationID() {
    return communicationID;
  }


  /**
   * @param communicationID The communicationID to set.
   */
  public void setCommunicationID(Long communicationID) {
    this.communicationID = communicationID;
  }


  /**
   * @return Returns the name.
   */
  public String getName() {
    return name;
  }


  /**
   * @param name The name to set.
   */
  public void setName(String name) {
    this.name = name;
  }


  /**
   * @return Returns the description.
   */
  public String getDescription() {
    return description;
  }


  /**
   * @param description The description to set.
   */
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * @return Returns the code.
   */
  public String getCode() {
    return code;
  }


  /**
   * @param code The code to set.
   */
  public void setCode(String code) {
    this.code = code;
  }


  /**
   * @return Returns the taxId.
   */
  public String getTaxId() {
    return taxId;
  }


  /**
   * @param taxId The taxId to set.
   */
  public void setTaxId(String taxId) {
    this.taxId = taxId;
  }


  /**
   * @return Returns the legalId.
   */
  public String getLegalId() {
    return legalId;
  }


  /**
   * @param legalId The legalId to set.
   */
  public void setLegalId(String legalId) {
    this.legalId = legalId;
  }


  /**
   * @return Returns the industryCode.
   */
  public String getIndustryCode() {
    return industryCode;
  }


  /**
   * @param industryCode The industryCode to set.
   */
  public void setIndustryCode(String industryCode) {
    this.industryCode = industryCode;
  }


  /**
   * @return Returns the companySizeCode.
   */
  public String getCompanySizeCode() {
    return companySizeCode;
  }


  /**
   * @param companySizeCode The companySizeCode to set.
   */
  public void setCompanySizeCode(String companySizeCode) {
    this.companySizeCode = companySizeCode;
  }


  /**
   * @return Returns the annualRevenueCode.
   */
  public String getAnnualRevenueCode() {
    return annualRevenueCode;
  }


  /**
   * @param annualRevenueCode The annualRevenueCode to set.
   */
  public void setAnnualRevenueCode(String annualRevenueCode) {
    this.annualRevenueCode = annualRevenueCode;
  }


  /**
   * @return Returns the geoResponsibilityCode.
   */
  public String getGeoResponsibilityCode() {
    return geoResponsibilityCode;
  }


  /**
   * @param geoResponsibilityCode The geoResponsibilityCode to set.
   */
  public void setGeoResponsibilityCode(String geoResponsibilityCode) {
    this.geoResponsibilityCode = geoResponsibilityCode;
  }


  /**
   * @return Returns the ownershipTypeCode.
   */
  public String getOwnershipTypeCode() {
    return ownershipTypeCode;
  }


  /**
   * @param ownershipTypeCode The ownershipTypeCode to set.
   */
  public void setOwnershipTypeCode(String ownershipTypeCode) {
    this.ownershipTypeCode = ownershipTypeCode;
  }


  /**
   * @return Returns the stockSymbol.
   */
  public String getStockSymbol() {
    return stockSymbol;
  }


  /**
   * @param stockSymbol The stockSymbol to set.
   */
  public void setStockSymbol(String stockSymbol) {
    this.stockSymbol = stockSymbol;
  }


  /**
   * @return Returns the workEnvironmentCode.
   */
  public String getWorkEnvironmentCode() {
    return workEnvironmentCode;
  }


  /**
   * @param workEnvironmentCode The workEnvironmentCode to set.
   */
  public void setWorkEnvironmentCode(String workEnvironmentCode) {
    this.workEnvironmentCode = workEnvironmentCode;
  }


  /**
   * @return Returns the tradeName.
   */
  public String getTradeName() {
    return tradeName;
  }


  /**
   * @param tradeName The tradeName to set.
   */
  public void setTradeName(String tradeName) {
    this.tradeName = tradeName;
  }


  /**
   * @return Returns the statusCode.
   */
  public OrgStatus getStatusCode() {
    return statusCode;
  }


  /**
   * @param statusCode The statusCode to set.
   */
  public void setStatusCode(OrgStatus statusCode) {
    this.statusCode = statusCode;
  }


  /**
   * @return Returns the domainName.
   */
  public String getDomainName() {
    return domainName;
  }


  /**
   * @param domainName The domainName to set.
   */
  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }


  /**
   * @return Returns the parentCompanyTaxId.
   */
  public String getParentCompanyTaxId() {
    return parentCompanyTaxId;
  }


  /**
   * @param parentCompanyTaxId The parentCompanyTaxId to set.
   */
  public void setParentCompanyTaxId(String parentCompanyTaxId) {
    this.parentCompanyTaxId = parentCompanyTaxId;
  }


  /**
   * @return Returns the parentCompanyName.
   */
  public String getParentCompanyName() {
    return parentCompanyName;
  }


  /**
   * @param parentCompanyName The parentCompanyName to set.
   */
  public void setParentCompanyName(String parentCompanyName) {
    this.parentCompanyName = parentCompanyName;
  }

  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
