/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.org;

import com.lucid.core.base.BaseService;
import com.lucid.recruit.org.dto.OrgSummaryDTO;
import com.lucid.recruit.org.dto.OrganizationDTO;
import com.lucid.recruit.org.entity.Organization;
import org.springframework.data.domain.Page;

import java.util.Map;


/**
 * @author sgutti
 * @date 16-Mar-2023 5:59:03 am
 */
public interface OrganizationService extends BaseService {

    OrganizationDTO createOrganization(String userID, OrganizationDTO organizationDTO);


    Page<OrgSummaryDTO> retrieveAllOrganization(Map<String, Object> filterData);

    OrganizationDTO retrieveOrganization(String organizationID);

    Organization findOrganizationByTaxId(String organizationId);

    String updateStatus(String contractID, String Status);

    Organization updateTaxId(String organizationId, String taxId);

    String getDomainName(String webAddress);

    OrganizationDTO editOrganization(String userID, String organizationID, OrganizationDTO organizationDTO) throws Exception;
}
