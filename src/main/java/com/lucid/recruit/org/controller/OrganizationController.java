package com.lucid.recruit.org.controller;

import com.lucid.core.exception.ApplicationException;
import com.lucid.recruit.org.OrganizationService;
import com.lucid.recruit.org.dto.OrganizationDTO;
import com.lucid.recruit.org.entity.Organization;
import com.lucid.recruit.org.validation.OrgValidation;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.lucid.util.Strings;

import java.time.Clock;
import java.util.Map;

@RestController
@RequestMapping("/api/raves")
public class OrganizationController {

    private static final String ORG_CTRL_ERROR_00001 = "ORG_CTRL_ERROR_00001";

    @Autowired
    private OrganizationService organizationService;

    @Autowired
    private OrgValidation orgValidation;

    @PostMapping("v1/organization")
    public ResponseEntity<Object> createOrganization(@RequestBody @Valid OrganizationDTO organizationDTO) throws Exception {
        orgValidation.validateOrganization(organizationDTO);
        return ResponseEntity.ok(organizationService.createOrganization("System", organizationDTO));
    }

    @PutMapping("v1/organization/{id}")
    public ResponseEntity<Object> editOrganization(@RequestBody @Valid OrganizationDTO organizationDTO, @PathVariable("id") String organizationId) throws Exception {
        organizationDTO.setOrganizationID(organizationId);
        orgValidation.validateOrganization(organizationDTO);
        OrganizationDTO updatedOrganization = organizationService.editOrganization("System",organizationId ,organizationDTO);
        return ResponseEntity.ok(updatedOrganization);
    }



    @GetMapping("v1/organization/{id}")
    public ResponseEntity<Object> retrieveOrganization(@PathVariable(name = "id") String organizationId) throws Exception {
        return ResponseEntity.ok(organizationService.retrieveOrganization(organizationId));
    }

    @GetMapping("v1/organization")
    public ResponseEntity<Object> retrieveAllOrganization(@RequestBody Map<String, Object> filterData) throws Exception {
        return ResponseEntity.ok(organizationService.retrieveAllOrganization(filterData));
    }


    @PostMapping("v1/organization/{id}/{status}")
    public ResponseEntity<Object> statusCode(@RequestParam String organizationID, @RequestParam String status) {
        String result = organizationService.updateStatus(organizationID, status);

        return ResponseEntity.ok(organizationService.updateStatus(organizationID, status));
    }

    @PatchMapping("v1/organization/{organizationId}/{taxId}")
    public ResponseEntity<String> updateTaxId(@PathVariable(name = "organizationId") String organizationId, @PathVariable("taxId") String taxId) {
        Organization updatedOrganization = organizationService.updateTaxId(organizationId, taxId);
        return ResponseEntity.status(HttpStatus.OK).body("Tax ID updated successfully");

    }


    @GetMapping("v1/webAddress")
    public String getOrganization(Model model) {
        String webAddress = "https://www.example.com";
        String domainName = organizationService.getDomainName(webAddress);
        model.addAttribute("domainName", domainName);
        return "organization";
    }


}

