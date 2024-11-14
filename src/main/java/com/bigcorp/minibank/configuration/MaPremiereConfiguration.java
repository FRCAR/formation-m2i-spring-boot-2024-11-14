package com.bigcorp.minibank.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bigcorp.minibank.service.MonPremierService;

@Configuration
public class MaPremiereConfiguration {
	
	@Bean
	public MonPremierService monPremierService() {
		return new MonPremierService();
	}

}
