package com.boot.first.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.boot.first.model.Customer;
import com.boot.first.model.InputRequest;
import com.boot.first.service.CustomerService;

@RestController
@RequestMapping(path = "/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping(path = "/saveOne")
	public String saveCustomer(@RequestBody Customer customer)
	{
		customerService.saveCustomer(customer);
		return "Customer added successfully";
	}
	
	
	@PostMapping(path = "/saveAll")
	public String saveCustomers(@RequestBody InputRequest customer)
	{
		customerService.saveCustomers(customer.getCustomer());
		return "Customer added successfully";
	}
	
	
	/*
	 * public List<Customer> saveCustomers(@RequestBody ) { return null; }
	 */
	
	@GetMapping(path = "/getAll")
	public List<Customer> getCustomers()
	{
		return customerService.getCustomers();
	}
	
	@GetMapping(path = "/getOne")
	public Customer getCustomer(@RequestParam int id)
	{
		return customerService.getCustomer(id);
	}
	
	
	
	
	
	@DeleteMapping(path = "/remove")
	public List<Customer> removeCustomer(@RequestParam int id)
	{
		return customerService.removeCustomer(id);
	}
	
	
	
	@PutMapping(path = "/update")
	public Customer updateCustomer(@RequestBody Customer customer)
	{
		return customerService.updateCustomer(customer);
	}

}
