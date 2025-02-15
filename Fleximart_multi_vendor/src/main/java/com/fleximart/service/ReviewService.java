package com.fleximart.service;

import com.fleximart.exception.ReviewNotFoundException;
import com.fleximart.model.Product;
import com.fleximart.model.Review;
import com.fleximart.model.User;
import com.fleximart.request.CreateReviewRequest;
import javax.naming.AuthenticationException;
import java.util.List;

public interface ReviewService {
    Review createReview(CreateReviewRequest req,
                        User user,
                        Product product);
    List<Review> getReviewsByProductId(Long productId);
    Review updateReview(Long reviewId,
                        String reviewText,
                        double rating,
                        Long userId) throws ReviewNotFoundException, AuthenticationException;
    void deleteReview(Long reviewId, Long userId) throws ReviewNotFoundException, AuthenticationException;

}
