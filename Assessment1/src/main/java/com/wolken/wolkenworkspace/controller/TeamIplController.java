package com.wolken.wolkenworkspace.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wolken.wolkenworkspace.dao.Teamdao;
import com.wolken.wolkenworkspace.dto.TeamIplDto;

@Component
@RequestMapping("/")
public class TeamIplController {

    @Autowired
	Teamdao dao;

	@RequestMapping("/teamIPL.do")
	public String save(@ModelAttribute TeamIplDto teamipldto, HttpServletRequest req)
	{
		String msg = dao.save(teamipldto);
		req.setAttribute("msg", msg);
		return "home.jsp";
	}
	
    @RequestMapping("teamIPLdel.de")
    public String delete( HttpServletRequest req)
    {
    	String id = req.getParameter("teamId");
    	
    	String msg1 = dao.delete(Integer.parseInt(id));
    	if(msg1 == null)
    	{
    		return "home4.jsp";
    	}
    	req.setAttribute("msg1", msg1);
    	return"home1.jsp";
    }
    
    @RequestMapping("teamIPLupdate.up")
    public String update(@ModelAttribute TeamIplDto teamipldto, HttpServletRequest req)
    {
    	String msg2 = dao.update(teamipldto);
    	
    	req.setAttribute("msg2", msg2);
    	
    	return"home2.jsp";
    }
    
	
    @RequestMapping("teamIPLget.get") 
    public String getTeam(HttpServletRequest req)
	{ 
    	String id = req.getParameter("teamId");
		TeamIplDto msg3= dao.getTeam(Integer.parseInt(id)); 
	    req.setAttribute("msg3", msg3);
	    return"home3.jsp"; }
	  
	 
}
