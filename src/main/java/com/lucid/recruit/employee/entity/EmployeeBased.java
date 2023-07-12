/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.employee.entity;

import com.lucid.core.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;

/**
 * @author sgutti
 * @date 11-Feb-2023 6:43:41 pm
 *
 */
@MappedSuperclass
public abstract class EmployeeBased extends BaseEntity {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = -73554607731957848L;

  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Column(name = "employee_id", nullable = false, length = 75)
  private String employeeID;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "employee_id", nullable = false, insertable = false, updatable = false)
  private Employee employee;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>EmployeeBased</code>
   */
  public EmployeeBased() {
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
   * @return Returns the employee.
   */
  public Employee getEmployee() {
    return employee;
  }

  /**
   * @param employee The employee to set.
   */
  public void setEmployee(Employee employee) {
    this.employee = employee;
  }
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
