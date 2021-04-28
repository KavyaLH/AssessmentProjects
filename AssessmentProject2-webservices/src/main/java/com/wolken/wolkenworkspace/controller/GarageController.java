package com.wolken.wolkenworkspace.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wolken.wolkenworkspace.dto.VehicleDto;
import com.wolken.wolkenworkspace.service.GarageService;

@RestController
@RequestMapping("/")
public class GarageController {

	@Autowired
	GarageService service;
	
	static final Logger logger = Logger.getLogger(GarageController.class);
	
	VehicleDto dto = new VehicleDto();

	/*
	 * public GarageController() { dto.setVid(1); dto.setType("bike");
	 * dto.setNoOfWhl(2); dto.setColor("black"); }
	 */
	 
	@GetMapping("/getAll")
	public List<VehicleDto> getAll() {
		logger.info("Inside getAll: Calling method from GarageService");
		return service.get();
	}

	@PostMapping("/save")
	public String save(@RequestBody VehicleDto dto1) {
		logger.info("Inside save: Calling method from GarageService");
	service.save(dto1);
	logger.info("Inside save: returning message");
		return "Saved";
	}

	@PutMapping("/update")
	public String update(@RequestBody VehicleDto dto) {
		logger.info("Inside update: Calling method from GarageService");
		service.update(dto);
		logger.info("Inside update: returning message");
		return "Updated ";
	}

	@DeleteMapping("/delete")
	public String del(@RequestBody VehicleDto vid) {
		logger.info("Inside del: Calling method from GarageService");
		service.delete(vid);
		logger.info("Inside del: returning message");
		return "Deleted ";
	}
}
