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
 * Provides termination details.
 * 
 * @author sgutti
 * @date 11-Feb-2023 7:06:27 pm
 *
 */
@Entity
@Table(name = EmployeeTermination.TABLE_NAME)
public class EmployeeTermination extends EmployeeBased {


  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = -71219594586198750L;
  public static final String TABLE_NAME = "e_emp_termination";

  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "emp_termination_id", nullable = false, length = 75)
  private String employeeTerminationID;

  // Retirement, Voluntary (subcategory), Involuntary (subcategory), Transfer, Business Sold. In EU
  // - info must be sent to government but the codes are provided by the government. Will use
  // IdentifierType. This allows us to define who owns the list and the list value.
  @Column(name = "reason_code", nullable = true, length = 25)
  private String reasonCode;

  // Date the contract is complete or the worker is terminated.
  @Column(name = "termination_dt", nullable = true)
  private Date terminationDate;

  // May need for statutory purposes. For example, we will pay you through end of month but your
  // last worked day was on the 15th. Access turned off, etc from an HR perspective.
  @Column(name = "last_worked_dt", nullable = true)
  private Date lastWorkedDate;

  // The date the worker was last paid. High level workers that have terminated but the salary may
  // carry on for a few more months. Or Date the recurring payment is turned off.
  @Column(name = "last_paid_dt", nullable = true)
  private Date lastPaidDate;

  // Last day the worker is intending to work.
  @Column(name = "intended_dt", nullable = true)
  private Date intendedDate;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>EmployeeTermination</code>
   */
  public EmployeeTermination() {
    super();
  }

  // ---------------------------------------------------------- Public Methods
  /**
   * @return Returns the employeeTerminationID.
   */
  public String getEmployeeTerminationID() {
    return employeeTerminationID;
  }

  /**
   * @param employeeTerminationID The employeeTerminationID to set.
   */
  public void setEmployeeTerminationID(String employeeTerminationID) {
    this.employeeTerminationID = employeeTerminationID;
  }

  /**
   * @return Returns the reasonCode.
   */
  public String getReasonCode() {
    return reasonCode;
  }

  /**
   * @param reasonCode The reasonCode to set.
   */
  public void setReasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
  }

  /**
   * @return Returns the terminationDate.
   */
  public Date getTerminationDate() {
    return terminationDate;
  }

  /**
   * @param terminationDate The terminationDate to set.
   */
  public void setTerminationDate(Date terminationDate) {
    this.terminationDate = terminationDate;
  }

  /**
   * @return Returns the lastWorkedDate.
   */
  public Date getLastWorkedDate() {
    return lastWorkedDate;
  }

  /**
   * @param lastWorkedDate The lastWorkedDate to set.
   */
  public void setLastWorkedDate(Date lastWorkedDate) {
    this.lastWorkedDate = lastWorkedDate;
  }

  /**
   * @return Returns the lastPaidDate.
   */
  public Date getLastPaidDate() {
    return lastPaidDate;
  }

  /**
   * @param lastPaidDate The lastPaidDate to set.
   */
  public void setLastPaidDate(Date lastPaidDate) {
    this.lastPaidDate = lastPaidDate;
  }

  /**
   * @return Returns the intendedDate.
   */
  public Date getIntendedDate() {
    return intendedDate;
  }

  /**
   * @param intendedDate The intendedDate to set.
   */
  public void setIntendedDate(Date intendedDate) {
    this.intendedDate = intendedDate;
  }
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
