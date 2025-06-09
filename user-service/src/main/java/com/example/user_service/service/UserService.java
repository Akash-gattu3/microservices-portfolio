package com.example.user_service.service;

import portfolio.OrderDTO;

public interface UserService {
	
	 String getUser(String id);
	 
	 OrderDTO getUserByOrderId(String id);

}
