package io.anand.customerservice.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import io.anand.customerservice.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
