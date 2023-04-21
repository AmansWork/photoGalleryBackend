package com.game.gallery.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.game.gallery.bean.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();
	public Customer getCustomer(int customerId);
	public Customer addCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public ResponseEntity<HttpStatus> deleteCustomer(int customerId);
	
}
