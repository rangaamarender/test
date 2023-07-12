package com.lucid.recruit.referencedata.service;

import java.util.List;

import com.lucid.recruit.org.dto.OrganizationDTO;
import com.lucid.recruit.referencedata.dto.JobDTO;

public interface RefernceDataService {
	List<JobDTO> retriveAllJobs();
	List<OrganizationDTO> retriveAllOrganizations();
}
