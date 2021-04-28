package com.wolken.wolkenworkspace.dao;

import com.wolken.wolkenworkspace.Entity.GiftEntity;
import com.wolken.wolkenworkspace.dto.GiftDto;
import com.wolken.wolkenworkspace.dto.UpdateDto;

public interface GiftDao {

	public String register(GiftEntity entity);
public GiftEntity getByUserName(String username);
public GiftEntity edit(String email);
public int updateByEmail(UpdateDto dto);
}
