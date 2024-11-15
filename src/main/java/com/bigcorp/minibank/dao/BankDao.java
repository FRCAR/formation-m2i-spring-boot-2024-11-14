package com.bigcorp.minibank.dao;

import org.springframework.data.repository.CrudRepository;

import com.bigcorp.minibank.model.Bank;

public interface BankDao extends CrudRepository<Bank, Long>{

}
