
package com.lucid.recruit.worker.service;

import java.util.List;

import com.lucid.recruit.worker.dto.WorkerDTO;
import com.lucid.recruit.worker.dto.WorkerSummaryDTO;

/**
 * 
 * @author chandu
 * 
 */
public interface WorkerService {

	WorkerDTO createWorker(WorkerDTO worker);

	WorkerDTO retriveWorkerById(String workerId);

	List<WorkerSummaryDTO> retriveAllWorkers();

}
