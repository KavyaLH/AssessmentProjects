package com.wolken.wolkenworkspace.Service;



import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wolken.wolkenworkspace.Entity.GiftEntity;
import com.wolken.wolkenworkspace.Entity.LoginEntity;
import com.wolken.wolkenworkspace.dao.GiftDao;
import com.wolken.wolkenworkspace.dao.LoginDaoImpl;
import com.wolken.wolkenworkspace.dto.GiftDto;
import com.wolken.wolkenworkspace.dto.LoginDto;
import com.wolken.wolkenworkspace.dto.UpdateDto;

@Service
public class EditServiceImpl implements EditService {
	
	@Autowired
	GiftDao dao;
	
	@Autowired
	GiftDto dto;
	
	static final Logger logger = Logger.getLogger(EditServiceImpl.class);
	 
	public GiftEntity Edit(String useremail) {
		    logger.info("Inside Edit: Calling method from dao");
			GiftEntity entity = dao.edit(useremail);
			logger.info("Inside Edit: Returning an entity");	
		    return entity;

}
	
public String validateNUpdate(UpdateDto dto)
	{
	    logger.info("Inside validateNUpdate: Calling method from dao");
		int res=dao.updateByEmail(dto);
		logger.info("Inside validateNUpdate: if condition");
		if(res != 1)
		{
			return "Updated";
		}
		else
		{
			return "Not updated";
		}
	}
		
	
}