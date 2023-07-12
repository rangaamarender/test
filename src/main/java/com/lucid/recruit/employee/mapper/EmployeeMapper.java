/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.employee.mapper;

import java.util.List;
import org.mapstruct.Mapper;
import com.lucid.core.base.BaseMapper;
import com.lucid.recruit.employee.entity.Employee;
import com.lucid.recruit.employee.vo.EmployeeVO;

/**
 * @author sgutti
 * @date Sat Mar 18 08:15:18 IST 2023
 *
 */
@Mapper
public interface EmployeeMapper extends BaseMapper {

  // --------------------------------------------------------------- Constants
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  // ------------------------------------------------------------ Constructors
  /**
   * @param entity
   * @return
   */
  EmployeeVO toVO(Employee entity);

  /**
   * @param entityList
   * @return
   */
  List<EmployeeVO> toVOList(List<Employee> entityList);

  /**
   * @param bean
   * @return
   */
  Employee toEntity(EmployeeVO vo);

  /**
   * @param voList
   * @return
   */
  List<Employee> toEntityList(List<EmployeeVO> voList);
  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
