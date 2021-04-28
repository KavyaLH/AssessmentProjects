package com.wolken.wolkenworkspace.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wolken.wolkenworkspace.Entity.AddProdEntity;
import com.wolken.wolkenworkspace.Entity.GiftEntity;
import com.wolken.wolkenworkspace.Service.LoginService;
import com.wolken.wolkenworkspace.dao.SearchProdDao;
import com.wolken.wolkenworkspace.dto.LoginDto;

@Controller
public class SearchController {
	static final Logger logger = Logger.getLogger(SearchController.class);
	
	/*
	 * @Autowired SearchProdService service;
	 */
	@Autowired
	SearchProdDao dao;

	
	@RequestMapping("/searchtab.do")
	public String search(HttpServletRequest req)
	{
		logger.info("Inside Search: Getting parameter");
		String pn = req.getParameter("pname");
		logger.info("Inside Search: Link to service");
		List<AddProdEntity> addprodentity= dao.getByPname(pn);
		logger.info("Inside Search: Setting an attibute"+addprodentity);
		req.setAttribute("addprodentity", addprodentity);

		logger.info("Inside Search: Redirect:home2.jsp"+addprodentity);
		return "home1.jsp";
	}

}
