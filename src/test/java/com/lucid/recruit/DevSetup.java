/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;

import com.lucid.base.test.BaseTest;
import com.lucid.core.exception.ApplicationException;
import com.lucid.recruit.org.OrganizationService;
import com.lucid.recruit.org.dto.OrgAddressDTO;
import com.lucid.recruit.org.dto.OrgCommunicationDTO;
import com.lucid.recruit.org.dto.OrganizationDTO;
import com.lucid.recruit.org.dto.OrganizationDocumentDTO;


/**
 * @author sgutti
 * @date 17-Mar-2023 6:07:04 am
 *
 */
public class DevSetup extends BaseTest {

  // --------------------------------------------------------------- Constants
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Autowired
  private OrganizationService organizationService;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>DevSetup</code>
   */
  public DevSetup() {
    super();
  }

  // ---------------------------------------------------------- Public Methods
  /**
   * @throws ApplicationException
   */
  // @Test
  public void testInitializeOrgs() throws Exception {
    OrganizationDTO organizationDTO = new OrganizationDTO();
    organizationDTO.setName(FAKER.company().name());
    organizationDTO.setDescription("TestDescription");
    organizationDTO.setTaxId("TestTaxID");
    organizationDTO.setStateOfIncorporation("TestStateOfInCorporation");

    OrgCommunicationDTO orgCommunicationDTO = new OrgCommunicationDTO();
    orgCommunicationDTO.setAuthSignataryEmail(FAKER.internet().emailAddress());
    orgCommunicationDTO.setAuthSignataryPhone(FAKER.phoneNumber().phoneNumber());
    orgCommunicationDTO.setAuthSignataryFn(FAKER.name().firstName());
    orgCommunicationDTO.setAuthSignataryLn(FAKER.name().lastName());

    organizationDTO.setOrgCommunications(Arrays.asList(orgCommunicationDTO));

    OrgAddressDTO orgAddressDTO = new OrgAddressDTO();
    orgAddressDTO.setStartDate(LocalDate.now());
    orgAddressDTO.setEndDate(LocalDate.now());
    orgAddressDTO.setAddress1(FAKER.address().fullAddress());
    orgAddressDTO.setAddress2(FAKER.address().streetAddress());
    organizationDTO.setOrgAddresses(Arrays.asList(orgAddressDTO));

    OrganizationDocumentDTO documentsDTO = new OrganizationDocumentDTO();
    documentsDTO.setDocNumber("awwe2425422");
    documentsDTO.setIssuedDt(LocalDate.now());
    documentsDTO.setExpirationDate(LocalDate.now());

    organizationDTO.setOrganizationDocuments(Arrays.asList(documentsDTO));
    organizationService.createOrganization("System", organizationDTO);
  }
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
