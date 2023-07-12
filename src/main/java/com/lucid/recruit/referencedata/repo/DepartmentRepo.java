package com.lucid.recruit.referencedata.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucid.recruit.referencedata.entity.Department;

/**
 * 
 * @author chandu
 *
 */
public interface DepartmentRepo extends JpaRepository<Department, String> {

}
