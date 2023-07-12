/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.org.mapper;

import com.lucid.recruit.org.dto.WorkLocationAddressDTO;
import org.mapstruct.Mapper;
import com.lucid.core.base.BaseMapper;
import com.lucid.recruit.org.entity.WorkLocationAddress;
import com.lucid.recruit.org.vo.WorkLocationAddressVO;


/**
 * @author sgutti
 * @date 16-Mar-2023 6:07:04 am
 *
 */
@Mapper
public interface WorkLocationAddressMapper extends BaseMapper {

  // --------------------------------------------------------------- Constants
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  // ------------------------------------------------------------ Constructors
  // ---------------------------------------------------------- Public Methods
  /**
   * @param workLocationAddressVO
   * @return
   */
  WorkLocationAddress toEntity(WorkLocationAddressVO workLocationAddressVO);

  /**
   * @param workLocationAddress
   * @return
   */
  WorkLocationAddressDTO toDTO(WorkLocationAddress workLocationAddress);
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
