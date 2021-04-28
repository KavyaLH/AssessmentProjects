package com.wolken.wolkenworkspace.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wolken.wolkenworkspace.Service.AddProdService;
import com.wolken.wolkenworkspace.dto.AddProdDto;
import com.wolken.wolkenworkspace.dto.GiftDto;
import com.wolken.wolkenworkspace.exception.CustomException;

@Controller
public class AddProdController {

	@Autowired
	AddProdService service;
	
	static final Logger logger = Logger.getLogger(AddProdController.class);
	
	@RequestMapping("/addprod.do")
	public String addProd(@ModelAttribute AddProdDto dto, HttpServletRequest req) 
	{
		
        logger.info("Inside addProd: Calling method from AddProdService");
      
        String msg = service.addProduct(dto);
		logger.info("Inside addProd: Set Attribute");
		req.setAttribute("msg", msg);	

	logger.info("Redirect: home.jsp");
	return "home.jsp";
	}
}
