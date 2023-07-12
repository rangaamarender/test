/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.org;

import com.lucid.core.azure.AzureDocumentUtility;
import com.lucid.recruit.org.constants.OrgStatus;
import com.lucid.recruit.org.customRepo.OrganizationCustomRepo;
import com.lucid.recruit.org.dto.*;
import com.lucid.recruit.org.entity.*;
import com.lucid.recruit.org.exception.OrgNotFoundException;
import com.lucid.recruit.org.repo.*;
import com.lucid.util.FileUtility;
import com.lucid.util.Strings;
import io.micrometer.common.util.StringUtils;
import jakarta.persistence.*;
import org.apache.commons.validator.routines.UrlValidator;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import com.lucid.core.base.BaseServiceImpl;
import com.lucid.core.exception.ApplicationException;

import java.time.format.DateTimeFormatter;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.*;
import java.time.LocalDate;

/**
 * @author sgutti
 * @date 16-Mar-2023 6:25:34 am
 */
@Component(OrganizationServiceImpl.SERVICE_NAME)
public class OrganizationServiceImpl extends BaseServiceImpl implements OrganizationService {

    // --------------------------------------------------------------- Constants
    public static final Logger LOGGER = LoggerFactory.getLogger(OrganizationServiceImpl.class);
    public static final String SERVICE_NAME = "organizationService";
    public static final String ERROR_ORG_0001 = "ERROR_ORG_0001";
    public static final String ERROR_ORG_0002 = "ERROR_ORG_0002";
    public static final String ERROR_ORG_0003 = "ERROR_ORG_0003";
    public static final String ERROR_ORG_0004 = "ERROR_ORG_0004";
    public static final String ERROR_ORG_0005 = "ERROR_ORG_0005";
    public static final String ERROR_ORG_0006 = "ERROR_ORG_0006";
    public static final String ERROR_ORG_0007 = "ERROR_ORG_0007";
    public static final String ERROR_ORG_0008 = "ERROR_ORG_0008";
    public static final String ERROR_ORG_0009 = "ERROR_ORG_0009";
    public static final String ERROR_ORG_00010 = "ERROR_ORG_00010";
    public static final String ERROR_ORG_00011 = "ERROR_ORG_00011";

    // --------------------------------------------------------- Class Variables
    // ----------------------------------------------------- Static Initializers
    // ------------------------------------------------------ Instance Variables
    @Autowired
    private OrganizationRepo organizationRepo;

    @Autowired
    private OrgCommunicationRepo orgCommunicationRepo;

    @Autowired
    private OrgAddressRepo orgAddressRepo;

    @Autowired
    private OrgDocumentsRepo orgDocumentsRepo;

    @Autowired
    private OrganizationDocumentRepo organizationDocumentRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private OrganizationCustomRepo organizationCustomRepo;

    @Autowired
    private OrgDomainRepo orgDomainRepo;
    @Autowired
    private AzureDocumentUtility azureDocumentUtility;
    @Autowired
    private FileUtility fileUtility;


    //@Value("${azure.doc.upload.organization.container}")
    private String containerName;

    // ------------------------------------------------------------ Constructors

    /**
     * Create a new <code>OrganizationServiceImpl</code>
     */
    public OrganizationServiceImpl() {
        super();
    }

    /**
     *
     * @param userID
     * @param organizationDTO
     * @return
     */
    /*
    This method creates an organization by mapping and saving its details, including addresses,
     communications, domains, and documents. The key points include populating and saving associated
     entities, updating foreign key relationships, and handling exceptions.
     */
    @Override
    @Transactional
    public OrganizationDTO createOrganization(String userID, OrganizationDTO organizationDTO) {
        OrganizationDTO result = null;
        try {
            Organization organization = modelMapper.map(organizationDTO, Organization.class);
            organization.setCreatedBy(userID);
            organization.setCreatedDt(LocalDate.now());
            organization.setCode("TestCode");
            organization.setStatusCode(OrgStatus.ACTIVE);


            //create orgAddress
            /*
            This method populates the orgAddresses list by mapping and converting
            orgAddressDTO objects to OrgAddress objects.
            It sets the start and end dates of each address if they exist and associates
            the addresses with an organization.
             Finally, it assigns the populated orgAddresses list to the organization object's
              orgAddresses property,or sets it to null if the list is empty.
             */


            List<OrgAddress> orgAddresses = new ArrayList<>();
            if (organizationDTO.getOrgAddresses() != null && !organizationDTO.getOrgAddresses().isEmpty()) {
                organizationDTO.getOrgAddresses().forEach(orgAddressDTO -> {
                    OrgAddress orgAddress = modelMapper.map(orgAddressDTO, OrgAddress.class);
                    orgAddress.setOrganization(organization);
                    orgAddresses.add(orgAddress);
                });
                if (!orgAddresses.isEmpty()) {
                    organization.setOrgAddresses(orgAddresses);
                } else {
                    organization.setOrgAddresses(null);
                }
            }
            //create orgCommunication
            if (organizationDTO.getOrgCommunications() != null && !organizationDTO.getOrgCommunications().isEmpty()) {
                List<OrgCommunication> orgCommunicationList = new ArrayList<>();
                organizationDTO.getOrgCommunications().forEach(orgCommunicationDTO -> {
                    OrgCommunication orgCommunication = modelMapper.map(orgCommunicationDTO, OrgCommunication.class);
                    orgCommunication.setOrganization(organization);
                    orgCommunication.setCreatedBy(userID);
                    orgCommunication.setCreatedDt(LocalDate.now());
                    orgCommunicationList.add(orgCommunication);
                });
                if (!orgCommunicationList.isEmpty()) {
                    organization.setOrgCommunications(orgCommunicationList);
                } else {
                    organization.setOrgCommunications(null);
                }
            }

            //create orgDomains
            /*
            This method converts a list of communication DTOs into a list of communication entities.
            It sets the start and end dates, assigns the organization, and sets the creator and creation date.
             If the resulting list is not empty,
            it is assigned to the organization's communications; otherwise, the communications are set to null.
             */
            if (organizationDTO.getOrgDomains() != null && !organizationDTO.getOrgDomains().isEmpty()) {
                List<OrgDomain> orgDomainsList = new ArrayList<>();
                organizationDTO.getOrgDomains().forEach(orgDomainDTO -> {
                    OrgDomain orgDomain = modelMapper.map(orgDomainDTO, OrgDomain.class);
                    orgDomain.setDomainStatus("Active");
                    orgDomain.setOrganization(organization);
                    orgDomain.setCreatedBy(userID);
                    orgDomain.setCreatedDt(LocalDate.now());
                    orgDomainsList.add(orgDomain);
                });
                if (!orgDomainsList.isEmpty()) {
                    organization.setOrgDomains(orgDomainsList);
                } else {
                    organization.setOrgDomains(null);
                }
            }
            //create documents
            /*
            This method takes an OrganizationDTO object, maps its documents and addresses to
             corresponding entities, sets necessary fields, saves them in the database,
             and updates the foreign key relationships. Key points:
             1) It populates an organizationDocumentList with mapped OrganizationDocument objects.
              2) It saves the organization and updates the organization ID in associated OrgAddress and OrganizationDocument entities.
             3) It performs the necessary database operations to establish the relationships between the entities.
             */
            List<OrganizationDocument> organizationDocumentList = new ArrayList<>();
            if (organizationDTO.getOrganizationDocuments() != null && !organizationDTO.getOrganizationDocuments().isEmpty()) {

                organizationDTO.getOrganizationDocuments().forEach(orgDocumentsDTO -> {
                    OrganizationDocument orgDocuments = modelMapper.map(orgDocumentsDTO, OrganizationDocument.class);
                    orgDocuments.setCreatedBy(userID);
                    orgDocuments.setCreatedDt(LocalDate.now());
                    orgDocuments.setOrganization(organization);
                    organizationDocumentList.add(orgDocuments);
                });

                organization.setOrganizationDocuments(null);
            }

            Organization org = organizationRepo.save(organization);

            orgAddresses.forEach(orgAddr -> {
                orgAddr.setOrganization(org); //even setting here db is populating with empty org_id
                OrgAddress orgAdd = orgAddressRepo.save(orgAddr);
                orgAddressRepo.updateOrgAddr(org.getOrganizationID(), orgAdd.getOrgAddressID());
            });
            organizationDocumentList.forEach(orgDoc -> {
                orgDoc.setOrganizationID(org.getOrganizationID());
                OrganizationDocument orgDocs = organizationDocumentRepo.save(orgDoc);
                organizationDocumentRepo.updateOrgDocs(org.getOrganizationID(), orgDocs.getOrganizationDocID());
            });
            result = modelMapper.map(org, OrganizationDTO.class);
        } catch (DataAccessException | PersistenceException e) {
            throw e;
        }
        return result;
    }


    /**
     * @param filterData
     * @return retrieveAllOrganization
     * @throws ApplicationException
     */
    @Override
    public Page<OrgSummaryDTO> retrieveAllOrganization(Map<String, Object> filterData) {
        List<OrgSummaryDTO> organizationList = new ArrayList<>();
        Page<Organization> organizationsEntities = organizationCustomRepo.fetchOrganizationsWithCriteria(filterData);
        if (organizationsEntities == null || organizationsEntities.getContent().isEmpty()) {
            LOGGER.info("No organization found in the search");
            return new PageImpl<>(organizationList, organizationsEntities.getPageable(), organizationsEntities.getTotalElements());
        }
        getSummary(organizationsEntities.getContent(), organizationList);
        return new PageImpl<>(organizationList, organizationsEntities.getPageable(), organizationsEntities.getTotalElements());
    }

    /**
     * @param organizationID
     * @return retrieveOrganization based on Id
     * @throws ApplicationException
     */
    @Override
    public OrganizationDTO retrieveOrganization(String organizationID) {
        OrganizationDTO organizationDTO = null;
        try {
            Optional<Organization> optionalOrganization = organizationRepo.findById(organizationID);
            if (!optionalOrganization.isPresent()) {
                LOGGER.info("No organization found in the search");
                throw new ApplicationException(ERROR_ORG_0002, "Organization not found with :" + organizationID);
            }
            Organization organization = optionalOrganization.get();
            organizationDTO = modelMapper.map(organization, OrganizationDTO.class);
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
        }
        return organizationDTO;
    }


    /**
     * @param organizations
     * @param organizationList
     * @return list of OrgSummaryDTO
     */
    private List<OrgSummaryDTO> getSummary(List<Organization> organizations, List<OrgSummaryDTO> organizationList) {
        organizations.forEach(organization -> {
            OrgSummaryDTO orgSummaryDTO = new OrgSummaryDTO();
            orgSummaryDTO.setOrganizationID(organization.getOrganizationID());
            orgSummaryDTO.setName(organization.getName());
            orgSummaryDTO.setCreatedOn(organization.getCreatedDt());
            //set ceo name and phone
            if (organization.getOrgCommunications() != null && !organization.getOrgCommunications().isEmpty()) {
                OrgCommunication communication = organization.getOrgCommunications().get(0);
                StringBuilder ceoNameBuilder = new StringBuilder();
                if (communication.getAuthSignataryFn() != null) {
                    ceoNameBuilder.append(communication.getAuthSignataryFn());
                }
                if (communication.getAuthSignataryLn() != null) {
                    ceoNameBuilder.append(" " + communication.getAuthSignataryLn());
                }
                orgSummaryDTO.setCeoName(ceoNameBuilder.toString());
                orgSummaryDTO.setCeoPhone(communication.getAuthSignataryPhone());
            }
            organizationList.add(orgSummaryDTO);
        });
        return organizationList;
    }

    /**
     * @param organizationTaxId
     * @return findOrganizationByTaxId
     */
    @Override
    public Organization findOrganizationByTaxId(String organizationTaxId) {
        return organizationRepo.findOrganizationByTaxId(organizationTaxId);
    }

    @Override
    public String updateStatus(String organizationID, String status) {
        if (orgDocumentsRepo.existsById(organizationID)) {
            int updatedOrganization = organizationRepo.updateOrgStatus(organizationID, status);
            if (updatedOrganization != 0) {
                return "Organization status updated to '" + status + "' successfully";
            }
        }
        throw new OrgNotFoundException(" Organization with id " + organizationID + "not found", ERROR_ORG_0001);

    }


    private boolean isValidURL(String url) throws MalformedURLException {
        UrlValidator validator = new UrlValidator();
        return validator.isValid(url);
    }

    private void validateDomains(List<OrgDomainDTO> orgDomainDTOS) {
        List<String> invalidDomains = new ArrayList<>();
        if (orgDomainDTOS != null && !orgDomainDTOS.isEmpty()) {
            orgDomainDTOS.forEach(orgDomainDTO -> {
                try {
                    if (!Strings.isNullOrEmpty(orgDomainDTO.getDomain()) && !isValidURL(orgDomainDTO.getDomain())) {
                        invalidDomains.add(orgDomainDTO.getDomain());
                    }
                } catch (MalformedURLException e) {
                    throw new RuntimeException(e);
                }
            });
            if (!invalidDomains.isEmpty()) {
                StringBuilder builder = new StringBuilder();
                int i = 0;
                for (String invalidDomain : invalidDomains) {
                    if (i == invalidDomains.size() - 1) {
                        builder.append(invalidDomain);
                    } else {
                        builder.append(invalidDomain + ",");
                    }
                    i++;
                }
                throw new RuntimeException("Invalid WebAddresses [" + builder.toString() + "]");
            }
        }
    }


    @Override
    public Organization updateTaxId(String organizationId, String taxId) {
        Organization organization = organizationRepo.findById(organizationId).orElseThrow(() -> new RuntimeException("Organization not found"));
        organization.setTaxId(taxId);
        return organizationRepo.save(organization);
    }


    public String getDomainName(String webAddress) {
        URI uri = null;
        try {
            uri = new URI(webAddress);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
        String host = uri.getHost();
        String domainName = host.startsWith("www.") ? host.substring(4) : host;
        return domainName;
    }


    @Override
    public OrganizationDTO editOrganization(String userID, String organizationID, OrganizationDTO organizationDTO) throws Exception {
        OrganizationDTO result = null;
        DateTimeFormatter dtFormatter= DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            // Retrieve existing organization details
            Organization existingOrganization = organizationRepo.findById(organizationID)
                    .orElseThrow(() -> new OrgNotFoundException("organization by id " + organizationID + " not found", ERROR_ORG_0001));
            //create a new organization object from organizationDTO
            Organization updateOrganization = modelMapper.map(organizationDTO, Organization.class);

            //update existing organization details in the new organization object

            List<OrgCommunication> existingOrgCommList = existingOrganization.getOrgCommunications();
            List<OrgDomain> existingOrgDomainList = existingOrganization.getOrgDomains();
            List<OrganizationDocument> existingOrgDocList = existingOrganization.getOrganizationDocuments();


            //update orgAddress
            List<OrgAddress> orgAddresses = new ArrayList<>();
            if (organizationDTO.getOrgAddresses() != null && !organizationDTO.getOrgAddresses().isEmpty()) {

                organizationDTO.getOrgAddresses().forEach(orgAddressDTO -> {
                    OrgAddress orgAddress = modelMapper.map(orgAddressDTO, OrgAddress.class);
                    if(Objects.nonNull(orgAddressDTO.getStartDate())) {
                        orgAddress.setStartDate(LocalDate.now());
                    }
                    if(Objects.nonNull(orgAddressDTO.getEndDate())) {
                        orgAddress.setEndDate(LocalDate.now());
                    }
                    orgAddress.setOrganization(existingOrganization);
                    orgAddresses.add(orgAddress);
                });
                if (!orgAddresses.isEmpty()) {
                    existingOrganization.setOrgAddresses(orgAddresses);
                } else {
                    existingOrganization.setOrgAddresses(null);
                }
            }
            //update orgCommunication
            if (organizationDTO.getOrgCommunications() != null && !organizationDTO.getOrgCommunications().isEmpty()) {
                List<OrgCommunication> orgCommunicationList = new ArrayList<>();
                organizationDTO.getOrgCommunications().forEach(orgCommunicationDTO -> {
                    OrgCommunication orgCommunication = modelMapper.map(orgCommunicationDTO, OrgCommunication.class);
                    if(Objects.nonNull(orgCommunicationDTO.getStartDate())) {
                        orgCommunication.setStartDate(LocalDate.now());
                    }
                    if(Objects.nonNull(orgCommunicationDTO.getEndDate())) {
                        orgCommunication.setEndDate(LocalDate.now());
                    }
                    orgCommunication.setOrganization(existingOrganization);
                    orgCommunication.setUpdatedBy(userID);
                    orgCommunication.setUpdatedDt(LocalDate.now());
                    if(existingOrgCommList.size() > 0) {
                        existingOrgCommList.forEach(existingOrgComm->{
                            if(StringUtils.isNotBlank(orgCommunication.getOrgCmncID()) && existingOrgComm.getOrgCmncID().equals(orgCommunication.getOrgCmncID())) {
                                orgCommunication.setCreatedDt(existingOrgComm.getCreatedDt());
                                orgCommunication.setCreatedBy(existingOrgComm.getCreatedBy());
                            }
                        });
                    }
                    orgCommunicationList.add(orgCommunication);
                });
                if (!orgCommunicationList.isEmpty()) {
                    existingOrganization.setOrgCommunications(orgCommunicationList);
                } else {
                    existingOrganization.setOrgCommunications(null);
                }
            }

            //update orgDomains
            if (organizationDTO.getOrgDomains() != null && !organizationDTO.getOrgDomains().isEmpty()) {
                List<OrgDomain> orgDomainsList = new ArrayList<>();
                organizationDTO.getOrgDomains().forEach(orgDomainDTO -> {
                    OrgDomain orgDomain = modelMapper.map(orgDomainDTO, OrgDomain.class);
                    orgDomain.setDomainStatus("Active");
                    orgDomain.setOrganization(existingOrganization);
                    orgDomain.setUpdatedBy(userID);
                    orgDomain.setUpdatedDt(LocalDate.now());
                    if(existingOrgDomainList.size() > 0) {
                        existingOrgDomainList.forEach(existingOrgDomain->{
                            if(StringUtils.isNotBlank(orgDomain.getDomain()) && existingOrgDomain.getDomain().equals(orgDomain.getDomain())) {
                                orgDomain.setCreatedDt(existingOrgDomain.getCreatedDt());
                                orgDomain.setCreatedBy(existingOrgDomain.getCreatedBy());
                            }
                        });
                    }
                    orgDomainsList.add(orgDomain);
                });
                if (!orgDomainsList.isEmpty()) {
                    existingOrganization.setOrgDomains(orgDomainsList);
                } else {
                    existingOrganization.setOrgDomains(null);
                }
            }
            //update documents
            List<OrganizationDocument> organizationDocumentList = new ArrayList<>();
            if (organizationDTO.getOrganizationDocuments() != null && !organizationDTO.getOrganizationDocuments().isEmpty()) {

                organizationDTO.getOrganizationDocuments().forEach(orgDocumentsDTO -> {
                    OrganizationDocument orgDocuments = modelMapper.map(orgDocumentsDTO, OrganizationDocument.class);
                    orgDocuments.setUpdatedBy(userID);
                    orgDocuments.setUpdatedDt(LocalDate.now());
                    orgDocuments.setOrganization(existingOrganization);
                    if(existingOrgDocList.size() > 0) {
                        existingOrgDocList.forEach(existingOrgDoc->{
                            if(StringUtils.isNotBlank(orgDocuments.getOrganizationDocID()) && existingOrgDoc.getOrganizationDocID().equals(orgDocuments.getOrganizationDocID())) {
                                orgDocuments.setCreatedDt(existingOrgDoc.getCreatedDt());
                                orgDocuments.setCreatedBy(existingOrgDoc.getCreatedBy());
                            }
                        });
                    }
                    organizationDocumentList.add(orgDocuments);
                });

                existingOrganization.setOrganizationDocuments(null);
            }

            updateOrganization.setUpdatedDt(LocalDate.now());
            updateOrganization.setUpdatedBy(existingOrganization.getUpdatedBy());
            updateOrganization.setCreatedDt(existingOrganization.getCreatedDt());
            updateOrganization.setCreatedBy(existingOrganization.getCreatedBy());

            Organization organisationRes = organizationRepo.save(existingOrganization);

            orgAddresses.forEach(orgAddr->{
                OrgAddress orgAdd=  orgAddressRepo.save(orgAddr);
                orgAddressRepo.updateOrgAddr(organisationRes.getOrganizationID(), orgAdd.getOrgAddressID());
            });

            organizationDocumentList.forEach(orgDoc->{
                orgDoc.setOrganizationID(organisationRes.getOrganizationID());
                OrganizationDocument orgDocs=  organizationDocumentRepo.save(orgDoc);
                organizationDocumentRepo.updateOrgDocs(organisationRes.getOrganizationID(),orgDocs.getOrganizationDocID());
            });

            result = modelMapper.map(organisationRes, OrganizationDTO.class);
        }catch (DataAccessException | PersistenceException e){
            throw e;
        }
        return result;
    }


    // ---------------------------------------------------------- Public Methods
    // ------------------------------------------------------- Protected Methods
    // --------------------------------------------------------- Default Methods
    // --------------------------------------------------------- Private Methods
    // ---------------------------------------------------------- Static Methods
    // ----------------------------------------------------------- Inner Classes


}
