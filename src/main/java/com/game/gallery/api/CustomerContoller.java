package com.game.gallery.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.game.gallery.bean.Customer;
import com.game.gallery.service.CustomerService;

@RestController
@CrossOrigin
@RequestMapping("/gallery")
public class CustomerContoller {
	
	@Autowired
	private CustomerService customerService;

	@GetMapping("/customer")
	public List<Customer> getCustomers(){
		return customerService.getCustomers();
	}
	
	@GetMapping("/customer/{customerId}")
	public Customer getCustomer(@PathVariable int customerId) {
		return customerService.getCustomer(customerId);
	}
	
	@PostMapping("/customer")
	public Customer addCustomer(@RequestBody Customer customer) {
		return customerService.addCustomer(customer);
	}
	
	@PutMapping("/customer")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return customerService.addCustomer(customer);
	}
	
	@DeleteMapping("/customer/{customerId}")
	public ResponseEntity<HttpStatus> deleteCustomer(@PathVariable int customerId){
		return customerService.deleteCustomer(customerId);
	}
	
}
