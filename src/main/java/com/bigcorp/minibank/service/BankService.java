package com.bigcorp.minibank.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bigcorp.minibank.dao.BankDao;
import com.bigcorp.minibank.model.Bank;


@Service
public class BankService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(BankService.class);
	
	@Autowired
	private BankDao bankDao;

	public Optional<Bank> getBank(Long id) {
		System.out.println("Appel de BankService.getBank() avec l'id : " + id);
		return bankDao.findById(id);
	}

	@Transactional
	public void deleteBank(Long id) {
		System.out.println("Appel de BankService.deleteBank() avec l'id : " + id);
		bankDao.deleteById(id);
	}

	@Transactional
	public Bank saveBank(Bank bank) {
		LOGGER.info("Sauvegarde de la banque");
		System.out.println("Je sauvegarde la banque : ");
		System.out.println(" id : " + bank.getId());
		System.out.println(" name : " + bank.getName());
		return bankDao.save(bank);
	}
	
	public List<Bank> findByName(String name){
		return bankDao.findByNameContainingIgnoringCase(name);
	}

}
