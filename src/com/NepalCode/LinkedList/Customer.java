package com.NepalCode.LinkedList;

public class Customer {
	private String cName;
	private String username;
	private String password;
	
	
	// creating defualt constructor
	public Customer() {
		
	}
	
	// creating parameter constructor
	public Customer(String cName, String username, String password) {
		this.cName = cName;
		this.username = username;
		this.password = password;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Customer [cName=" + cName + ", username=" + username + ", password=" + password + "]";
	}
	
	
	
	
	

}
