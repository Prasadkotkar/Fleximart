package com.fleximart.service;


import com.fleximart.exception.ProductException;
import com.fleximart.model.Cart;
import com.fleximart.model.CartItem;
import com.fleximart.model.Product;
import com.fleximart.model.User;

public interface CartService {
	
	public CartItem addCartItem(User user,
								Product product,
								String size,
								int quantity) throws ProductException;
	public Cart findUserCart(User user);

}
