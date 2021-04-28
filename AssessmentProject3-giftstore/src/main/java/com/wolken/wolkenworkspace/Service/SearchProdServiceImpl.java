/*
 * package com.wolken.wolkenworkspace.Service;
 * 
 * import org.apache.log4j.Logger; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service;
 * 
 * import com.wolken.wolkenworkspace.Entity.AddProdEntity; import
 * com.wolken.wolkenworkspace.dao.SearchProdDao;
 * 
 * 
 * @Service public class SearchProdServiceImpl implements SearchProdService {
 * 
 * @Autowired SearchProdDao dao;
 * 
 * static final Logger logger = Logger.getLogger(SearchProdServiceImpl.class);
 * public AddProdEntity searchProd(String pname) {
 * logger.info("Inside Edit: Calling method from dao"); AddProdEntity entity =
 * (AddProdEntity) dao.getByPname(pname);
 * logger.info("Inside Edit: Returning an entity"); return entity; }
 * 
 * }
 */