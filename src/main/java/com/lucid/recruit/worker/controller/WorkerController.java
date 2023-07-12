package com.lucid.recruit.worker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.lucid.recruit.worker.dto.WorkerDTO;
import com.lucid.recruit.worker.dto.WorkerSummaryDTO;
import com.lucid.recruit.worker.service.WorkerService;

import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Worker", description = "Worker Management API")
@RestController
@RequestMapping
public class WorkerController {
	@Autowired
	private WorkerService workerService;

	@PostMapping(path = "/v1/worker")
	public WorkerDTO createWorker(@RequestBody WorkerDTO workerDTO) {
		System.out.println("************ WORKER**********");
		return workerService.createWorker(workerDTO);
	}

	@GetMapping(path = "/v1/worker")
	public List<WorkerSummaryDTO> retriveAllWorkers() {
		return workerService.retriveAllWorkers();
	}

	@GetMapping(path = "/v1/worker/{id}")
	public WorkerDTO retriveWorker(@PathVariable String id) {
		return workerService.retriveWorkerById(id);
	}

}
