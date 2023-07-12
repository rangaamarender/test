/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.employee.vo;

import java.math.BigDecimal;
import com.lucid.core.vo.BaseVO;
import com.lucid.recruit.person.vo.PersonLegalVO;


/**
 * @author sgutti
 * @date 17-Mar-2023 7:23:51 am
 *
 */
public class EmployeeVO extends BaseVO {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = 3882045301555655668L;

  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  private String employeeID;

  private String language;

  // generated based on the employer requirement, if not would be integer
  private String employeeCode;

  private String personLegalID;

  // The primary address where the work is performed.
  private String primaryWorkLocationID;


  // The relationship of the worker to the organization. Options are Employee, Vendor Employee,
  // Independent Contractor, Volunteer.
  private String workerTypeCode;

  // The date and status of the worker in relation to the assignment.
  private String workRelationshipStatusID;

  // This determines if a person is covered by wage hour laws. In the US, a person would be
  // considered non-exempt if the indicator is true (they are covered under the law).
  private Boolean wageHourLawCoverageIndicator;


  // Indicates if the person is part of a labor bargaining unit, such as a union.
  private Boolean laborBargainingUnitIndicator;

  // An indicator of whether the employee is covered by some type of unemployment insurance.
  private Boolean unemploymentCompensationCoverageIndicator;

  // An indicator of whether the employee is covered by some type of worker compensation insurance.
  private Boolean workerCompensationCoverageIndicator;


  // Indicates whether the worker is classified as an officer.
  private Boolean officerIndicator;

  // Indicates whether the worker is a stock owner.
  private Boolean stockOwnerIndicator;

  // The percentage of stock ownership.
  private BigDecimal stockOwnerPercentage;

  // How often the pay cycle occurs or how often a person is paid, e.g., weekly, biweekly, etc.
  private String payCycleIntervalCode;

  // Work Assignments
  // private List<EmployeeWorkAssignment> workAssignments;


  private PersonLegalVO personLegal;


  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>EmployeeVO</code>
   */
  public EmployeeVO() {
    super();
  }
  // ---------------------------------------------------------- Public Methods


  /**
   * @return Returns the employeeID.
   */
  public String getEmployeeID() {
    return employeeID;
  }


  /**
   * @param employeeID The employeeID to set.
   */
  public void setEmployeeID(String employeeID) {
    this.employeeID = employeeID;
  }


  /**
   * @return Returns the language.
   */
  public String getLanguage() {
    return language;
  }


  /**
   * @param language The language to set.
   */
  public void setLanguage(String language) {
    this.language = language;
  }


  /**
   * @return Returns the employeeCode.
   */
  public String getEmployeeCode() {
    return employeeCode;
  }


  /**
   * @param employeeCode The employeeCode to set.
   */
  public void setEmployeeCode(String employeeCode) {
    this.employeeCode = employeeCode;
  }


  /**
   * @return Returns the personLegalID.
   */
  public String getPersonLegalID() {
    return personLegalID;
  }


  /**
   * @param personLegalID The personLegalID to set.
   */
  public void setPersonLegalID(String personLegalID) {
    this.personLegalID = personLegalID;
  }


  /**
   * @return Returns the primaryWorkLocationID.
   */
  public String getPrimaryWorkLocationID() {
    return primaryWorkLocationID;
  }


  /**
   * @param primaryWorkLocationID The primaryWorkLocationID to set.
   */
  public void setPrimaryWorkLocationID(String primaryWorkLocationID) {
    this.primaryWorkLocationID = primaryWorkLocationID;
  }


  /**
   * @return Returns the workerTypeCode.
   */
  public String getWorkerTypeCode() {
    return workerTypeCode;
  }


  /**
   * @param workerTypeCode The workerTypeCode to set.
   */
  public void setWorkerTypeCode(String workerTypeCode) {
    this.workerTypeCode = workerTypeCode;
  }


  /**
   * @return Returns the workRelationshipStatusID.
   */
  public String getWorkRelationshipStatusID() {
    return workRelationshipStatusID;
  }


  /**
   * @param workRelationshipStatusID The workRelationshipStatusID to set.
   */
  public void setWorkRelationshipStatusID(String workRelationshipStatusID) {
    this.workRelationshipStatusID = workRelationshipStatusID;
  }


  /**
   * @return Returns the wageHourLawCoverageIndicator.
   */
  public Boolean getWageHourLawCoverageIndicator() {
    return wageHourLawCoverageIndicator;
  }


  /**
   * @param wageHourLawCoverageIndicator The wageHourLawCoverageIndicator to set.
   */
  public void setWageHourLawCoverageIndicator(Boolean wageHourLawCoverageIndicator) {
    this.wageHourLawCoverageIndicator = wageHourLawCoverageIndicator;
  }


  /**
   * @return Returns the laborBargainingUnitIndicator.
   */
  public Boolean getLaborBargainingUnitIndicator() {
    return laborBargainingUnitIndicator;
  }


  /**
   * @param laborBargainingUnitIndicator The laborBargainingUnitIndicator to set.
   */
  public void setLaborBargainingUnitIndicator(Boolean laborBargainingUnitIndicator) {
    this.laborBargainingUnitIndicator = laborBargainingUnitIndicator;
  }


  /**
   * @return Returns the unemploymentCompensationCoverageIndicator.
   */
  public Boolean getUnemploymentCompensationCoverageIndicator() {
    return unemploymentCompensationCoverageIndicator;
  }


  /**
   * @param unemploymentCompensationCoverageIndicator The unemploymentCompensationCoverageIndicator
   *        to set.
   */
  public void setUnemploymentCompensationCoverageIndicator(
      Boolean unemploymentCompensationCoverageIndicator) {
    this.unemploymentCompensationCoverageIndicator = unemploymentCompensationCoverageIndicator;
  }


  /**
   * @return Returns the workerCompensationCoverageIndicator.
   */
  public Boolean getWorkerCompensationCoverageIndicator() {
    return workerCompensationCoverageIndicator;
  }


  /**
   * @param workerCompensationCoverageIndicator The workerCompensationCoverageIndicator to set.
   */
  public void setWorkerCompensationCoverageIndicator(Boolean workerCompensationCoverageIndicator) {
    this.workerCompensationCoverageIndicator = workerCompensationCoverageIndicator;
  }


  /**
   * @return Returns the officerIndicator.
   */
  public Boolean getOfficerIndicator() {
    return officerIndicator;
  }


  /**
   * @param officerIndicator The officerIndicator to set.
   */
  public void setOfficerIndicator(Boolean officerIndicator) {
    this.officerIndicator = officerIndicator;
  }


  /**
   * @return Returns the stockOwnerIndicator.
   */
  public Boolean getStockOwnerIndicator() {
    return stockOwnerIndicator;
  }


  /**
   * @param stockOwnerIndicator The stockOwnerIndicator to set.
   */
  public void setStockOwnerIndicator(Boolean stockOwnerIndicator) {
    this.stockOwnerIndicator = stockOwnerIndicator;
  }


  /**
   * @return Returns the stockOwnerPercentage.
   */
  public BigDecimal getStockOwnerPercentage() {
    return stockOwnerPercentage;
  }


  /**
   * @param stockOwnerPercentage The stockOwnerPercentage to set.
   */
  public void setStockOwnerPercentage(BigDecimal stockOwnerPercentage) {
    this.stockOwnerPercentage = stockOwnerPercentage;
  }


  /**
   * @return Returns the payCycleIntervalCode.
   */
  public String getPayCycleIntervalCode() {
    return payCycleIntervalCode;
  }


  /**
   * @param payCycleIntervalCode The payCycleIntervalCode to set.
   */
  public void setPayCycleIntervalCode(String payCycleIntervalCode) {
    this.payCycleIntervalCode = payCycleIntervalCode;
  }


  /**
   * @return Returns the personLegal.
   */
  public PersonLegalVO getPersonLegal() {
    return personLegal;
  }


  /**
   * @param personLegal The personLegal to set.
   */
  public void setPersonLegal(PersonLegalVO personLegal) {
    this.personLegal = personLegal;
  }

  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
