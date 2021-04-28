package com.wolken.wolkenworkspace.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wolken.wolkenworkspace.dao.GarageDao;
import com.wolken.wolkenworkspace.dao.GarageDaoImpl;
import com.wolken.wolkenworkspace.dto.VehicleDto;

@Service
public class GarageServiceImpl implements GarageService {

	@Autowired
	GarageDao dao;
	static final Logger logger = Logger.getLogger(GarageServiceImpl.class);
	  
	@Override
	public String save(VehicleDto dto) {
	logger.info("Inside save: ");
  
	return dao.saveVal(dto);
	}

	@Override
	public List<VehicleDto> get() {
		logger.info("Inside get: ");
		return dao.getVal();
	}

	@Override
	public String update(VehicleDto dto) {
		logger.info("Inside update: ");
		return dao.updateVal(dto);
	}

	@Override
	public String delete(VehicleDto vid) {
		logger.info("Inside delete: ");
		return dao.deleteVal(vid);
	}

}
