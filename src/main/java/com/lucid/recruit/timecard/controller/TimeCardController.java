package com.lucid.recruit.timecard.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucid.recruit.timecard.dto.TimeCardDTO;
import com.lucid.recruit.timecard.service.TimeCardService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(path = "/api/raves/")
public class TimeCardController {
	private static final Logger log = LoggerFactory.getLogger(TimeCardController.class);

	@Autowired
	private TimeCardService timeCardService;
	

	@PostMapping(path = "v1/timeCard")
	public ResponseEntity<Object> createTimeCard(@RequestBody @Valid TimeCardDTO timeCardDTO) {
		log.info("Create time input");		
		ResponseEntity.ok(timeCardService.createTimeCard(timeCardDTO));
		return ResponseEntity.ok(timeCardDTO);
	}

	@GetMapping("v1/timeCard/{id}")
	public ResponseEntity<Object> retrieveTimeCard(@PathVariable(name = "id") String timeCardID) {
		return ResponseEntity.ok(timeCardService.retrieveTimeCard(timeCardID));
	}

	@GetMapping("v1/timeCards")
	public ResponseEntity<Object> retrieveAllTimeCards(@RequestBody Map<String, Object> filterData) {
		return ResponseEntity.ok(timeCardService.retrieveAllTimeCards(filterData));
	}

	@PutMapping("v1/timeCard/{id}")
	public ResponseEntity<Object> editTimeCard(@PathVariable(name = "id") String timeCardID,
			@RequestBody TimeCardDTO timeCardDTO) {
		// timeCardValidations.validateEditTimeCard(timeCardID, timeCardDTO);
		return ResponseEntity.ok(timeCardService.editTimeCard(timeCardID, timeCardDTO));
	}

}
