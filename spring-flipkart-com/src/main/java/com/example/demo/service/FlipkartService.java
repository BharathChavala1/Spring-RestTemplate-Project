package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.FlipkartPayment;
import com.example.demo.repository.FlipkartRepository;

@Service
public class FlipkartService {
	@Autowired
	public FlipkartRepository repository;

	public String getLoginInformation(String userName, String password) {
		FlipkartPayment customerDetails = repository.findByUserNameAndPassword(userName,password);
		if (customerDetails != null) {
return "Details you provided are correct Information";
		}
		return "Invalid Login Details";
	}

}
