package com.controller.model;

public class Employee {

	private String name;
	private String pass;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Employee(String name, String pass) {
		super();
		this.name = name;
		this.pass = pass;
	}
	
	
}
