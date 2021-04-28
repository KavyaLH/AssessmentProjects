package com.wolken.wolkenworkspace.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wolken.wolkenworkspace.Entity.AddProdEntity;
import com.wolken.wolkenworkspace.Entity.GiftEntity;
import com.wolken.wolkenworkspace.dao.AddProdDao;
import com.wolken.wolkenworkspace.dto.AddProdDto;
import com.wolken.wolkenworkspace.exception.CustomException;

@Service
public class AddProdServiceImpl implements AddProdService{

	@Autowired	
	AddProdDao dao;
	
	public String addProduct(AddProdDto dto) {
		String msg;
		AddProdEntity entity1 = new AddProdEntity();
		/*
		 * try {
		 */
		entity1.setPid(dto.getPid());
		entity1.setPname(dto.getPname());
		entity1.setPquantity(dto.getPquantity());
		entity1.setPprice(dto.getPprice());
		 msg=dao.addProdd(entity1);
/*	}
	catch(Exception e)
	{
		 throw new CustomException("Duplicate product key");
	}
	*/	return msg;
		
	}

}
