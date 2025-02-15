package com.fleximart.service;


import com.fleximart.exception.SellerException;
import com.fleximart.exception.UserException;
import com.fleximart.request.LoginRequest;
import com.fleximart.request.SignupRequest;
import com.fleximart.response.AuthResponse;
import jakarta.mail.MessagingException;

public interface AuthService {
    void sentLoginOtp(String email) throws UserException, MessagingException;
    String createUser(SignupRequest req) throws SellerException;
    AuthResponse signin(LoginRequest req) throws SellerException;

}
