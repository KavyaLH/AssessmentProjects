package com.wolken.wolkenworkspace.dao;

import java.util.List;

import com.wolken.wolkenworkspace.Entity.AddProdEntity;
import com.wolken.wolkenworkspace.Entity.GiftEntity;

public interface SearchProdDao {
	
	public List<AddProdEntity> getByPname(String pname);
}
