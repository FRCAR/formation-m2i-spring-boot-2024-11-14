package com.bigcorp.minibank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.bigcorp.minibank.service.AccountService;
import com.bigcorp.minibank.service.MonPremierService;

@SpringBootApplication
public class MiniBankApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(MiniBankApplication.class, args);
		MonPremierService beanMonPremierService = applicationContext.getBean(MonPremierService.class);
		AccountService accountService = applicationContext.getBean(AccountService.class);
		
		System.out.println("AccountService est bien lié à UserService ? " + (accountService.getUserService() != null));
		System.out.println("AccountService.maxAccountAge : " + accountService.getMaxAccountAge());
		
	}

}
