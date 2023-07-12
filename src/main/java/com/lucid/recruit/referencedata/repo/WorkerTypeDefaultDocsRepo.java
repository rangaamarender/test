package com.lucid.recruit.referencedata.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucid.recruit.referencedata.entity.WorkerType;
import com.lucid.recruit.referencedata.entity.WorkerTypeDefaultDocs;
import com.lucid.recruit.referencedata.entity.WrkTypeDefDocsID;

/**
 * 
 * @author chandu
 *
 */
public interface WorkerTypeDefaultDocsRepo extends JpaRepository<WorkerTypeDefaultDocs, WrkTypeDefDocsID> {
	List<WorkerTypeDefaultDocs> findByWorkerTypeCode(WorkerType workerType);
}
