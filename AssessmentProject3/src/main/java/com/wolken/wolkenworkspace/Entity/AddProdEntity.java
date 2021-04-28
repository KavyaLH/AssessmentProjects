package com.wolken.wolkenworkspace.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Controller;

import lombok.Data;

@Data
@Entity
@Table(name="addprodtab")

@Controller
public class AddProdEntity {
	
	@Id
	@Column(name = "ProdId")
	private int pid;
	
	@Column(name = "ProdName")
	private String pname;
	
	@Column(name = "ProdQuantity")
	private int pquantity;
	
	@Column(name = "ProdPrice")
	private long pprice;

}
