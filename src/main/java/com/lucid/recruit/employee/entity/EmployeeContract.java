/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.employee.entity;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


/**
 * Describes the relationship between the employer and worker.
 * 
 * @author sgutti
 * @date 11-Feb-2023 6:35:17 pm
 *
 */
@Entity
@Table(name = EmployeeContract.TABLE_NAME)
public class EmployeeContract extends EmployeeBased {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = -9036287679935499011L;
  public static final String TABLE_NAME = "e_emp_contract";
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "emp_contract_id", nullable = false, length = 75)
  private String employeeContractID;

  @Column(name = "contract_nbr", nullable = true, length = 25)
  private String contractNumber;

  @Column(name = "contract_start_dt", nullable = true)
  private Date contractStartDate;

  @Column(name = "contract_end_dt", nullable = true)
  private Date contractEndDate;

  // TODO - addendum

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>EmployeeContract</code>
   */
  public EmployeeContract() {
    super();
  }

  // ---------------------------------------------------------- Public Methods

  /**
   * @return Returns the employeeContractID.
   */
  public String getEmployeeContractID() {
    return employeeContractID;
  }


  /**
   * @param employeeContractID The employeeContractID to set.
   */
  public void setEmployeeContractID(String employeeContractID) {
    this.employeeContractID = employeeContractID;
  }


  /**
   * @return Returns the contractNumber.
   */
  public String getContractNumber() {
    return contractNumber;
  }


  /**
   * @param contractNumber The contractNumber to set.
   */
  public void setContractNumber(String contractNumber) {
    this.contractNumber = contractNumber;
  }


  /**
   * @return Returns the contractStartDate.
   */
  public Date getContractStartDate() {
    return contractStartDate;
  }


  /**
   * @param contractStartDate The contractStartDate to set.
   */
  public void setContractStartDate(Date contractStartDate) {
    this.contractStartDate = contractStartDate;
  }


  /**
   * @return Returns the contractEndDate.
   */
  public Date getContractEndDate() {
    return contractEndDate;
  }


  /**
   * @param contractEndDate The contractEndDate to set.
   */
  public void setContractEndDate(Date contractEndDate) {
    this.contractEndDate = contractEndDate;
  }

  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
