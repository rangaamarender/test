/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.attr.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.lucid.core.base.BaseMapper;
import com.lucid.recruit.attr.entity.AttributeGroupDef;
import com.lucid.recruit.attr.vo.AttributeGroupDefVO;

/**
 * 
 * @author chandu
 *
 */
@Mapper
public interface AttributeGroupDefMapper extends BaseMapper {

  // --------------------------------------------------------------- Constants
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  // ------------------------------------------------------------ Constructors
  /**
   * @param entity
   * @return
   */
  AttributeGroupDefVO toVO(AttributeGroupDef entity);

  /**
   * @param entityList
   * @return
   */
  List<AttributeGroupDefVO> toVOList(List<AttributeGroupDef> entityList);

  /**
   * @param bean
   * @return
   */
  AttributeGroupDef toEntity(AttributeGroupDefVO vo);

  /**
   * @param voList
   * @return
   */
  List<AttributeGroupDef> toEntityList(List<AttributeGroupDefVO> voList);
  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
