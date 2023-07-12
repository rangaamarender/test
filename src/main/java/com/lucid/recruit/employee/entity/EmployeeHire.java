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
 * Provides hire date information.
 * 
 * @author sgutti
 * @date 11-Feb-2023 6:55:47 pm
 *
 */
@Entity
@Table(name = EmployeeHire.TABLE_NAME)
public class EmployeeHire extends EmployeeBased {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = 2895467262097478301L;
  public static final String TABLE_NAME = "e_emp_hire";

  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "emp_hire_id", nullable = false, length = 75)
  private String employeeHireID;

  @Column(name = "type_code", nullable = true, length = 15)
  private String typeCode;

  // he first date the person is classed as a worker
  @Column(name = "hire_dt", nullable = true)
  private Date hireDate;

  // The actual first date the person starts work.
  @Column(name = "first_work_dt", nullable = true)
  private Date firstWorkDate;

  // The first date is expected to start work.
  @Column(name = "expected_first_work_dt", nullable = true)
  private Date expectedFirstWorkDate;

  // Original date of hire.
  @Column(name = "original_dt", nullable = true)
  private Date originalDate;

  // Adjusted date of hire.
  @Column(name = "adjusted_dt", nullable = true)
  private Date adjustedDate;

  // The first day of a worker's probationary status
  @Column(name = "probationary_start_dt", nullable = true)
  private Date probationaryStartDate;

  // The last day of a worker's probationary status.
  @Column(name = "probationary_end_dt", nullable = true)
  private Date probationaryEndDate;

  // TODO - service start dates

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>EmployeeHire</code>
   */
  public EmployeeHire() {
    super();
  }

  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
