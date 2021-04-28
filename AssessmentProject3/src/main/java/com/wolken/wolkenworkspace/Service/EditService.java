package com.wolken.wolkenworkspace.Service;

import com.wolken.wolkenworkspace.Entity.GiftEntity;
import com.wolken.wolkenworkspace.dto.UpdateDto;

public interface EditService {
public GiftEntity Edit(String email);
public String validateNUpdate(UpdateDto dto);

}
