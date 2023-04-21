package com.game.gallery.service;

import java.util.List;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.game.gallery.dao.CustomerDao;
import com.game.gallery.bean.Customer;

import jakarta.transaction.Transactional;


@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerDao customerDao;

	
	@Override
	public List<Customer> getCustomers() {
		return customerDao.findAll();
	}

	@Override
	public Customer getCustomer(int customerId) {
		Customer cust =  customerDao.findById(customerId).orElse(null);
		Hibernate.initialize(cust);
		return cust;
	}

	@Override
	public Customer addCustomer(Customer customer) { 
		return customerDao.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		return customerDao.save(customer);
	}

	@Override
	public ResponseEntity<HttpStatus> deleteCustomer(int customerId) {
		customerDao.deleteById(customerId);
		return  new ResponseEntity<>(HttpStatus.OK);
	}	
}
