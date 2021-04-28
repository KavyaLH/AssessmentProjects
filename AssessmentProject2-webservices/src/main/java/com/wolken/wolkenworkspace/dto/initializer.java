package com.wolken.wolkenworkspace.dto;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.wolken.wolkenworkspace.dao.GarageDao;
import com.wolken.wolkenworkspace.dao.GarageDaoImpl;

public class initializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {

		return null;
		//new Class[] { GarageDaoImpl.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {

		return new Class[] { AppConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
	
		return new String[] {"/"};
	}

}
