package com.bigcorp.minibank.controller.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.bigcorp.minibank.exception.MonExceptionMetier;

/**
 * Un RestControllerAdvice fournit des services
 * transverses à tous les RestControllers
 */
@RestControllerAdvice
public class MiniBankRestControllerAdvice {

	
	@ExceptionHandler(MonExceptionMetier.class)
	public ResponseEntity<String> handleResponseStatusException(MonExceptionMetier monExceptionMetier){
		System.out.println("Je vais transformer " + monExceptionMetier);
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erreur due à l'exception " +monExceptionMetier.getMessage() );
	}
}
