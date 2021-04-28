package com.wolken.wolkenworkspace.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.hibernate.transform.AliasToEntityMapResultTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wolken.wolkenworkspace.Service.LoginService;
import com.wolken.wolkenworkspace.dto.LoginDto;

@Controller
public class LoginController {

	@Autowired
	LoginService service;
	
	static final Logger logger = Logger.getLogger(LoginController.class);
	
	@RequestMapping("/logintab.do")
	public String Login(@ModelAttribute LoginDto dto, HttpServletRequest req)
	{   logger.info("Inside Login: Calling method from LoginService");
		String msg= service.Login(dto);
		String msg1= "Login was not successfull. Please check user name and password..";
		String msg2= "Welcome "+ msg;
        if(msg == null)
        {
        	
        req.setAttribute("msg", msg1);
		return "login.jsp";
		
        }
        else
        {
        	logger.info("Inside Loggggin: Setting an attribute"+msg);	
            req.setAttribute("msg", msg2);	
            logger.info("Inside Loggggin: Setting an attribute"+msg);
            
        	return "home1.jsp";
        }
        }
	}
	
	

