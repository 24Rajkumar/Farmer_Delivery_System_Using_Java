package com.example.FarmarDeliverySystem.repository;
import com.example.FarmarDeliverySystem.entity.FarmerLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FarmerLoginRepo extends JpaRepository<FarmerLogin , Long> {
}

