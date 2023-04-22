package io.anand.customerservice.services;

import java.util.List;

import org.springframework.stereotype.Service;

import io.anand.customerservice.jpa.CustomerRepository;
import io.anand.customerservice.model.Customer;

@Service
public class CustomerService {

	private CustomerRepository customerRepository;

	public CustomerService(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;

	}

	public List<Customer> getCustomers() {
		List<Customer> customers = customerRepository.findAll();
		return customers;
	}

	public Customer getCustomerById(int id) {
		Customer customer = customerRepository.findById(id).get();
		return customer;
	}

	public void deleteCustomerById(int id) {
		customerRepository.deleteById(id);
	}

	public Customer addCustomer(Customer customer) {
		customer = customerRepository.save(customer);
		return customer;
	}

	public Customer updateCustomerById(Customer customer) {
		Customer customerFromDb = customerRepository.findById(customer.getId()).get();
		if (customerFromDb != null) {
			customerFromDb.setAge(customer.getAge());
			customerFromDb.setFirstName(customer.getFirstName());
			customerFromDb.setLastName(customer.getLastName());
		}
		return customer;
	}
}
