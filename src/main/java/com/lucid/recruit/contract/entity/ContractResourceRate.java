/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.contract.entity;

import com.lucid.core.entity.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * @author sgutti
 * @date 10-Jan-2023 9:29:55 pm
 */
//@Entity
@Table(name = ContractResourceRate.TABLE_NAME)
public class ContractResourceRate extends BaseEntity {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = -4141673431036849538L;
  public static final String TABLE_NAME = "c_cntrct_resrc_rate";
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "cntrct_resrc_rate_rate_id", nullable = false, length = 75)
  private String contractResourceRateID;

  @Column(name = "cntrct_resrc_id", nullable = false, length = 75)
  private String contractResourceID;

  @Column(name = "pay_rate", nullable = false)
  private Double payRate;

  @Column(name = "pay_type", nullable = false, length = 15)
  private String workOrderType;

  @Column(name = "pay_rate_code", nullable = false, length = 15)
  private String payRateCode;

  @Column(name = "discount", nullable = false)
  private Double discount;

  @Column(name = "discount_code", nullable = false, length = 15)
  private String discountCode;

  @Column(name = "net_rate", nullable = false)
  private Double netRate;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "cntrct_resrc_id", nullable = false, insertable = false, updatable = false)
  private ContractResource contractResource;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>WorkOrderRateEntity</code>
   */
  public ContractResourceRate() {
    super();
  }

  // ---------------------------------------------------------- Public Methods

  /**
   * @return contractResourceRateID
   */
  public String getContractResourceRateID() {
    return contractResourceRateID;
  }

  /**
   * @param contractResourceRateID
   */
  public void setContractResourceRateID(String contractResourceRateID) {
    this.contractResourceRateID = contractResourceRateID;
  }

  /**
   * @return contractResourceID
   */
  public String getContractResourceID() {
    return contractResourceID;
  }

  /**
   * @param contractResourceID
   */
  public void setContractResourceID(String contractResourceID) {
    this.contractResourceID = contractResourceID;
  }

  /**
   * @return payRate
   */
  public Double getPayRate() {
    return payRate;
  }

  /**
   * @param payRate
   */
  public void setPayRate(Double payRate) {
    this.payRate = payRate;
  }

  /**
   * @return workOrderType
   */
  public String getWorkOrderType() {
    return workOrderType;
  }

  /**
   * @param workOrderType
   */
  public void setWorkOrderType(String workOrderType) {
    this.workOrderType = workOrderType;
  }

  /**
   * @return payRateCode
   */
  public String getPayRateCode() {
    return payRateCode;
  }

  /**
   * @param payRateCode
   */
  public void setPayRateCode(String payRateCode) {
    this.payRateCode = payRateCode;
  }

  /**
   * @return discount
   */
  public Double getDiscount() {
    return discount;
  }

  /**
   * @param discount
   */
  public void setDiscount(Double discount) {
    this.discount = discount;
  }

  /**
   * @return discountCode
   */
  public String getDiscountCode() {
    return discountCode;
  }

  /**
   * @param discountCode
   */
  public void setDiscountCode(String discountCode) {
    this.discountCode = discountCode;
  }

  /**
   * @return netRate
   */
  public Double getNetRate() {
    return netRate;
  }

  /**
   * @param netRate
   */
  public void setNetRate(Double netRate) {
    this.netRate = netRate;
  }

  /**
   * @return contractResource
   */
  public ContractResource getContractResource() {
    return contractResource;
  }

  /**
   * @param contractResource
   */
  public void setContractResource(ContractResource contractResource) {
    this.contractResource = contractResource;
  }

  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
