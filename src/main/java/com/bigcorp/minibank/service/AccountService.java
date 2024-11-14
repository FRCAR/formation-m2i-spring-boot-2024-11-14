package com.bigcorp.minibank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

	@Value("${max.account.age}")
	private int maxAccountAge;

	@Autowired
	private UserService userService;

	public int getMaxAccountAge() {
		return maxAccountAge;
	}

	public void setMaxAccountAge(int maxAccountAge) {
		this.maxAccountAge = maxAccountAge;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public AccountService() {
		System.out.println("Je suis AccountService, j'ai été instancié");
	}

}
