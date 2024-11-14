package com.bigcorp.minibank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.bigcorp.minibank.service.MonPremierService;

@SpringBootApplication
public class MiniBankApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(MiniBankApplication.class, args);
		MonPremierService beanMonPremierService = applicationContext.getBean(MonPremierService.class);
		System.out.println("Ce bean est null ? " + (beanMonPremierService == null));
	}

}
