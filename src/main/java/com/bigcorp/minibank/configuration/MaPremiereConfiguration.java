package com.bigcorp.minibank.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.bigcorp.minibank.service.MonPremierService;
import com.bigcorp.minibank.service.UserService;

@Configuration
public class MaPremiereConfiguration {
	
	@Bean
	public MonPremierService monPremierService() {
		return new MonPremierService();
	}
	
	@Bean
	public ConfigurationSecurite configurationSecurite(UserService userService) {
		ConfigurationSecurite confSecu = new ConfigurationSecurite();
		confSecu.setLogin("jeanjean");
		confSecu.setPassword("secret");
		System.out.println("Salut de MaPremiereConfiguration.configurationSecurite");
		userService.sayHello();
		return confSecu;
	}

}
