package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CustomerDetails;
import com.example.demo.repository.CustomerRepository;

@Service
public class HDFCService {
	@Autowired
	public CustomerRepository repository;

	public ResponseEntity<CustomerDetails> getCustomerDetailsByAccountIdAndName(int accountID, String userName) {
		// TODO Auto-generated method stub

		CustomerDetails customer= repository.findByAccountIDAndUserName(accountID, userName);
	return new ResponseEntity<CustomerDetails>(customer,HttpStatus.OK);
	}

	public String addCustomer(CustomerDetails customer) {
		// TODO Auto-generated method stub
		repository.save(customer);
		return "Successfully Inserted";
	}

}
