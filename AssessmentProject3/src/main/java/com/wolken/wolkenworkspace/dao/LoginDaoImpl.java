package com.wolken.wolkenworkspace.dao;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;

import com.wolken.wolkenworkspace.Entity.GiftEntity;
import com.wolken.wolkenworkspace.Entity.LoginEntity;
import com.wolken.wolkenworkspace.controller.LoginController;

@Component
public class LoginDaoImpl implements LoginDao{

	@Autowired
	LocalSessionFactoryBean bean;
	
	static final Logger logger = Logger.getLogger(LoginDaoImpl.class);
	  
	public LoginEntity Login( String username) {
		logger.info("Inside Login: SessionFactory bean object");
		SessionFactory factory = bean.getObject();
		logger.info("Inside Login: Opening session");
		Session ses = factory.openSession();
		logger.info("Inside Login: Begin transaction");
		Transaction trans = ses.beginTransaction();
		logger.info("Inside Login: Creating a query");
		Query query= ses.createQuery("from LoginEntity G where G.username =:username");
		logger.info("Inside Login: Setting parameter");
		query.setParameter("username", username);
		logger.info("Inside Login: Unique result");
		LoginEntity entity=(LoginEntity)query.uniqueResult();
		logger.info("Inside Login: Commit");
		trans.commit();
		logger.info("Inside Login: Returning an entity");
		return entity; 
	}
	
}
