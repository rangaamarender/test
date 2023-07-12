/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.employee.entity;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * The status of the worker in relation to the assignment.
 * 
 * @author sgutti
 * @date 12-Feb-2023 12:23:59 pm
 *
 */
public class EmployeeWorkRelationshipStatus extends EmployeeBased {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = 2739766967392301610L;
  public static final String TABLE_NAME = "e_emp_work_rship_status";

  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "work_rship_status_id", nullable = false, length = 75)
  private String workRelationshipStatusID;

  // Indicates the worker has been separated from the organization.
  @Column(name = "separated_ind", nullable = true)
  private Boolean separatedIndicator;

  // Indicates the employer has declined to provide a status.
  @Column(name = "delined_provide_ind", nullable = true)
  private Boolean declinedToProvideIndicator;

  // The status of the worker in relation to the assignment. Values are Pending, Active, Inactive,
  // Terminated.
  @Column(name = "status_code", nullable = true, length = 15)
  private String statusCode;

  // The date on which the worker's status changed.
  @Column(name = "status_dt", nullable = true)
  private Date statusDate;

  // A description of the status
  @Column(name = "description", nullable = true, length = 50)
  private String description;

  // The employer's reason for the work relationship status.
  @Column(name = "reason_code", nullable = true, length = 25)
  private String reasonCode;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>EmployeeWorkRelationshipStatus</code>
   */
  public EmployeeWorkRelationshipStatus() {
    super();
  }

  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
