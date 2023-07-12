/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.contract.entity;

import com.lucid.core.entity.BaseEntity;
import com.lucid.recruit.org.entity.Organization;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * @author sgutti
 * @date 09-Jan-2023 10:10:57 pm
 */
//@Entity
@Table(name = ContractClient.TABLE_NAME)
public class ContractClient extends BaseEntity {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = 2802777372903198187L;
  public static final String TABLE_NAME = "c_cntrct_client";
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Id
  @Column(name = "cntrct_id", nullable = false, length = 75)
  private String contractID;

  @Column(name = "org_id", nullable = false, length = 75)
  private String organizationID;

  @Column(name = "work_location_id", nullable = true, length = 75)
  private String workLocationID;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "cntrct_id", nullable = false, insertable = false, updatable = false)
  private Contract contract;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "org_id", nullable = false, insertable = false, updatable = false)
  private Organization organization;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>ContractClient</code>
   */
  public ContractClient() {
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
   * @return Returns the workLocationID.
   */
  public String getWorkLocationID() {
    return workLocationID;
  }

  /**
   * @param workLocationID The workLocationID to set.
   */
  public void setWorkLocationID(String workLocationID) {
    this.workLocationID = workLocationID;
  }

  /**
   * @return Returns the contract.
   */
  public Contract getContract() {
    return contract;
  }

  /**
   * @param contract The contract to set.
   */
  public void setContract(Contract contract) {
    this.contract = contract;
  }

  /**
   * @return Returns the organization.
   */
  public Organization getOrganization() {
    return organization;
  }

  /**
   * @param organization The organization to set.
   */
  public void setOrganization(Organization organization) {
    this.organization = organization;
  }
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
