package com.fleximart.service;

import com.fleximart.model.VerificationCode;

public interface VerificationService {
    VerificationCode createVerificationCode(String otp, String email);
}
