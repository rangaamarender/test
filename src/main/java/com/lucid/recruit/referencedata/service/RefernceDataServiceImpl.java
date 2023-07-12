package com.lucid.recruit.referencedata.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucid.recruit.org.dto.OrganizationDTO;
import com.lucid.recruit.org.repo.OrganizationRepo;
import com.lucid.recruit.referencedata.dto.JobDTO;
import com.lucid.recruit.referencedata.repo.JobRepo;

@Service
public class RefernceDataServiceImpl implements RefernceDataService {
	@Autowired
	private JobRepo jobRepo;
	@Autowired
	private OrganizationRepo organizatioRepo;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<JobDTO> retriveAllJobs() {
		return jobRepo.findAll().stream().map(job -> modelMapper.map(job, JobDTO.class)).collect(Collectors.toList());
	}

	@Override
	public List<OrganizationDTO> retriveAllOrganizations() {
		return organizatioRepo.findAll().stream()
				.map(organization -> modelMapper.map(organization, OrganizationDTO.class)).collect(Collectors.toList());
	}

}
