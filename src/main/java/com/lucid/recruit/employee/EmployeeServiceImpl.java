/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.employee;

import java.time.LocalDate;
import java.util.Calendar;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import com.lucid.core.base.BaseServiceImpl;
import com.lucid.core.exception.ApplicationException;
import com.lucid.recruit.employee.entity.Employee;
import com.lucid.recruit.employee.mapper.EmployeeMapper;
import com.lucid.recruit.employee.repo.EmployeeRepo;
import com.lucid.recruit.employee.vo.EmployeeVO;
import com.lucid.recruit.person.entity.PersonLegal;
import com.lucid.recruit.person.repo.PersonLegalRepo;


/**
 * @author sgutti
 * @date 17-Mar-2023 7:21:53 am
 *
 */
@Component(EmployeeServiceImpl.SERVICE_NAME)
public class EmployeeServiceImpl extends BaseServiceImpl implements EmployeeService {

  // --------------------------------------------------------------- Constants
  public static final String SERVICE_NAME = "employeeService";
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Autowired
  private EmployeeRepo employeeRepo;

  @Autowired
  private PersonLegalRepo personLegalRepo;
  // ------------------------------------------------------------ Constructors

  /**
   * Create a new <code>EmployeeServiceImpl</code>
   */
  public EmployeeServiceImpl() {
    super();
  }

  // ---------------------------------------------------------- Public Methods
  /**
   * @see com.lucid.recruit.employee.EmployeeService#createEmployee(java.lang.String,
   *      com.lucid.recruit.employee.vo.EmployeeVO)
   */
  @Override
  @Transactional
  public void createEmployee(String userID, EmployeeVO employeeVO) throws ApplicationException {
    // Create the Employee
    EmployeeMapper employeeMapper = Mappers.getMapper(EmployeeMapper.class);
    Employee employee = employeeMapper.toEntity(employeeVO);

    // Save the person details
    PersonLegal personLegal = employee.getPersonLegal();
    personLegalRepo.save(personLegal);

    // associate the person to employee
    employee.setPersonLegalID(personLegal.getPersonLegalID());
    employee.setPersonLegal(personLegal);
    employee.setCreatedBy(userID);
    employee.setCreatedDt(LocalDate.now());
    employeeRepo.save(employee);
    
     //

  }

  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
