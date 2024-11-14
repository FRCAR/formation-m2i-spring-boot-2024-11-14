package com.bigcorp.minibank.service;

import org.springframework.stereotype.Service;

import com.bigcorp.minibank.controller.rest.Bank;

@Service
public class BankService {

	public Bank getBank(Long id) {
		System.out.println("Appel de BankService.getBank() avec l'id : " + id);
		Bank bank = new Bank();
		bank.setId(id);
		bank.setName("Banque populaire");
		return bank;
	}

	public void deleteBank(Long id) {
		System.out.println("Appel de BankService.deleteBank() avec l'id : " + id);
	}

	public Bank saveBank(Bank bank) {
		System.out.println("Je sauvegarde la banque : ");
		System.out.println(" id : " + bank.getId());
		System.out.println(" name : " + bank.getName());
		return bank;
	}

}
