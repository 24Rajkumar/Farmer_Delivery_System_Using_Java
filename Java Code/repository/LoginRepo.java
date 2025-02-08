package com.example.FarmarDeliverySystem.repository;
import com.example.FarmarDeliverySystem.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepo extends JpaRepository<Login,Long> {
}
