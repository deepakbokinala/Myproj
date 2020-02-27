package com.controller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.controller.dao.EmpDao;
import com.controller.model.Employee;

@Service
public class EmpService {

	@Autowired
	private EmpDao dao;
	
	public boolean storeEmp(Employee emp) {
		
		
		return true;
	}
}
