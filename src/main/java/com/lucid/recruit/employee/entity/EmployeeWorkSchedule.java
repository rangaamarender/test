/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.employee.entity;

import java.math.BigDecimal;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


/**
 * 
 * Periodic schedule of employee worktime.
 * 
 * @author sgutti
 * @date 11-Feb-2023 5:36:30 pm
 *
 */
@Entity
@Table(name = EmployeeWorkSchedule.TABLE_NAME)
public class EmployeeWorkSchedule extends EmployeeBased {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = 332548692510466464L;
  public static final String TABLE_NAME = "e_work_schedule";

  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "work_schedule_id", nullable = false, length = 75)
  private String workScheduleID;

  @Column(name = "name", nullable = true, length = 50)
  private String name;

  @Column(name = "code", nullable = true, length = 25)
  private String code;

  @Column(name = "hours", nullable = true)
  private BigDecimal hours;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>EmployeeWorkSchedule</code>
   */
  public EmployeeWorkSchedule() {
    super();
  }
  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
