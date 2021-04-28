package com.wolken.wolkenworkspace.controller;

import java.util.logging.LogManager;


import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wolken.wolkenworkspace.Entity.GiftEntity;
import com.wolken.wolkenworkspace.Service.GiftService;
import com.wolken.wolkenworkspace.dao.GiftDao;

import com.wolken.wolkenworkspace.dto.GiftDto;

@Component
@RequestMapping("/")
public class GiftController {

	static final Logger logger = Logger.getLogger(GiftController.class);
	@Autowired
	GiftDao dao;
	
	@Autowired
	GiftService service;
	
	@RequestMapping("/gifttab.do")
	public String save(@ModelAttribute GiftDto dto, HttpServletRequest req)
	{
	
        logger.info("Inside Save");
		String msg = service.Register(dto);
		String msg1 = "Data exists!! Try with different credentials";
		if (msg == null)
		{
		req.setAttribute("msg", msg1);	
	    return "index.jsp";
		}
	    else
	    {
	String msg2 = "Successfully Registered";
	req.setAttribute("msg", msg2);
	logger.info("Redirect: home.jsp");
	return "login.jsp";
	}
	    
		}
	}

