package com.wolken.wolkenworkspace.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name="gifttab")

@Controller
public class LoginEntity {
	
@Id	
@Column(name = "UserId")
private int uId;
@Column(name = "UserName")
private String username;
@Column(name = "UserPassword")
private String upass;

}
