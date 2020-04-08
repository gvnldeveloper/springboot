package com.boot.first.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.boot.first.exception.CustomException;
import com.boot.first.model.Customer;
import com.boot.first.model.InputRequest;
import com.boot.first.service.CustomerService;

@RestController
@RequestMapping(path = "/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

// We can directly mention end point like @PostMapping("/saveOne"), to make it more readable we can use path parameter.

	@PostMapping(path = "/saveOne")
	public ResponseEntity<String> saveCustomer(@RequestBody Customer customer) throws CustomException {
		if(customer.getAchternaam()!=null)
		{
			customerService.saveCustomer(customer);
			return new ResponseEntity<String>("Customer created successfully",HttpStatus.ACCEPTED);
		}
		else
		throw new CustomException(500 , "Invalid Request");
	}

	@PostMapping(path = "/saveAll")
	public String saveCustomers(@RequestBody InputRequest customer) {
		customerService.saveCustomers(customer.getCustomer());
		return "Customer added successfully";
	}

	@GetMapping(path = "/getAll")
	public List<Customer> getCustomers() {
		return customerService.getCustomers();
	}

	// with Requestparam we can provide default value as well like
	// @RequestParam(value = "name", defaultValue = "World").
	// In case there is no parameter coming in request it will not give error and we
	// can send client appropriate message.

	@GetMapping(path = "/getOne")
	public Customer getCustomer(@RequestParam int id) {
		return customerService.getCustomer(id);
	}

	@DeleteMapping(path = "/remove")
	public List<Customer> removeCustomer(@RequestParam int id) {
		return customerService.removeCustomer(id);
	}

	@PutMapping(path = "/update")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return customerService.updateCustomer(customer);
	}

}
