package com.fleximart.repository;

import com.fleximart.model.Cart;
import com.fleximart.model.CartItem;
import com.fleximart.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    CartItem findByCartAndProductAndSize(Cart cart, Product product, String size);

}
