package com.lucid.recruit.org.dto;

import com.lucid.core.dto.BaseDTO;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class OrgCommunicationDTO extends BaseDTO {

    private String orgCmncID;

    private LocalDate startDate;

    private LocalDate endDate;

    
    @NotBlank
    private String authSignataryFn;

    // Auth. signatory Last Name
    @NotBlank
    private String authSignataryLn;

    // Auth. signatory Email
    @NotBlank
    @Email(regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")
    private String authSignataryEmail;

    // Auth. signatory Phone
    @NotBlank
    @Pattern(regexp = "^\\+?[1-9]\\d{1,14}$")
    private String authSignataryPhone;

    public String getOrgCmncID() {
        return orgCmncID;
    }

    public void setOrgCmncID(String orgCmncID) {
        this.orgCmncID = orgCmncID;
    }

    public String getAuthSignataryFn() {
        return authSignataryFn;
    }

    public void setAuthSignataryFn(String authSignataryFn) {
        this.authSignataryFn = authSignataryFn;
    }

    public String getAuthSignataryLn() {
        return authSignataryLn;
    }

    public void setAuthSignataryLn(String authSignataryLn) {
        this.authSignataryLn = authSignataryLn;
    }

    public String getAuthSignataryEmail() {
        return authSignataryEmail;
    }

    public void setAuthSignataryEmail(String authSignataryEmail) {
        this.authSignataryEmail = authSignataryEmail;
    }

    public String getAuthSignataryPhone() {
        return authSignataryPhone;
    }

    public void setAuthSignataryPhone(String authSignataryPhone) {
        this.authSignataryPhone = authSignataryPhone;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
