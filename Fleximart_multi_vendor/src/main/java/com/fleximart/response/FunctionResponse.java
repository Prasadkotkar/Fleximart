package com.fleximart.response;

import com.fleximart.dto.OrderHistory;
import com.fleximart.model.Cart;
import com.fleximart.model.Product;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FunctionResponse {
    private String functionName;
    private Cart userCart;
    private OrderHistory orderHistory;
    private Product product;
}
