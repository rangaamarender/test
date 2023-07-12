/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.contract.vo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.lucid.core.vo.BaseVO;
import com.lucid.recruit.contract.constants.EnumContractDocStatus;
import com.lucid.recruit.contract.constants.EnumContractType;
import com.lucid.recruit.contract.entity.ContractWorkOrder;
import com.lucid.recruit.org.vo.OrganizationVO;
import com.lucid.recruit.org.vo.WorkLocationVO;

/**
 * @author sgutti
 * @date 26-Jan-2023 12:27:45 am
 */
public class ContractVO extends BaseVO {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = 5900641764912428002L;
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  private String contractID;
  private String contractCode;
  private String title;
  private String description;
  private String categoryCode;
  private String categoryType;
  private BigDecimal estimatedHours;
  private BigDecimal estimatedBudget;
  private Date startDt;
  private Date endDt;
  private Integer contractType = EnumContractType.LONG_TERM;
  private String contractStatus = EnumContractDocStatus.DRAFT;
  private String multiResource;

  private String organizationID;
  private OrganizationVO organization;
  // Work-location
  private WorkLocationVO workLocation;

  private ContractWorkOrderVO contractWorkOrder;

  private List<ContractWorkOrderRateVO> contractWorkOrderRateList;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>ContractVO</code>
   */
  public ContractVO() {
    super();
  }
  // ---------------------------------------------------------- Public Methods


  /**
   * @return Returns the contractID.
   */
  public String getContractID() {
    return contractID;
  }


  /**
   * @param contractID The contractID to set.
   */
  public void setContractID(String contractID) {
    this.contractID = contractID;
  }


  /**
   * @return Returns the contractCode.
   */
  public String getContractCode() {
    return contractCode;
  }


  /**
   * @param contractCode The contractCode to set.
   */
  public void setContractCode(String contractCode) {
    this.contractCode = contractCode;
  }


  /**
   * @return Returns the title.
   */
  public String getTitle() {
    return title;
  }


  /**
   * @param title The title to set.
   */
  public void setTitle(String title) {
    this.title = title;
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
   * @return Returns the categoryCode.
   */
  public String getCategoryCode() {
    return categoryCode;
  }


  /**
   * @param categoryCode The categoryCode to set.
   */
  public void setCategoryCode(String categoryCode) {
    this.categoryCode = categoryCode;
  }


  /**
   * @return Returns the categoryType.
   */
  public String getCategoryType() {
    return categoryType;
  }


  /**
   * @param categoryType The categoryType to set.
   */
  public void setCategoryType(String categoryType) {
    this.categoryType = categoryType;
  }


  /**
   * @return Returns the estimatedHours.
   */
  public BigDecimal getEstimatedHours() {
    return estimatedHours;
  }


  /**
   * @param estimatedHours The estimatedHours to set.
   */
  public void setEstimatedHours(BigDecimal estimatedHours) {
    this.estimatedHours = estimatedHours;
  }


  /**
   * @return Returns the estimatedBudget.
   */
  public BigDecimal getEstimatedBudget() {
    return estimatedBudget;
  }


  /**
   * @param estimatedBudget The estimatedBudget to set.
   */
  public void setEstimatedBudget(BigDecimal estimatedBudget) {
    this.estimatedBudget = estimatedBudget;
  }


  /**
   * @return Returns the startDt.
   */
  public Date getStartDt() {
    return startDt;
  }


  /**
   * @param startDt The startDt to set.
   */
  public void setStartDt(Date startDt) {
    this.startDt = startDt;
  }


  /**
   * @return Returns the endDt.
   */
  public Date getEndDt() {
    return endDt;
  }


  /**
   * @param endDt The endDt to set.
   */
  public void setEndDt(Date endDt) {
    this.endDt = endDt;
  }


  /**
   * @return Returns the contractType.
   */
  public Integer getContractType() {
    return contractType;
  }


  /**
   * @param contractType The contractType to set.
   */
  public void setContractType(Integer contractType) {
    this.contractType = contractType;
  }


  /**
   * @return Returns the contractStatus.
   */
  public String getContractStatus() {
    return contractStatus;
  }


  /**
   * @param contractStatus The contractStatus to set.
   */
  public void setContractStatus(String contractStatus) {
    this.contractStatus = contractStatus;
  }


  /**
   * @return Returns the multiResource.
   */
  public String getMultiResource() {
    return multiResource;
  }


  /**
   * @param multiResource The multiResource to set.
   */
  public void setMultiResource(String multiResource) {
    this.multiResource = multiResource;
  }



  /**
   * @return Returns the workLocation.
   */
  public WorkLocationVO getWorkLocation() {
    return workLocation;
  }



  /**
   * @param workLocation The workLocation to set.
   */
  public void setWorkLocation(WorkLocationVO workLocation) {
    this.workLocation = workLocation;
  }



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
   * @return Returns the organization.
   */
  public OrganizationVO getOrganization() {
    return organization;
  }



  /**
   * @param organization The organization to set.
   */
  public void setOrganization(OrganizationVO organization) {
    this.organization = organization;
  }

  /**
   * @return ContractWorkOrderVO
   */
  public ContractWorkOrderVO getContractWorkOrder() {
    return contractWorkOrder;
  }

  /**
   * @param contractWorkOrder
   */
  public void setContractWorkOrder(ContractWorkOrderVO contractWorkOrder) {
    this.contractWorkOrder = contractWorkOrder;
  }

  /**
   * @return ContractWorkOrderRateVO
   */
  public List<ContractWorkOrderRateVO> getContractWorkOrderRateList() {
    return contractWorkOrderRateList;
  }

  /**
   * @param contractWorkOrderRateList
   */
  public void setContractWorkOrderRate(List<ContractWorkOrderRateVO> contractWorkOrderRateList) {
    this.contractWorkOrderRateList = contractWorkOrderRateList;
  }
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
