package com.fleximart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fleximart.model.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, Long> {
	Coupon findByCode(String couponCode);

}
