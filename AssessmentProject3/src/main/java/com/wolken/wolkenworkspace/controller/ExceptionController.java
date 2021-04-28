package com.wolken.wolkenworkspace.controller;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.wolken.wolkenworkspace.dto.ErrorDto;
import com.wolken.wolkenworkspace.exception.CustomException;

@ControllerAdvice
public class ExceptionController {

	@ExceptionHandler(CustomException.class)
	public ResponseEntity<ErrorDto> handleException(CustomException ex)
	{
		ErrorDto dto = new ErrorDto(HttpStatus.INTERNAL_SERVER_ERROR.value(), ex.getMessage());
		return new ResponseEntity<ErrorDto>(dto, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	@ExceptionHandler(value= SQLIntegrityConstraintViolationException.class)
	public String handleSqlException(Model req , SQLException ex)
	{
	req.addAttribute("ErrMsg","Something went wrong");
	return "searchprod.jsp";
	}
	
}
