package com.example.FarmarDeliverySystem.repository;

import com.example.FarmarDeliverySystem.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo extends JpaRepository<Payment,Long> {
}
