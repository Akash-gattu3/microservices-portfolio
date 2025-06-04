package com.example.user_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.user_service.model.OrderDTO;
import com.example.user_service.service.UserService;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
	
	@Autowired
	RestTemplate restTemplate;
	@Autowired
	UserService service;
	
	@GetMapping("/{id}")
	public String getUser(@PathVariable String id) {
		return service.getUser(id);
	}
	
	@GetMapping("/user-order/{id}")
	public OrderDTO getOrderByUser(@PathVariable String id) {
		return service.getUserByOrderId(id);
	}

}
