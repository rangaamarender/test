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
 * @author sgutti
 * @date 11-Feb-2023 8:05:48 pm
 *
 */
@Entity
@Table(name = EmployeeLeave.TABLE_NAME)
public class EmployeeLeave extends EmployeeBased {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = 1390434502074692160L;
  public static final String TABLE_NAME = "e_emp_leave";

  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "emp_leave_id", nullable = false, length = 75)
  private String employeeLeaveID;

  // Active/Inactive
  @Column(name = "status_code", nullable = true, length = 15)
  private String statusCode;

  // Paid/Unpaid
  @Column(name = "remuneration_code", nullable = true, length = 15)
  private String remunerationCode;

  // The reason the person is on leave.
  @Column(name = "reason_code", nullable = true, length = 25)
  private String reasonCode;

  // The starting date for leave.
  @Column(name = "start_dt", nullable = true)
  private Date startDate;

  // The last day on which a worker worked for pay.
  @Column(name = "last_worked_dt", nullable = true)
  private Date lastWorkedDate;

  // The date the person was last paid before going on leave.
  @Column(name = "last_paid_dt", nullable = true)
  private Date lastPaidDate;

  // The date the person is scheduled to return to work.
  @Column(name = "scheduled_work_rturn_dt", nullable = true)
  private Date scheduledWorkReturnDate;

  // The date the person returned to work.
  @Column(name = "work_rturn_dt", nullable = true)
  private Date workReturnDate;

  // Determination if the person can continue to use their benefits for new expenses incurred while
  // they are on leave.
  @Column(name = "incur_services_onleave_id", nullable = true)
  private Boolean incurServicesOnLeaveIndicator;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>EmployeeLeave</code>
   */
  public EmployeeLeave() {
    super();
  }

  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
