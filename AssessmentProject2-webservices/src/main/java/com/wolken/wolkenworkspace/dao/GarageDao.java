package com.wolken.wolkenworkspace.dao;

import java.util.List;

import com.wolken.wolkenworkspace.dto.VehicleDto;

public interface GarageDao {
public String saveVal(VehicleDto dto);
public List<VehicleDto> getVal(); 
public String updateVal(VehicleDto dto);
public String deleteVal(VehicleDto vid);
}
