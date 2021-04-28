package com.wolken.wolkenworkspace.service;

import java.util.List;

import com.wolken.wolkenworkspace.dto.VehicleDto;

public interface GarageService {
public String save(VehicleDto dto);
public List<VehicleDto> get();
public String update(VehicleDto dto);
public String delete(VehicleDto vid);
}
