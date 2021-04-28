package com.wolken.wolkenworkspace.dao;

import com.wolken.wolkenworkspace.dto.TeamIplDto;

public interface Teamdao {
	public String save(TeamIplDto dto);
	public String delete(int teamId);
	public String update(TeamIplDto dto);
	public TeamIplDto getTeam(int id);
}
