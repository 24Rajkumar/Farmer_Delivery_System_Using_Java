package com.example.FarmarDeliverySystem.repository;
import com.example.FarmarDeliverySystem.entity.ProductsAvailable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsAvailableRepo extends JpaRepository<ProductsAvailable,Long> {
}
