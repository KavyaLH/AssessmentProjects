package com.wolken.wolkenworkspace.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;

import javax.validation.constraints.Size;

import org.apache.log4j.Logger;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

import com.wolken.wolkenworkspace.controller.GiftController;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="gifttab")

@Component

public class GiftEntity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name ="native",strategy = "native")
	@Column(name = "UserId")
	private int uId;
	
	@Size(min = 8, max = 15)
	@Column(name = "UserName")
	private String username;
	
	@Email
	@Column(name = "EmailId")
	private String useremail;
	
	@Column(name = "Contact")
	private long contactno;
	
	@Column(name = "DOB")
	private String dob;
	
	@Column(name = "Gender")
	private String gender;
	
	@Column(name = "UserPassword")
	private String upass;

    @Transient
	private String Conpass;
}


