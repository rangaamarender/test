/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.employee.entity;

import java.math.BigDecimal;
import com.lucid.core.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


/**
 * @author sgutti
 * @date 12-Feb-2023 12:58:41 pm
 *
 */
@Entity
@Table(name = EmployeeDaySchedule.TABLE_NAME)
public class EmployeeDaySchedule extends BaseEntity {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = 8311655733218129519L;
  public static final String TABLE_NAME = "e_emp_day_schedule";
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "day_schedule_id", nullable = false, length = 75)
  private String dayScheduleID;

  @Column(name = "name", nullable = true, length = 50)
  private String name;

  @Column(name = "code", nullable = true, length = 25)
  private String code;

  @Column(name = "weekday", nullable = true, length = 15)
  private String weekday;

  @Column(name = "date", nullable = true, length = 15)
  private String date;

  @Column(name = "start_time", nullable = true, length = 15)
  private String startTime;

  @Column(name = "end_time", nullable = true, length = 15)
  private String endTime;

  @Column(name = "hours", nullable = true)
  private BigDecimal hours;

  @Column(name = "shift", nullable = true, length = 15)
  private String shift;

  @Column(name = "work_schedule_id", nullable = false, length = 75)
  private String workScheduleID;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>EmployeeDaySchedule</code>
   */
  public EmployeeDaySchedule() {
    super();
  }

  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
