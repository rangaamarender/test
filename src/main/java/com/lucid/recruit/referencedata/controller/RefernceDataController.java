package com.lucid.recruit.referencedata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucid.recruit.org.dto.OrganizationDTO;
import com.lucid.recruit.referencedata.dto.JobDTO;
import com.lucid.recruit.referencedata.service.RefernceDataService;

import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Refernce Data", description = "Refernce Data API")
@RestController
public class RefernceDataController {

	@Autowired
	private RefernceDataService refDataService;

	@GetMapping("/v1/job")
	public List<JobDTO> getAllJobs() {
		return refDataService.retriveAllJobs();
	}

	@GetMapping("/v1/organization")
	public List<OrganizationDTO> getAllOrganizations() {
		return refDataService.retriveAllOrganizations();
	}

}
