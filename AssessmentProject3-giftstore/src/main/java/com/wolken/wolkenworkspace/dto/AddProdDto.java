package com.wolken.wolkenworkspace.dto;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component

public class AddProdDto {
private int pid;
private String pname;
private int pquantity;
private long pprice;
}
