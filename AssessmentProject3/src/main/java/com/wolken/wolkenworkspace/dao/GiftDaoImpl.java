package com.wolken.wolkenworkspace.dao;


import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;

import com.wolken.wolkenworkspace.Entity.GiftEntity;
import com.wolken.wolkenworkspace.Entity.LoginEntity;
import com.wolken.wolkenworkspace.controller.GiftController;
import com.wolken.wolkenworkspace.dto.GiftDto;
import com.wolken.wolkenworkspace.dto.UpdateDto;

@Component
public class GiftDaoImpl implements GiftDao {

	@Autowired
	LocalSessionFactoryBean bean;
	


	static final Logger logger = Logger.getLogger(GiftDaoImpl.class);

	public String register(GiftEntity giftEntity) {
       try {
		logger.info("Inside Register: Getting bean object");
		SessionFactory factory = bean.getObject();
		logger.info("Inside Register: Opening session");
		Session ses = factory.openSession();
		logger.info("Inside Register: Begin Transaction");
		Transaction trans = ses.beginTransaction();
		logger.info("Inside Register: Saving Entity");
		ses.save(giftEntity);
		logger.info("Inside Register: Performing commit");
		trans.commit();
		logger.info("Inside Register: Closing session");
		ses.close();
		
       }catch(Exception e) {
    	   System.out.println(e.getMessage());
    	   
       }
       logger.info("Inside Register: Returning message");
		return " ";
	}

	
	  public GiftEntity getByUserName(String username) {
	  
	  logger.info("Inside getByUserName: Getting bean object");
	  SessionFactory factory = bean.getObject(); 
	  
	  logger.info("Inside getByUserName: Opening session");
	  Session ses =factory.openSession(); 
	  logger.info("Inside getByUserName: Begin Transaction");
	  Transaction trans = ses.beginTransaction(); 
	  logger.info("Inside getByUserName: Creating a query");
	  Query query= ses.createQuery("from GiftEntity G where G.username =:username");
	  logger.info("Inside getByUserName: Set Parameter");
	  query.setParameter("username", username); 
	  logger.info("Inside getByUserName: Type casting to GiftEntity");
	  GiftEntity entity=(GiftEntity)query.uniqueResult();
	  logger.info("Inside getByUserName: Commit transaction");
	  trans.commit();
	  logger.info("Inside getByUserName: Returning an entity");
	  return entity; 
	  }


	  public GiftEntity edit(String useremail) {
			SessionFactory factory = bean.getObject();
			Session ses = factory.openSession();
			Transaction trans = ses.beginTransaction();
			Query query= ses.createQuery("from GiftEntity G where G.useremail =:useremail");
			query.setParameter("useremail", useremail);
			GiftEntity entity=(GiftEntity)query.uniqueResult();
			trans.commit();
			return entity; 
			
		}


	public int updateByEmail(UpdateDto dto) {
		
		SessionFactory factory = bean.getObject();
		Session ses = factory.openSession();
		Transaction trans = ses.beginTransaction();
		Query query = ses.createQuery("update GiftEntity G set G.uId=:uId, G.username=:username, G.gender=:gender, G.contactno =: contactno where G.useremail =:useremail");
		query.setParameter("uId",dto.getUId());
		query.setParameter("useremail",dto.getUseremail());
		query.setParameter("username",dto.getUsername());
		query.setParameter("gender",dto.getGender());
		query.setParameter("contactno",dto.getContactno());
		int res = query.executeUpdate();
	//	GiftEntity entity=(GiftEntity)query.uniqueResult();
		
		trans.commit();
		ses.close();
		return res;
	}
		
	 
	}

