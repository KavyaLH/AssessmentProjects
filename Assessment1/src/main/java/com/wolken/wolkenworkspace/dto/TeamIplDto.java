package com.wolken.wolkenworkspace.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Entity
@Table(name = "teamipldto")
@Getter
@Setter
public class TeamIplDto {
	@Id
	@Column(name = "teamid")
	private int teamId;
	@Column(name = "teamName")
	private String teamName;
	@Column(name = "homeGround")
	private String homeGround;
	@Column(name = "captain")
	private String captain;
	
	
}
