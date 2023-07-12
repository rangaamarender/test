/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.worker.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucid.recruit.worker.entity.WorkAssignment;

/**
 * 
 * @author chandu
 *
 */
public interface WorkeAssignmentRepo extends JpaRepository<WorkAssignment, String> {

}
