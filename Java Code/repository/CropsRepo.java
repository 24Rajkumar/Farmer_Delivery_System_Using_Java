package com.example.FarmarDeliverySystem.repository;
import com.example.FarmarDeliverySystem.entity.Crops;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CropsRepo extends JpaRepository<Crops,Long> {
}
