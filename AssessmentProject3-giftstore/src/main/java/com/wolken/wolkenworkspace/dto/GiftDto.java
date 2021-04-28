package com.wolken.wolkenworkspace.dto;

import org.springframework.stereotype.Component;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Component
public class GiftDto {
	
	private int uId;
	
	private String username;
	
	private String useremail;
	
	private long contactno;
	
	private String dob;

	private String gender;
	
	private String upass;

	private String Conpass;
}
