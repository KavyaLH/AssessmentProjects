
  package com.wolken.wolkenworkspace.dao;
  
  import java.util.List;

import org.apache.log4j.Logger;
import org.apache.tomcat.dbcp.dbcp2.BasicDataSource; import
  org.hibernate.Session;
import org.hibernate.SessionFactory;
import
  org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;
import
  org.springframework.beans.factory.annotation.Autowired; 
  import org.springframework.orm.hibernate5.LocalSessionFactoryBean; import
  org.springframework.stereotype.Component;


import com.wolken.wolkenworkspace.dto.VehicleDto;
  
  @Component 
  public class GarageDaoImpl implements GarageDao {
  
  @Autowired
  VehicleDto dt;
 
  static final Logger logger = Logger.getLogger(GarageDaoImpl.class);
	  
  LocalSessionFactoryBean bean= new LocalSessionFactoryBean();

  Configuration cfg = new Configuration()
		    .setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver")
		    .setProperty("hibernate.connection.url", "jdbc:mysql://127.0.0.1:3306/garagetable")
		    .setProperty("hibernate.connection.username", "root")
		    .setProperty("hibernate.connection.password", "root");
  
  @Override 
     public String saveVal(VehicleDto dto) 
   { 
	 
	    logger.info("Inside saveVal: Annotated class");		  
	    cfg.addAnnotatedClass(VehicleDto.class);
	    logger.info("Inside saveVal: SessionFactory object");
	    SessionFactory factory = cfg.buildSessionFactory();
	    logger.info("Inside saveVal: Opening session");
		Session ses = factory.openSession();
		logger.info("Inside saveVal: Begin transactoin");
		Transaction trans = ses.beginTransaction();
		logger.info("Inside saveVal: save");
		ses.save(dto);
		logger.info("Inside saveVal: commit");
		trans.commit();
		logger.info("Inside saveVal: Clossing session");
		ses.close();
		return "";
  
  }

   @Override
    public List<VehicleDto> getVal()
   {
	   logger.info("Inside getVal: Annotated class");
		cfg.addAnnotatedClass(VehicleDto.class);
		logger.info("Inside getVal: SessionFactory object");
		SessionFactory factory = cfg.buildSessionFactory();
		logger.info("Inside getVal: Open session");
		Session ses = factory.openSession();
		logger.info("Inside getVal: Begin transaction");
		Transaction trans = ses.beginTransaction();
		logger.info("Inside getVal: Query creation");
		Query query= ses.createQuery("from VehicleDto");
		logger.info("Inside getVal: list of type VehicleDto");
		List<VehicleDto> dto1= query.list();
		logger.info("Inside getVal: commit");
		trans.commit();
		logger.info("Inside getVal: close session");
		ses.close();
		return dto1;
   }


	@Override
	public String updateVal(VehicleDto dto) {
		 logger.info("Inside updateVal: Annotated class");
		  cfg.addAnnotatedClass(VehicleDto.class);
		  logger.info("Inside updateVal: SessionFactory object");
		  SessionFactory factory = cfg.buildSessionFactory();
		  logger.info("Inside updateVal: Open session");
		  Session ses2= factory.openSession();
		  logger.info("Inside updateVal: Begin transaction");
		  Transaction  trans = ses2.beginTransaction();
		  logger.info("Inside updateVal: Update");
		  ses2.update(dto);
		  logger.info("Inside updateVal: commit");
		  trans.commit();
		  logger.info("Inside updateVal: close session");
		  ses2.close();
		  return "Updated";
	}

	@Override
	public String deleteVal(VehicleDto vid) {
		logger.info("Inside deleteVal: Annotated class");
		  cfg.addAnnotatedClass(VehicleDto.class);
		  logger.info("Inside deleteVal: SessionFactory object");
		  SessionFactory factory = cfg.buildSessionFactory();
		  logger.info("Inside deleteVal: Open session");
		  Session ses2= factory.openSession();
		  logger.info("Inside deleteVal: Begin transaction");
		  Transaction  trans = ses2.beginTransaction();
		  logger.info("Inside deleteVal: Delete");
		  ses2.delete(vid);
		  logger.info("Inside deleteVal: commit");
		  trans.commit();
		  logger.info("Inside deleteVal: close session");
		  ses2.close();
		  return "Updated";
	
	}
  
  
  }
 