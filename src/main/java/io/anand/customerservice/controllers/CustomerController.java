package io.anand.customerservice.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.anand.customerservice.model.Customer;
import io.anand.customerservice.services.CustomerService;

@RestController
@RequestMapping(value = "/api")
public class CustomerController {

	private CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;

	}

	@GetMapping(value = "/")
	public ResponseEntity<List<Customer>> getCustomers() {
		List<Customer> customers = customerService.getCustomers();
		return ResponseEntity.status(200).body(customers);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable Integer id) {
		Customer customer = customerService.getCustomerById(id);
		return ResponseEntity.status(200).body(customer);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> deleteCustomerById(@PathVariable Integer id) {
		customerService.deleteCustomerById(id);
		return ResponseEntity.status(201).build();
	}

	@PostMapping(value = "/")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer newCustomer) {
		newCustomer = customerService.addCustomer(newCustomer);
		return ResponseEntity.status(200).body(newCustomer);
	}

	@PostMapping(value = "/update")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer newCustomer) {
		newCustomer = customerService.addCustomer(newCustomer);
		return ResponseEntity.status(200).body(newCustomer);
	}

	@PutMapping(value = "/")
	public ResponseEntity<Customer> updateCustomerbyput(@RequestBody Customer newCustomer) {
		newCustomer = customerService.addCustomer(newCustomer);
		return ResponseEntity.status(200).body(newCustomer);
	}

}
