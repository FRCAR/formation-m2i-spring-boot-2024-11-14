package com.bigcorp.minibank.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bigcorp.minibank.model.Bank;

@SpringBootTest
class BankServicetest {

	@Autowired
	private BankService bankService;

	@Test
	void testSave() {
		Bank bank = bankService.saveBank(new Bank());
		Assertions.assertNotNull(bank.getId());
	}

}
