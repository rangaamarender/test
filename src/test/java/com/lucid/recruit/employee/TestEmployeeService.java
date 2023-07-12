/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.employee;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.lucid.base.test.BaseTransactionTest;
import com.lucid.core.exception.ApplicationException;
import com.lucid.recruit.employee.vo.EmployeeVO;
import com.lucid.recruit.person.vo.BasePersonNameVO;
import com.lucid.recruit.person.vo.PersonLegalVO;


/**
 * @author sgutti
 * @date 18-Mar-2023 10:13:23 am
 *
 */
public class TestEmployeeService extends BaseTransactionTest {

  // --------------------------------------------------------------- Constants
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Autowired
  private EmployeeService employeeService;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>TestEmployeeService</code>
   */
  public TestEmployeeService() {
    super();
  }

  // ---------------------------------------------------------- Public Methods
  @Test
  public void testCreateEmployee() throws ApplicationException {
    PersonLegalVO personLegalVO = new PersonLegalVO();
    personLegalVO.setBirthDate(FAKER.date().birthday());
    BasePersonNameVO basePersonNameVO = new BasePersonNameVO();
    basePersonNameVO.setGivenName(FAKER.name().name());
    personLegalVO.setName(basePersonNameVO);
    EmployeeVO employeeVO = new EmployeeVO();
    employeeVO.setEmployeeCode(FAKER.numerify("IN94######"));
    employeeVO.setWorkRelationshipStatusID("testl");
    employeeVO.setPersonLegal(personLegalVO);
    employeeService.createEmployee("system", employeeVO);
  }
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
