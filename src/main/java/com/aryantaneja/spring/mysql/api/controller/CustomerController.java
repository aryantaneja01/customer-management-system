package com.aryantaneja.spring.mysql.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aryantaneja.spring.mysql.api.dao.CustomerDao;
import com.aryantaneja.spring.mysql.api.model.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerDao dao;
	@PostMapping("/addCustomers")
	public String AddCustomer(@RequestBody List<Customer> customers) {
		dao.saveAll(customers);
		return " Customers Added : " + customers.size();
	}
	@GetMapping("/getCustomers")
	public List<Customer> getCustomers(){
		return (List<Customer>) dao.findAll();
	}
}
