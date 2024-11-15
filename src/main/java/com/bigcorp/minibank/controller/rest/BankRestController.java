package com.bigcorp.minibank.controller.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bigcorp.minibank.model.Bank;
import com.bigcorp.minibank.service.BankService;

@RestController
@RequestMapping("/rest/banks")
public class BankRestController {

	@Autowired
	private BankService bankService;

	@GetMapping
	public List<Bank> getBank(@RequestParam("name") String name) {
		return bankService.findByName(name);
	}

	@GetMapping(path = "/{id}")
	public Optional<Bank> getBank(@PathVariable("id") Long id) {
		System.out.println("Appel de BankRestController.getBank() avec l'id : " + id);
		return bankService.getBank(id);

	}

	@DeleteMapping(path = "/{id}")
	public void deleteBank(@PathVariable("id") Long id) {
		System.out.println("Appel de BankRestController.deleteBank() avec l'id : " + id);
		bankService.deleteBank(id);
	}

	@PostMapping
	public Bank saveBank(@RequestBody Bank bank) {
		System.out.println("Appel de BankRestController.saveBank()");
		return bankService.saveBank(bank);
	}
}
