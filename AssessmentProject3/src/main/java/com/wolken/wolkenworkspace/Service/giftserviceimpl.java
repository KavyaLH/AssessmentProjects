package com.wolken.wolkenworkspace.Service;

import org.apache.log4j.Logger;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.wolken.wolkenworkspace.Entity.GiftEntity;
import com.wolken.wolkenworkspace.controller.GiftController;
import com.wolken.wolkenworkspace.dao.GiftDao;
import com.wolken.wolkenworkspace.dto.GiftDto;

@Component
public class giftserviceimpl implements GiftService {
	
	@Autowired
	GiftDao dao;
	
	static final Logger logger = Logger.getLogger(giftserviceimpl.class);
	public String Register(GiftDto dto) {
		GiftEntity entity = new GiftEntity();
		entity=dao.getByUserName(dto.getUsername());
		
		if(entity == null)
		{
			GiftEntity entity1 = new GiftEntity();
		//entity1.setUId(dto.getUId());
		logger.info("Inside giftserviceimpl: Setting User Name");
		entity1.setUsername(dto.getUsername());
		logger.info("Inside giftserviceimpl: Set User Email");
		entity1.setUseremail(dto.getUseremail());
		logger.info("Inside giftserviceimpl: Set Date of Birth");
		entity1.setDob(dto.getDob());
		logger.info("Inside giftserviceimpl: Set Contact Number");
		entity1.setContactno(dto.getContactno());
		logger.info("Inside giftserviceimpl: Set Gender ");
		entity1.setGender(dto.getGender());
		logger.info("Inside giftserviceimpl: Set User Password");
	    entity1.setUpass(dto.getUpass());
		logger.info("Inside giftserviceimpl: Set Confirm Password");
	    entity1.setConpass(dto.getConpass());
	/*	String msg=dao.register(entity);
		return msg;*/
		return dao.register(entity1);
		 }
		else
		{
			return null;
		}
		}
	}


