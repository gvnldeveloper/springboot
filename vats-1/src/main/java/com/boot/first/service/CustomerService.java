package com.boot.first.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.boot.first.model.Customer;

@Service
public class CustomerService {
	private static final Logger logger = LoggerFactory.getLogger(CustomerService.class);

	/*
	 * Get Single Customer Get All Customers Delete Customer Save Customer Edit
	 * Customer
	 */

	private List<Customer> customer = new ArrayList<Customer>();

	public String saveCustomer(Customer input) {
		logger.info("Customer data in saveCustomer { } ", input);
		customer.add(input);
		return "Customer Added Successfully";
	}

	public List<Customer> getCustomers() {
		return customer;
	}

	public String saveCustomers(List<Customer> customers) {
		boolean res = customer.addAll(customers);
		if (res)
			return "Customers added successfully";
		else
			return "Error while adding Customers";
	}

	public Customer getCustomer(int id) {

		return customer.get(id);
	}

	public List<Customer> removeCustomer(int id) {
		Predicate<Customer> isQualified = custom -> custom.getId() == id;
		customer.removeIf(isQualified);
		return customer;
	}

	public Customer updateCustomer(Customer input) {
		Predicate<Customer> isQualified = custom -> custom.getId() == input.getId();
		Customer custo = customer.stream().filter(isQualified).findAny().orElse(null);
		custo.setAchternaam(input.getAchternaam());
		custo.setAge(input.getAge());
		custo.setRoepnaam(input.getRoepnaam());
		custo.setVoorletter(input.getVoorletter());
		custo.setVoornaam(input.getVoornaam());
		return custo;
	}

}
