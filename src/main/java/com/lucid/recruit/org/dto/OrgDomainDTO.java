package com.lucid.recruit.org.dto;

import com.lucid.core.dto.BaseDTO;
import com.lucid.recruit.org.entity.Organization;
import jakarta.validation.constraints.NotBlank;

public class OrgDomainDTO extends BaseDTO {
    private String domainID;
    @NotBlank
    private String domain;
    private String domainExt;

    public String getDomainID() {
        return domainID;
    }

    public void setDomainID(String domainID) {
        this.domainID = domainID;
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
}
