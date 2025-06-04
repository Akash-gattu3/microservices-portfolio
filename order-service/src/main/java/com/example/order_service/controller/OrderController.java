package com.example.order_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.order_service.model.OrderDTO;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {
	

	
	@GetMapping("/{id}")
	public OrderDTO getOrder(@PathVariable String id) {
		OrderDTO dto = new OrderDTO();
		dto.setOrderId(id);
		dto.setOrderPlaceBy("AKASH");
		return dto;
	}

}
