package com.wolken.wolkenworkspace.dto;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class UpdateDto {

private int uId;	
	private String username;
	private String useremail;
	private String gender;
	private long contactno;
}
