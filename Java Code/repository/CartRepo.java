package com.example.FarmarDeliverySystem.repository;

import com.example.FarmarDeliverySystem.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepo extends JpaRepository<Cart,Long> {
}
