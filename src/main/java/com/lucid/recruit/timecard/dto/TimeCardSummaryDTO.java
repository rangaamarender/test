package com.lucid.recruit.timecard.dto;

import com.lucid.core.dto.BaseDTO;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

public class TimeCardSummaryDTO extends BaseDTO {

    private String timeCardID;
    private String resources;
    private String role;
    private String type;
    private String contractID;
    private String contractTitle;
    private LocalDate startDate;
    private LocalDate endDate;
    private BigDecimal totalHours;
    private String status;

    public String getTimeCardID() {
        return timeCardID;
    }

    public void setTimeCardID(String timeCardID) {
        this.timeCardID = timeCardID;
    }

    public String getResources() {
        return resources;
    }

    public void setResources(String resources) {
        this.resources = resources;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContractID() {
        return contractID;
    }

    public void setContractID(String contractID) {
        this.contractID = contractID;
    }

    public String getContractTitle() {
        return contractTitle;
    }

    public void setContractTitle(String contractTitle) {
        this.contractTitle = contractTitle;
    }

    public LocalDate getStartDate() {return startDate;}

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {return endDate;}

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public BigDecimal getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(BigDecimal totalHours) {
        this.totalHours = totalHours;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
