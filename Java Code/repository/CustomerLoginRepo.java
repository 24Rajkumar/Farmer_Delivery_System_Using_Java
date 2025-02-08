package com.example.FarmarDeliverySystem.repository;

import com.example.FarmarDeliverySystem.entity.CustomerLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerLoginRepo extends JpaRepository<CustomerLogin,Long> {
}
