package com.example.FarmarDeliverySystem.controller;
import com.example.FarmarDeliverySystem.entity.Cart;
import com.example.FarmarDeliverySystem.entity.Crops;
import com.example.FarmarDeliverySystem.entity.ProductsAvailable;
import com.example.FarmarDeliverySystem.repository.ProductsAvailableRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductsAvailableController {
    @Autowired
    ProductsAvailableRepo productsAvailableRepo;
    @PostMapping("/api/ProductsAvailable")
    public ResponseEntity<ProductsAvailable>method(@RequestBody ProductsAvailable productsAvailable){
        return new ResponseEntity<>(productsAvailableRepo.save(productsAvailable), HttpStatus.CREATED);
    }
    @GetMapping("/api/ProductsAvailable/{id}")
    public ResponseEntity<ProductsAvailable>method(@PathVariable Long id){
        Optional<ProductsAvailable>productsAvailable=productsAvailableRepo.findById(id);
        if(productsAvailable.isPresent()){
            return new ResponseEntity<>(productsAvailable.get(),HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PutMapping("/api/ProductsAvailable/{id}")

    public ResponseEntity<ProductsAvailable>method(@PathVariable Long id,@RequestBody ProductsAvailable productsAvailable){
        Optional<ProductsAvailable>productsAvailable1=productsAvailableRepo.findById(id);
        if(productsAvailable1.isPresent()){
            productsAvailable1.get().setImage_of_product(productsAvailable.getImage_of_product());
            productsAvailable1.get().setProduct_name(productsAvailable.getProduct_name());
            productsAvailable1.get().setRating(productsAvailable.getRating());
            productsAvailable1.get().setAdd_to_cart(productsAvailable.getAdd_to_cart());
            productsAvailable1.get().setPrice_per_kg(productsAvailable.getPrice_per_kg());

            return new ResponseEntity<>(productsAvailableRepo.save(productsAvailable1.get()),HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/api/ProductsAvailable/{id}")
    public ResponseEntity<Void>method1(@PathVariable Long id){
        Optional<ProductsAvailable>productsAvailable=productsAvailableRepo.findById(id);
        if(productsAvailable.isPresent()){
            productsAvailableRepo.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/api/ProductsAvailable")
    public ResponseEntity<List<ProductsAvailable>>method(){
        return new ResponseEntity<>(productsAvailableRepo.findAll(),HttpStatus.OK);
    }




}
