/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.employee.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * WorkAssignment may associate a Job and/or Position with a Worker/Employee
 * 
 * 
 * @author sgutti
 * @date 12-Feb-2023 12:02:31 pm
 *
 */
@Entity
@Table(name = EmployeeWorkAssignment.TABLE_NAME)
public class EmployeeWorkAssignment extends EmployeeBased {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = 6301915210454729706L;
  public static final String TABLE_NAME = "e_emp_work_assignment";

  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "work_assignment_id", nullable = false, length = 75)
  private String workAssignmentID;

  // Describes the assignment.
  @Column(name = "description", nullable = true, length = 200)
  private String description;

  // The code of the assignment term. Values include Fixed, Permanent, Casual, Seasonal.
  @Column(name = "assignment_term_type_code", nullable = true, length = 25)
  private String assignmentTermTypeCode;

  // The location of the assignment.
  @Column(name = "assignment_location_id", nullable = true, length = 75)
  private String assignmentLocationID;

  // Identifier of the specific job at an organization
  @Column(name = "job_id", nullable = true, length = 25)
  private String jobId;

  // Identifier of the specific position at an organization
  @Column(name = "position_id", nullable = true, length = 25)
  private String positionId;

  // Describes how often the payee is paid. Pay Frequency - The period of time covered by the
  // employee's regular pay checks.
  @Column(name = "pay_cycle_code", nullable = true, length = 25)
  private String payCycleCode;

  // TODO Assignment life cycle
  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>EmployeeWorkAssignment</code>
   */
  public EmployeeWorkAssignment() {
    super();
  }
  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
