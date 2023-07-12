/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.employee.entity;

import com.lucid.core.entity.BaseAddress;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


/**
 * @author sgutti
 * @date 11-Feb-2023 5:23:28 pm
 *
 */
@Entity
@Table(name = EmployeeWorkLocation.TABLE_NAME)
public class EmployeeWorkLocation extends BaseAddress {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = 3261279388581337009L;
  public static final String TABLE_NAME = "e_emp_work_location";

  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "work_location_id", nullable = false, length = 75)
  private String workLocationID;

  @Column(name = "employee_id", nullable = false, length = 75)
  private String employeeID;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "employee_id", nullable = false, insertable = false, updatable = false)
  private Employee employee;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>EmployeeWorkLocation</code>
   */
  public EmployeeWorkLocation() {
    super();
  }

  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
