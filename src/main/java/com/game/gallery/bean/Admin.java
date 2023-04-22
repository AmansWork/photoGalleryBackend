package com.game.gallery.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Admin {

	@Id
	private String userName;
	private String password;
	
	public Admin(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	
	public Admin() {		
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
