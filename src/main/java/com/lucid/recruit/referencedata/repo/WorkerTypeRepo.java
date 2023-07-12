package com.lucid.recruit.referencedata.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucid.recruit.referencedata.entity.WorkerType;

public interface WorkerTypeRepo extends JpaRepository<WorkerType, String>  {

}
