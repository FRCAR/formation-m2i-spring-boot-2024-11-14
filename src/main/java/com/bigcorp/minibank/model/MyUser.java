package com.bigcorp.minibank.model;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MyUser implements UserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long id;

	private String name;

	private String monMotDePasse;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMonMotDePasse() {
		return monMotDePasse;
	}

	public void setMonMotDePasse(String monMotDePasse) {
		this.monMotDePasse = monMotDePasse;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}

	@Override
	public String getPassword() {
		return this.monMotDePasse;
	}

	@Override
	public String getUsername() {
		return this.name;
	}

}
