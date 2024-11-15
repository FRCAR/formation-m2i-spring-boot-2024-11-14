package com.bigcorp.minibank.rest.controller;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import com.bigcorp.minibank.model.Bank;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BankControllerITTest {

	@Autowired
	private TestRestTemplate template;

    @Test
    public void getBank() throws Exception {
    	
        ResponseEntity<Bank> response = template.postForEntity("/rest/banks", new Bank(), Bank.class);
        assertNotNull(response.getBody());
        assertTrue(response.getStatusCode().is2xxSuccessful());
    }
    
}