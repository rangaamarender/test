/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.org;

import com.lucid.recruit.org.dto.*;
import com.lucid.recruit.org.entity.OrgDocuments;
import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.C;
import org.hibernate.Cache;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.lucid.base.test.BaseTransactionTest;
import com.lucid.core.exception.ApplicationException;
import com.lucid.recruit.org.vo.OrganizationVO;
import org.springframework.data.domain.Page;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;


/**
 * @author sgutti
 * @date 16-Mar-2023 6:34:41 am
 *
 */
public class TestOrganizationService extends BaseTransactionTest {

  // --------------------------------------------------------------- Constants
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Autowired
  private OrganizationService organizationService;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>TestOrganizationService</code>
   */
  public TestOrganizationService() {
    super();
  }

  // ---------------------------------------------------------- Public Methods
  /**
   * @throws ApplicationException
   */
  @Test
  public void testCreateOrg() throws Exception {
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


    OrganizationDTO result = organizationService.createOrganization("System", organizationDTO);
    Assertions.assertNotNull(result, "unable to create the organization");
  }
  @Test
  public  void testRetrieveAllOrganization()throws Exception{
    Page<OrgSummaryDTO> retrieveAllOrganizationDTO=organizationService.retrieveAllOrganization(new HashMap<>());
    Assertions.assertNotNull(retrieveAllOrganizationDTO);
  }

  @Test
  public void testRetrieveOrganization() throws Exception {
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


    OrganizationDTO result = organizationService.createOrganization("System", organizationDTO);
    Assertions.assertNotNull(result, "unable to create the organization");
    try {
      OrganizationDTO organizationDTO1=organizationService.retrieveOrganization(organizationDTO.getOrganizationID());
      Assertions.assertNotNull(organizationDTO.getOrganizationID(),organizationDTO1.getOrganizationID());
    }
    catch (Exception e){
      Assertions.assertNotNull("organization not Found",e.getLocalizedMessage());
    }
  }
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
