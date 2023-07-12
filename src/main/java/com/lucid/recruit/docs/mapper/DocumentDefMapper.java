/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.docs.mapper;

import java.util.List;
import org.mapstruct.Mapper;
import com.lucid.core.base.BaseMapper;
import com.lucid.recruit.docs.entity.DocumentDef;
import com.lucid.recruit.docs.vo.DocumentDefVO;

/**
 * @author sgutti
 * @date 22-Apr-2023 3:48:57 pm
 *
 */
@Mapper
public interface DocumentDefMapper extends BaseMapper {
  // --------------------------------------------------------------- Constants
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  // ------------------------------------------------------------ Constructors
  // ---------------------------------------------------------- Public Methods
  /**
   * @param documentDefVO
   * @return
   */
  public DocumentDef toEntity(DocumentDefVO documentDefVO);

  /**
   * @param documentDefVOList
   * @return
   */
  public List<DocumentDef> toEntityList(List<DocumentDefVO> documentDefVOList);


  /**
   * @param documentDef
   * @return
   */
  public DocumentDefVO toVO(DocumentDef documentDef);

  /**
   * @param documentDefList
   * @return
   */
  public List<DocumentDefVO> toVOList(List<DocumentDef> documentDefList);
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
