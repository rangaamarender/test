/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.employee;

import com.lucid.core.base.BaseService;
import com.lucid.core.exception.ApplicationException;
import com.lucid.recruit.employee.vo.EmployeeVO;


/**
 * @author sgutti
 * @date 17-Mar-2023 6:45:58 am
 *
 */
public interface EmployeeService extends BaseService {

  // --------------------------------------------------------------- Constants
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  // ------------------------------------------------------------ Constructors
  // ---------------------------------------------------------- Public Methods
  /**
   * @param userID
   * @param employeeVO
   * @throws ApplicationException
   */
  void createEmployee(String userID, EmployeeVO employeeVO) throws ApplicationException;
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
