/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.org.mapper;

import org.mapstruct.Mapper;
import com.lucid.core.base.BaseMapper;
import com.lucid.recruit.org.entity.Organization;
import com.lucid.recruit.org.vo.OrganizationVO;


/**
 * @author sgutti
 * @date 16-Mar-2023 6:28:39 am
 *
 */
@Mapper
public interface OrganizationMapper extends BaseMapper {

  // --------------------------------------------------------------- Constants
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  // ------------------------------------------------------------ Constructors
  // ---------------------------------------------------------- Public Methods
  /**
   * @param organizationVO
   * @return
   */
  Organization toEntity(OrganizationVO organizationVO);

  /**
   * @param organization
   * @return
   */
  OrganizationVO toVO(Organization organization);
  // ------------------------------------------------------ Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
