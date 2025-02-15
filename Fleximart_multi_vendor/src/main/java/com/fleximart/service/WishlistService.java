package com.fleximart.service;

import com.fleximart.exception.WishlistNotFoundException;
import com.fleximart.model.Product;
import com.fleximart.model.User;
import com.fleximart.model.Wishlist;
import java.util.Optional;

public interface WishlistService {
    Wishlist createWishlist(User user);
    Wishlist getWishlistByUserId(User user);
    Wishlist addProductToWishlist(User user, Product product) throws WishlistNotFoundException;

}

