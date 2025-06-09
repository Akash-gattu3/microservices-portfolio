package com.example.user_service.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import portfolio.OrderDTO;



@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private RestTemplate restTemplate;

	
	@Override
	public String getUser(String id) {
		return "User With ID: "+id;
	}

	@Override
	public OrderDTO getUserByOrderId(String orderId) {
		String url = "http://ORDER-SERVICE/api/v1/orders/"+orderId;
		return restTemplate.getForObject(url, OrderDTO.class);
		
		
	}
	
	

}
