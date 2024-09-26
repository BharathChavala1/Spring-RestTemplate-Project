package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entity.CustomerDetails;
import com.example.demo.service.HDFCService;
import com.google.common.net.HttpHeaders;

@Controller
public class HDFCController {

	@Autowired
	public HDFCService service;

	// Get Customer Details
	/*@ResponseBody
	@RequestMapping(path = "/getCustomerDetailsByIdAndUserName/", method = RequestMethod.GET)
	public ResponseEntity<CustomerDetails> getCustomerDetails(@RequestHeader(name="token", required = false)String tokenkey,
			@RequestParam(name = "id") int accountID,
			@RequestParam(name = "userName") String userName) {
		return service.getCustomerDetailsByAccountIdAndName(accountID, userName);
	}

	@ResponseBody
	@RequestMapping(path = "/addCustomer", method = RequestMethod.POST)
	public String addCustomer(@RequestBody CustomerDetails customer) {

		return service.addCustomer(customer);
	}
*/
	
	
	
	
	
	@ResponseBody
	@RequestMapping(path = "/getCustomerDetailsById/{id}/AndUserName/{userName}", method = RequestMethod.GET)
	public ResponseEntity<CustomerDetails> getCustomerDetailsByIDAndUserName(@RequestHeader(name="token", required = false)String tokenkey,
			@PathVariable(name = "id") int accountID,
			@PathVariable(name = "userName") String userName) {
		return service.getCustomerDetailsByAccountIdAndName(accountID, userName);
	}
	
}
