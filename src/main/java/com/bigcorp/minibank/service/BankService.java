package com.bigcorp.minibank.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bigcorp.minibank.dao.BankDao;
import com.bigcorp.minibank.model.Bank;

@Service
public class BankService {
	
	@Autowired
	private BankDao bankDao;

	public Optional<Bank> getBank(Long id) {
		System.out.println("Appel de BankService.getBank() avec l'id : " + id);
		return bankDao.findById(id);
	}

	public void deleteBank(Long id) {
		System.out.println("Appel de BankService.deleteBank() avec l'id : " + id);
		bankDao.deleteById(id);
	}

	public Bank saveBank(Bank bank) {
		System.out.println("Je sauvegarde la banque : ");
		System.out.println(" id : " + bank.getId());
		System.out.println(" name : " + bank.getName());
		return bankDao.save(bank);
	}

}
