package com.lucid.recruit.org.validation;

import com.lucid.recruit.common.repo.PublicDomainRepository;
import com.lucid.recruit.org.dto.OrgCommunicationDTO;
import com.lucid.recruit.org.dto.OrgDomainDTO;
import com.lucid.recruit.org.dto.OrganizationDTO;
import com.lucid.recruit.org.entity.Organization;
import com.lucid.recruit.org.repo.OrganizationRepo;
import com.lucid.util.Strings;
import org.apache.commons.validator.routines.UrlValidator;
import org.hibernate.annotations.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class OrgValidation {

    @Autowired
    private OrganizationRepo organizationRepo;

    @Autowired
    private PublicDomainRepository publicDomainRepository;

    public void validateOrganization(OrganizationDTO organizationDTO) throws MalformedURLException {
        if (!Strings.isNullOrEmpty(organizationDTO.getOrganizationID())) {
            validateTaxId(organizationDTO.getTaxId(), organizationDTO.getOrganizationID(), organizationDTO.getName());
        } else {
            validateTaxId(organizationDTO.getTaxId(), null, organizationDTO.getName());
        }

        // Check if organization name already exists
        List<Organization> organizationsByName = organizationRepo.findOrganizationsByName(organizationDTO.getName());
        if (!organizationsByName.isEmpty()) {
            for (Organization existingOrganization : organizationsByName) {
                if (existingOrganization.getTaxId().equals(organizationDTO.getTaxId())) {
                    // Same tax ID, no problem
                    continue;
                }
                throw new RuntimeException("An organization with the given name already exists, associated with Tax ID: " + existingOrganization.getTaxId());
            }
        }

        if (organizationDTO.getOrgDomains() != null && !organizationDTO.getOrgDomains().isEmpty()) {
            validateDomains(organizationDTO.getOrgDomains());
        }
        if (organizationDTO.getOrgCommunications() != null && !organizationDTO.getOrgCommunications().isEmpty()) {
            List<String> resourceEmails = organizationDTO.getOrgCommunications().stream()
                    .map(OrgCommunicationDTO::getAuthSignataryEmail)
                    .collect(Collectors.toList());
            List<String> domainExt = organizationDTO.getOrgDomains().stream()
                    .map(OrgDomainDTO::getDomainExt)
                    .collect(Collectors.toList());
            validateResourceEmails(resourceEmails, domainExt);
        }
    }




    public void validateTaxId(String taxId, String organizationId, String organizationName) {
        // Validate taxId
        Organization organization = organizationRepo.findOrganizationByTaxId(taxId);
        if (organization != null) {
            if (!Strings.isNullOrEmpty(organizationId) && !organization.getOrganizationID().equals(organizationId))
                throw new RuntimeException(" The tax ID provided already exists with the organization : " + organization.getName());
            else
                throw new RuntimeException("The tax ID provided already exists with the organization : " + organization.getName());
        }
        if (!Strings.isNullOrEmpty(organizationId)) {
            Organization existingOrganization = organizationRepo.findOrganizationByTaxId(organizationId);
            if (existingOrganization != null && !existingOrganization.getTaxId().equals(taxId)) {
                throw new RuntimeException("Editing the tax ID is not authorized");
            }
        }
    }



    public void  validateName(String name,String organizationId){
         //validate the organization name
        Organization organization=organizationRepo.findOrganizationByName(name);
        if (organization != null){
            if (!Strings.isNullOrEmpty(organizationId) && !organization.getOrganizationID().equals(organizationId))
                throw new RuntimeException("organization Already exist with given Name");
            else
                throw new RuntimeException("organization Already exist with given name");
        }
        if (!Strings.isNullOrEmpty(organizationId)) {
            Organization existingOrganization = organizationRepo.findOrganizationByName(organizationId);
            if (existingOrganization != null && !existingOrganization.getTaxId().equals(name)) {
                throw new RuntimeException("Editing the Name is not authorized");
            }
        }
    }



    public void validateDomains(List<OrgDomainDTO> domains){
        List<String> invalidDomains = new ArrayList<>();
        UrlValidator validator = new UrlValidator();
        if(domains != null && !domains.isEmpty()){
            domains.forEach(orgDomain -> {
                if (!Strings.isNullOrEmpty(orgDomain.getDomain())) {
                    if (validator.isValid(orgDomain.getDomain())) {
                        URL url = null;
                        try {
                            url = new URL(orgDomain.getDomain());
                        } catch (MalformedURLException e) {
                            throw new RuntimeException(e);
                        }
                        String hostAddress = url.getHost();
                        List<String> splitHost = Arrays.stream(hostAddress.split("\\.")).toList();
                        StringBuilder builder = new StringBuilder();
                        if (splitHost.size() > 0) {
                            if (!isValidHost(hostAddress)) {
                                for (int count = 0; count < splitHost.size(); count++) {
                                    if (count != splitHost.size() - 1) {
                                        if (count == 0) {
                                            if (!splitHost.get(count).equalsIgnoreCase("www")) {
                                                builder.append(splitHost.get(count) + ".");
                                            }
                                        } else {
                                            builder.append(splitHost.get(count) + ".");
                                        }
                                    } else {
                                        builder.append(splitHost.get(count));
                                    }
                                }
                            } else {
                                invalidDomains.add(orgDomain.getDomain());
                            }
                        }
                        if(!Strings.isNullOrEmpty(builder.toString())){
                            orgDomain.setDomainExt(builder.toString());
                        }
                    } else {
                        invalidDomains.add(orgDomain.getDomain());
                    }
                } else {
                    invalidDomains.add(orgDomain.getDomain());
                }
            });
            if(!invalidDomains.isEmpty()){
                StringBuilder builder = new StringBuilder();
                int i =0;
                for(String invalidDomain:invalidDomains){
                    if(i == invalidDomains.size()-1) {
                        builder.append(invalidDomain);
                    }
                    else{
                        builder.append(invalidDomain+",");
                    }
                    i++;
                }
                throw new RuntimeException("Invalid WebAddresses ["+builder.toString()+"]");
            }
        }
    }

    private boolean isValidHost(String hostAddress){
        boolean invalidHost = false;
        List<String> splitHost = Arrays.stream(hostAddress.split("\\.")).toList();
        if (splitHost.size() > 0) {
            for (int i = 0; i < splitHost.size(); i++) {
                StringBuilder tempBuilder = new StringBuilder();
                for (int count = i; count < splitHost.size(); count++) {
                    if (count != splitHost.size() - 1)
                        tempBuilder.append(splitHost.get(count) + ".");
                    else
                        tempBuilder.append(splitHost.get(count));
                }
                if (publicDomainRepository.existsById(tempBuilder.toString())) {
                    invalidHost = true;
                    i = splitHost.size();
                }
            }
        }
        return invalidHost;
    }

    public void validateResourceEmails(List<String> emails,List<String> domainExts){
        if(emails != null && !emails.isEmpty() && (domainExts == null || domainExts.isEmpty())){
            throw new RuntimeException("No WebAddresses Found");
        }
        emails.forEach(email->{
            if(Strings.isNullOrEmpty(email) || email.split("@").length <2){
                throw new RuntimeException("Invalid email");
            }
            else if(!domainExts.contains(email.split("@")[1])){
                throw new RuntimeException("Organization Dos Not support this emil:"+email);
            }
        });
    }

}
