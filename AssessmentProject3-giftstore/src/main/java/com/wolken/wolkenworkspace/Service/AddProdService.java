package com.wolken.wolkenworkspace.Service;

import com.wolken.wolkenworkspace.dto.AddProdDto;
import com.wolken.wolkenworkspace.exception.CustomException;


public interface AddProdService {
	public String addProduct(AddProdDto dto);
}
