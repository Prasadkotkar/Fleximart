package com.fleximart.service;

import com.fleximart.exception.OrderException;
import com.fleximart.model.Address;
import com.fleximart.model.Cart;
import com.fleximart.model.Order;
import com.fleximart.model.User;
import com.fleximart.model.enums.OrderStatus;

import java.util.List;
import java.util.Set;

public interface OrderService {
	
	public Set<Order> createOrder(User user, Address shippingAddress, Cart cart);
	public Order findOrderById(Long orderId) throws OrderException;
	public List<Order> usersOrderHistory(Long userId);
	public List<Order>getShopsOrders(Long sellerId);
	public Order updateOrderStatus(Long orderId,
								   OrderStatus orderStatus)
			throws OrderException;
	public void deleteOrder(Long orderId) throws OrderException;
	Order cancelOrder(Long orderId,User user) throws OrderException;
	
}
