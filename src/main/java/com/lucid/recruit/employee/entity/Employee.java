/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.employee.entity;

import java.math.BigDecimal;
import java.util.List;
import com.lucid.core.entity.AuditableEntity;
import com.lucid.recruit.person.entity.PersonLegal;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * A special classification of the Employee e.g. a VIP, Owner, Highly Compensated, Stock Owner,
 * Executive, Officer, etc.
 * 
 * @author sgutti
 * @date 09-Feb-2023 10:33:39 pm
 */
@Entity
@Table(name = Employee.TABLE_NAME)
public class Employee extends AuditableEntity {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = 2684871273824272653L;
  public static final String TABLE_NAME = "e_employee";
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "employee_id", nullable = false, length = 75)
  private String employeeID;

  @Column(name = "language", nullable = true, length = 25)
  private String language;

  // generated based on the employer requirement, if not would be integer
  @Column(name = "employee_code", nullable = false, length = 15)
  private String employeeCode;

  @Column(name = "person_legal_id", nullable = false, length = 75)
  private String personLegalID;

  // The primary address where the work is performed.
  @Column(name = "work_location_id", nullable = true, length = 75)
  private String primaryWorkLocationID;


  // The relationship of the worker to the organization. Options are Employee, Vendor Employee,
  // Independent Contractor, Volunteer.
  @Column(name = "worker_type_code", nullable = true, length = 25)
  private String workerTypeCode;

  // The date and status of the worker in relation to the assignment.
  @Column(name = "work_rship_status_id", nullable = false, length = 75)
  private String workRelationshipStatusID;

  // This determines if a person is covered by wage hour laws. In the US, a person would be
  // considered non-exempt if the indicator is true (they are covered under the law).
  @Column(name = "wage_hour_law_coverage_ind", nullable = true)
  private Boolean wageHourLawCoverageIndicator;


  // Indicates if the person is part of a labor bargaining unit, such as a union.
  @Column(name = "labor_bargaining_unit_ind", nullable = true)
  private Boolean laborBargainingUnitIndicator;

  // An indicator of whether the employee is covered by some type of unemployment insurance.
  @Column(name = "unemplymnt_comp_coverage_ind", nullable = true)
  private Boolean unemploymentCompensationCoverageIndicator;

  // An indicator of whether the employee is covered by some type of worker compensation insurance.
  @Column(name = "worker_comp_coverage_ind", nullable = true)
  private Boolean workerCompensationCoverageIndicator;


  // Indicates whether the worker is classified as an officer.
  @Column(name = "officer_ind", nullable = true)
  private Boolean officerIndicator;

  // Indicates whether the worker is a stock owner.
  @Column(name = "stock_owner_ind", nullable = true)
  private Boolean stockOwnerIndicator;

  // The percentage of stock ownership.
  @Column(name = "stock_owner_percent", nullable = true)
  private BigDecimal stockOwnerPercentage;

  // How often the pay cycle occurs or how often a person is paid, e.g., weekly, biweekly, etc.
  @Column(name = "pay_cycle_interval_code", nullable = true, length = 25)
  private String payCycleIntervalCode;

  // Work Assignments
  @OneToMany(fetch = FetchType.EAGER, mappedBy = "employee")
  private List<EmployeeWorkAssignment> workAssignments;


  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "person_legal_id", nullable = false, insertable = false, updatable = false)
  private PersonLegal personLegal;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>Employee</code>
   */
  public Employee() {
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
   * @return Returns the workAssignments.
   */
  public List<EmployeeWorkAssignment> getWorkAssignments() {
    return workAssignments;
  }

  /**
   * @param workAssignments The workAssignments to set.
   */
  public void setWorkAssignments(List<EmployeeWorkAssignment> workAssignments) {
    this.workAssignments = workAssignments;
  }

  /**
   * @return Returns the personLegal.
   */
  public PersonLegal getPersonLegal() {
    return personLegal;
  }

  /**
   * @param personLegal The personLegal to set.
   */
  public void setPersonLegal(PersonLegal personLegal) {
    this.personLegal = personLegal;
  }

  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
