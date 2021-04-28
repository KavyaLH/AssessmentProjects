package com.wolken.wolkenworkspace.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;

import com.wolken.wolkenworkspace.Entity.AddProdEntity;
import com.wolken.wolkenworkspace.Entity.GiftEntity;
import com.wolken.wolkenworkspace.dto.AddProdDto;

@Component
public class SearchProdDaoImpl implements SearchProdDao {

	@Autowired
	LocalSessionFactoryBean bean;
	


	static final Logger logger = Logger.getLogger(GiftDaoImpl.class);

	public List<AddProdEntity> getByPname(String pname) {
		
		
		  logger.info("Inside getByUserName: Getting bean object"); SessionFactory
		  factory = bean.getObject();
		  
		  logger.info("Inside getByPname: Opening session"); 
		  Session ses =factory.openSession(); 
		  
		  logger.info("Inside getByPname: Begin Transaction");
		  Transaction trans = ses.beginTransaction();
		  
		  logger.info("Inside getByPname: Creating a query"); 
		  Query query= ses.createQuery("from AddProdEntity a where a.pname =:pname");
		  
		  logger.info("Inside getByPname: Set Parameter");
		  query.setParameter("pname", pname);
				  
		  logger.info("Inside getByPname: Get values");
		  List<AddProdEntity> addpro= query.list();
		
		  logger.info("Inside getByPname: Return addpro");
		  return addpro;
		  }
		
	}


