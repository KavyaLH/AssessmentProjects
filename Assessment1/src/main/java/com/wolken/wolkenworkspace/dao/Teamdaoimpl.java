package com.wolken.wolkenworkspace.dao;


import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;

import com.wolken.wolkenworkspace.dto.TeamIplDto;

@Component
public class Teamdaoimpl implements Teamdao {
	
	@Autowired
	LocalSessionFactoryBean bean;
	

	public String save(TeamIplDto dto) {
		SessionFactory factory= bean.getObject();
		
		Session ses= factory.openSession();
		Transaction  trans = ses.beginTransaction();
		ses.save(dto);
		trans.commit();
		ses.close();
		return "Added";
		
	}


	public String delete(int id) {
		SessionFactory factory= bean.getObject();
		
		Session ses1= factory.openSession();
		Transaction  trans = ses1.beginTransaction();	
		TeamIplDto tid = (TeamIplDto) ses1.load(TeamIplDto.class, id);
		if (null != tid) {
		ses1.delete(tid);
        }
		
		trans.commit();
		ses1.close();
		return "Deleted";
	}


	public String update(TeamIplDto dto) {
        SessionFactory factory2= bean.getObject();	
		Session ses2= factory2.openSession();
		Transaction  trans = ses2.beginTransaction();
        ses2.update(dto);
		trans.commit();
		ses2.close();
		return "Updated";
		
	}

	public TeamIplDto getTeam(int teamId) {
      SessionFactory factory2= bean.getObject();
		Session ses2= factory2.openSession();
		TeamIplDto ti= ses2.get(TeamIplDto.class,teamId);
		ses2.close();
		return ti;
	}
	
}
