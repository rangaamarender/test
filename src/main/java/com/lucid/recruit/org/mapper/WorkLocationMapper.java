/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.org.mapper;

import com.lucid.recruit.org.dto.WorkLocationDTO;
import org.mapstruct.Mapper;
import com.lucid.core.base.BaseMapper;
import com.lucid.recruit.org.entity.WorkLocation;


/**
 * @author sgutti
 * @date 16-Mar-2023 6:06:27 am
 *
 */
@Mapper
public interface WorkLocationMapper extends BaseMapper {

  // --------------------------------------------------------------- Constants
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  // ------------------------------------------------------------ Constructors
  // ---------------------------------------------------------- Public Methods
  /**
   * @param workLocationDTO
   * @return
   */
  WorkLocation toEntity(WorkLocationDTO workLocationDTO);

  /**
   * @param workLocation
   * @return
   */
  WorkLocationDTO toDTO(WorkLocation workLocation);
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
