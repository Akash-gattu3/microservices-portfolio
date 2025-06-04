package com.example.user_service.model;

public class OrderDTO {

	private String orderId;
	
	private String orderPlaceBy;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderPlaceBy() {
		return orderPlaceBy;
	}

	public void setOrderPlaceBy(String orderPlaceBy) {
		this.orderPlaceBy = orderPlaceBy;
	}
	
	
}
