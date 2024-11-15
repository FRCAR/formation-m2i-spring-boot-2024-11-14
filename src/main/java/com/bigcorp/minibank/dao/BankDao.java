package com.bigcorp.minibank.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.bigcorp.minibank.model.Bank;

public interface BankDao extends CrudRepository<Bank, Long>{
	
	List<Bank> findByName(String name);
	
	List<Bank> findByNameIgnoringCase(String name);
	
	List<Bank> findByNameOrId(String name, Long id);
	
	List<Bank> findByNameContainingIgnoringCase(String name);
	
	@Query("select b from Bank b where b.name = :name")
	List<Bank> maMethode(@Param("name") String name);

}
