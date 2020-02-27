package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.controller.model.Employee;
import com.controller.service.EmpService;

@Controller
public class HomeController {

	@Autowired
	private EmpService eServ;
	
	@RequestMapping(value="store",method=RequestMethod.POST)
	public String addProduct(Model m,@RequestParam("name") String name,@RequestParam("name") String pass ) {
		
		Employee e=new Employee();
		e.setName(name);
		e.setPass(pass);
		
		eServ.storeEmp(e);
		
		return "success";
	}
}
