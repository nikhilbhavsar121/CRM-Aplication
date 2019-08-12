package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.dao.CustomerDAO;
import com.crm.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerList 
{
	@Autowired
	private CustomerDAO customerDAO;
	
	@RequestMapping("/list")
	public String getcustomerlist(Model model)
	{
		System.out.println("inside controller list");
		List<Customer> customer=getCustomerDAO().getcustomer();
		
		model.addAttribute("customer",customer);
		
		
		return "customerlist";
		
	}

	public CustomerDAO getCustomerDAO() {
		return customerDAO;
	}

	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	
}
