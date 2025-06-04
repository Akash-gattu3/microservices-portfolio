package com.example.user_service.service;

import com.example.user_service.model.OrderDTO;

public interface UserService {
	
	 String getUser(String id);
	 
	 OrderDTO getUserByOrderId(String id);

}
