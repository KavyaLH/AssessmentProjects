package com.wolken.wolkenworkspace.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wolken.wolkenworkspace.Entity.GiftEntity;
import com.wolken.wolkenworkspace.Service.EditService;
import com.wolken.wolkenworkspace.Service.LoginService;
import com.wolken.wolkenworkspace.dto.GiftDto;
import com.wolken.wolkenworkspace.dto.LoginDto;
import com.wolken.wolkenworkspace.dto.UpdateDto;

@Controller
public class EditController {
	
	@Autowired
	EditService service;
	
	static final Logger logger = Logger.getLogger(EditController.class);
	
	@RequestMapping("/edittab.do")
	public String Edit(HttpServletRequest req)
	{
		try
		{
		logger.info("Inside Edit: Getting parameter");
		String email = req.getParameter("useremail");
		logger.info("Inside Edit: Link to service");
		GiftEntity giftentity= service.Edit(email);
		logger.info("Inside Edit: Setting an attibute");
		req.setAttribute("giftentity", giftentity);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		logger.info("Inside Edit: Redirect:edit.jsp");
		return "edit.jsp";
	
	}
	
	@RequestMapping("/updatetab.do")
	public String update(@ModelAttribute UpdateDto dto, HttpServletRequest req)
	{
	
		logger.info("Inside update: Calling method from EditServiceImpl");
		String msg= service.validateNUpdate(dto);
		logger.info("Inside update: Setting an attribute");
		req.setAttribute("msg", msg);	
		
	
		logger.info("Inside update: Redirect: update.jsp");
		return "update.jsp";
	}
	
	
}
