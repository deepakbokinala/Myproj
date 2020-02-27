package com.controller.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.controller.model.Employee;

@Repository
public class EmpDao {
	
	@Autowired
	private DataSource ds;
	
	
	public boolean storeEmp(Employee emp) {
		
		return true;
	}
}
