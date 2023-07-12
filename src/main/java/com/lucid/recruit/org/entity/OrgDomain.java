package com.lucid.recruit.org.entity;


import com.lucid.core.entity.AuditableEntity;
import jakarta.persistence.*;

@Entity
@Table(name = OrgDomain.TABLE_NAME)
public class OrgDomain extends AuditableEntity {

    public static final String TABLE_NAME = "o_domains";

    @Id
    @Column(name = "domain_id",nullable = false,length = 75)
    @GeneratedValue(strategy = GenerationType.UUID)
    private String domainID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "org_id", nullable = false, updatable = false)
    private Organization organization;

    @Column(name = "domain_name",nullable = false)
    private String domain;

    @Column(name = "domain_ext",nullable = false)
    private String domainExt;

    //the status will be Active or InActive
    @Column(name = "domain_status",nullable = false)
    private String domainStatus;

    public String getDomainID() {
        return domainID;
    }

    public void setDomainID(String domainID) {
        this.domainID = domainID;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getDomainExt() {
        return domainExt;
    }

    public void setDomainExt(String domainExt) {
        this.domainExt = domainExt;
    }

    public String getDomainStatus() {
        return domainStatus;
    }

    public void setDomainStatus(String domainStatus) {
        this.domainStatus = domainStatus;
    }

	@Override
	public String toString() {
		return "OrgDomain [domainID=" + domainID + ", organization=" + organization + ", domain=" + domain
				+ ", domainExt=" + domainExt + ", domainStatus=" + domainStatus + "]";
	}
    
    
}
