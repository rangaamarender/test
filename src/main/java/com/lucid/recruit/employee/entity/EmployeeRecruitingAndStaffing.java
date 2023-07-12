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
 * Provides recruiting and staffing key date information.
 * 
 * @author sgutti
 * @date 11-Feb-2023 8:25:23 pm
 *
 */
@Entity
@Table(name = EmployeeRecruitingAndStaffing.TABLE_NAME)
public class EmployeeRecruitingAndStaffing extends EmployeeBased {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = 141385392495441607L;
  public static final String TABLE_NAME = "e_emp_recr_staff";
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "emp_recrstaff_id", nullable = false, length = 75)
  private String employeeRecrStaffID;

  // The date of the application submission by the candidate.
  @Column(name = "application_dt", nullable = true)
  private Date applicationDate;

  // The date of the application was rejected or withdrawn.
  @Column(name = "rejection_dt", nullable = true)
  private Date rejectionDate;

  // The reason for the application rejection or withdrawal.
  @Column(name = "rejection_reason_code", nullable = true, length = 25)
  private Date rejectionReasonCode;

  // The date that the initial offer was made.
  @Column(name = "offered_on_dt", nullable = true)
  private Date offeredOnDate;

  // The date that the final offer was accepted.
  @Column(name = "offer_accepted_dt", nullable = true)
  private Date offerAcceptedDate;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>EmployeeRecruitingAndStaffing</code>
   */
  public EmployeeRecruitingAndStaffing() {
    super();
  }
  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
