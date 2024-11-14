package com.bigcorp.minibank.controller.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankRestController {

	@RequestMapping(method = RequestMethod.GET, path = "/rest/banks/{id}")
	public Bank getBank(@PathVariable("id") Long id) {
		Bank bank = new Bank();
		bank.setId(id);
		bank.setName("Banque populaire");
		return bank;
	}

}
