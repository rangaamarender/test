package com.lucid.recruit.org.entity;

import java.util.List;

import com.lucid.core.entity.AuditableEntity;
import com.lucid.core.entity.BaseEntity;

import com.lucid.recruit.org.constants.OrgStatus;
import jakarta.persistence.*;

@Entity
@Table(name = Organization.TABLE_NAME)
public class Organization extends AuditableEntity {

    // --------------------------------------------------------------- Constants
    private static final long serialVersionUID = 859660616606497198L;
    public static final String TABLE_NAME = "o_organization";
    // --------------------------------------------------------- Class Variables
    // ----------------------------------------------------- Static Initializers
    // ------------------------------------------------------ Instance Variables
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "org_id", nullable = false, length = 50)
    private String organizationID;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "phone", nullable = false, length = 15)
    private String phoneNumber;

    @Column(name = "fax", nullable = false, length = 20)
    private String fax;

    // Free text description for that entity
    @Column(name = "description", nullable = true, length = 400)
    private String description;

    // Organization code
    @Column(name = "code", nullable = false, length = 25)
    private String code;

    // Status code like active, inactive
    @Column(name = "status_code", nullable = false)
    @Enumerated(EnumType.STRING)
    private OrgStatus statusCode;

    // Federal Tax Identification Number or EIN
    @Column(name = "tax_id", nullable = true, length = 25, unique = true)
    private String taxId;

    @Column(name = "tax_classification", nullable = false)
    private String taxClassification;

    // Federal Tax Identification Number or EIN
    @Column(name = "state_inCorp", nullable = true, length = 25)
    private String stateOfIncorporation;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "organization", cascade = CascadeType.ALL)
    private List<OrgDomain> orgDomains;

    // List of Communication
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "organization", cascade = CascadeType.ALL)
    private List<OrgCommunication> orgCommunications;

    // List of Address
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "organization", cascade = CascadeType.ALL)
    private List<OrgAddress> orgAddresses;

    // List of Org Documents
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "organization", cascade = CascadeType.ALL)
    private List<OrganizationDocument> organizationDocuments;

    public Organization() {
        super();
    }

    public String getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(String organizationID) {
        this.organizationID = organizationID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<OrgCommunication> getOrgCommunications() {
        return orgCommunications;
    }

    public void setOrgCommunications(List<OrgCommunication> orgCommunications) {
        this.orgCommunications = orgCommunications;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public OrgStatus getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(OrgStatus statusCode) {
        this.statusCode = statusCode;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public String getStateofIncorporation() {
        return stateOfIncorporation;
    }

    public void setStateofIncorporation(String stateofIncorporation) {
        this.stateOfIncorporation = stateofIncorporation;
    }

    public List<OrgDomain> getOrgDomains() {
        return orgDomains;
    }

    public void setOrgDomains(List<OrgDomain> orgDomains) {
        this.orgDomains = orgDomains;
    }

    public List<OrgAddress> getOrgAddresses() {
        return orgAddresses;
    }

    public void setOrgAddresses(List<OrgAddress> orgAddresses) {
        this.orgAddresses = orgAddresses;
    }

    public List<OrganizationDocument> getOrganizationDocuments() {
        return organizationDocuments;
    }

    public void setOrganizationDocuments(List<OrganizationDocument> organizationDocuments) {
        this.organizationDocuments = organizationDocuments;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getTaxClassification() {
        return taxClassification;
    }

    public void setTaxClassification(String taxClassification) {
        this.taxClassification = taxClassification;
    }

    public String getStateOfIncorporation() {
        return stateOfIncorporation;
    }

    public void setStateOfIncorporation(String stateOfIncorporation) {
        this.stateOfIncorporation = stateOfIncorporation;
    }


    
    
}
