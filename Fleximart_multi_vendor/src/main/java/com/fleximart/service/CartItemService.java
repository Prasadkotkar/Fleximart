package com.fleximart.service;


import com.fleximart.exception.CartItemException;
import com.fleximart.exception.UserException;
import com.fleximart.model.CartItem;

public interface CartItemService {
	public CartItem updateCartItem(Long userId, Long id, CartItem cartItem) throws CartItemException, UserException;
	public void removeCartItem(Long userId,Long cartItemId) throws CartItemException, UserException;
	public CartItem findCartItemById(Long cartItemId) throws CartItemException;
	
}
