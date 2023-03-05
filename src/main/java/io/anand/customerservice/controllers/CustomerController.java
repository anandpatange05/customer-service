package io.anand.customerservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.anand.customerservice.jpa.CustomerRepository;
import io.anand.customerservice.model.Customer;

@RestController
@RequestMapping(value = "/api")
public class CustomerController {
	@Autowired
	private CustomerRepository customerRepository;

	@GetMapping(value = "/new-customer")
	public Customer getCustomer() {
		Customer newCustomer = customerRepository.;
		return newCustomer;
	}
}
