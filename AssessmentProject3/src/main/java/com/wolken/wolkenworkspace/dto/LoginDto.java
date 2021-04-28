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

public class LoginDto {
	private int uId;
	private String username;
	private String upass;

}
