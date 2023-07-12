/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.person.mapper;

import java.util.List;
import org.mapstruct.Mapper;
import com.lucid.core.base.BaseMapper;
import com.lucid.recruit.person.entity.PersonLegal;
import com.lucid.recruit.person.vo.PersonLegalVO;

/**
 * @author sgutti
 * @date Sat Mar 18 08:15:18 IST 2023
 *
 */
@Mapper
public interface PersonLegalMapper extends BaseMapper {

  // --------------------------------------------------------------- Constants
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  // ------------------------------------------------------------ Constructors
  /**
   * @param entity
   * @return
   */
  PersonLegalVO toVO(PersonLegal entity);

  /**
   * @param entityList
   * @return
   */
  List<PersonLegalVO> toVOList(List<PersonLegal> entityList);

  /**
   * @param bean
   * @return
   */
  PersonLegal toEntity(PersonLegalVO vo);

  /**
   * @param voList
   * @return
   */
  List<PersonLegal> toEntityList(List<PersonLegalVO> voList);
  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
