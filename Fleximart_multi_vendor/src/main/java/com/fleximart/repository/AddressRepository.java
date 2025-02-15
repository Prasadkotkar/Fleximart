package com.fleximart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fleximart.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long>{

}
