package com.wolken.wolkenworkspace.Service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.wolken.wolkenworkspace.Entity.LoginEntity;
import com.wolken.wolkenworkspace.dao.LoginDao;
import com.wolken.wolkenworkspace.dto.LoginDto;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginDao dao;
	
	@Autowired
	LoginEntity entity;
	
	static final Logger logger = Logger.getLogger(LoginServiceImpl.class);
	
	public String Login(LoginDto dto) {
		
		logger.info("Inside Login: calling method from dao");
		LoginEntity entity = dao.Login(dto.getUsername());
		logger.info("Inside Login: if condition");
		String s=null;
		if(entity!=null)
		{
			if(dto.getUsername().equals(entity.getUsername()))
			{
				if(dto.getUpass().equals(entity.getUpass()))
				{	
				      s= entity.getUsername();	
				}
			}
		
		}
		
	return s;

	}

}
