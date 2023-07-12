/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.person.mapper;

import java.util.List;
import com.lucid.core.base.BaseMapper;
import com.lucid.core.embeddable.BasePersonName;
import com.lucid.recruit.person.vo.BasePersonNameVO;


/**
 * @author sgutti
 * @date 18-Mar-2023 10:01:48 am
 *
 */
public interface BasePersonNameMapper extends BaseMapper {

  // --------------------------------------------------------------- Constants
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  // ------------------------------------------------------------ Constructors
  // ---------------------------------------------------------- Public Methods
  /**
   * @param basePersonNameVO
   * @return
   */
  BasePersonName toEntity(BasePersonNameVO basePersonNameVO);

  /**
   * @param basePersonNameVOList
   * @return
   */
  List<BasePersonName> toEntityList(List<BasePersonNameVO> basePersonNameVOList);

  /**
   * @param basePersonName
   * @return
   */
  BasePersonNameVO toVO(BasePersonName basePersonName);

  /**
   * @param basePersonNameList
   * @return
   */
  List<BasePersonNameVO> toVOList(List<BasePersonName> basePersonNameList);
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
