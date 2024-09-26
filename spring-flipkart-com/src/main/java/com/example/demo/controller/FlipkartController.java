package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.FlipkartPayment;
import com.example.demo.service.FlipkartService;

@Controller
public class FlipkartController {

    @Autowired
    public FlipkartService service;


    @ResponseBody
    @RequestMapping(path = "/login/userDetailsByUserName/{userName}/AndPassword/{password}", method =
            RequestMethod.GET)
    public String loginUserDetailsByUserNameAndPassword(@PathVariable String
                                                                userName, @PathVariable String password) {
        String info =
                service.getLoginInformation(userName, password);
        return info;
    }


    @ResponseBody
    @RequestMapping(path = "/getCustomerIsvalidOrNot", method = RequestMethod.POST)
    public ResponseEntity<?> getCustomerValidORNot(
            @RequestHeader(name = "token", required = false) String tokenValue,
            @RequestBody FlipkartPayment paymentDetails) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8085/HDFC/getCustomerDetailsById/{id}/AndUserName/{userName}";
        org.springframework.http.HttpHeaders headers = new org.springframework.http.HttpHeaders();
        headers.add("token", "Bharath@3399");
        HttpEntity<?> entity = new HttpEntity<>(paymentDetails, headers);
        Map<String, Object> pathVariable = new HashMap<>();
        pathVariable.put("id", paymentDetails.getAccountID());
        pathVariable.put("userName", paymentDetails.getUserName());
        ResponseEntity<FlipkartPayment> customer = restTemplate.exchange(
                url,
                HttpMethod.GET,
                entity,
                FlipkartPayment.class,
                pathVariable);
        FlipkartPayment customerDetails = customer.getBody();
        return new ResponseEntity<>(customerDetails, HttpStatus.OK);
    }

}
