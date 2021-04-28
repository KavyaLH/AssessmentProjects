package com.wolken.wolkenworkspace.dao;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;

import com.wolken.wolkenworkspace.Entity.AddProdEntity;

@Component
public class AddProdDaoImpl implements AddProdDao {
	
	@Autowired
	LocalSessionFactoryBean bean;
	
	static final Logger logger = Logger.getLogger(AddProdDaoImpl.class);

	public String addProdd(AddProdEntity entity) {
		// try {
				logger.info("Inside addProdd: Getting bean object");
				SessionFactory factory = bean.getObject();
				logger.info("Inside addProdd: Opening session");
				Session ses = factory.openSession();
				logger.info("Inside addProdd: Begin Transaction");
				Transaction trans = ses.beginTransaction();
				logger.info("Inside addProdd: Saving Entity");
				ses.save(entity);
				logger.info("Inside addProdd: Performing commit");
				trans.commit();
				logger.info("Inside addProdd: Closing session");
				ses.close();
				
				/*
				 * }catch(Exception e) { System.out.println(e.getMessage());
				 * 
				 * }
				 */
		       logger.info("Inside addProdd: Returning message");
				return "Added";
			}
		
	}
	


