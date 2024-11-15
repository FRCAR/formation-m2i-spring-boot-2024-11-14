package com.bigcorp.minibank.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http
			.authorizeHttpRequests(requests -> requests
				.requestMatchers("/", "/login", "/html/salut").permitAll()
				.requestMatchers("/rest/banks/**").permitAll()
				.anyRequest().authenticated()
			)
			.csrf(csrfCustomizer -> csrfCustomizer.ignoringRequestMatchers("/rest-ws/**"))
			.formLogin(form -> form
				.loginPage("/login")
				.permitAll()
			)
			.logout((logout) ->
				logout
					.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
					.logoutSuccessUrl("/login?logout=true")
					.permitAll()
			);
		return http.build();
	}
	
}
