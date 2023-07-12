package com.lucid.recruit.referencedata.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucid.recruit.referencedata.entity.Job;

/**
 * 
 * @author chandu
 *
 */
public interface JobRepo extends JpaRepository<Job, String> {

}
