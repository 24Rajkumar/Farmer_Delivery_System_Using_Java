package com.example.FarmarDeliverySystem.controller;
import com.example.FarmarDeliverySystem.entity.Cart;
import com.example.FarmarDeliverySystem.repository.CartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CartController {
    @Autowired
    CartRepo cartRepo;
    @PostMapping("/api/Cart")
    public ResponseEntity<Cart>method(@RequestBody Cart cart){
        return new ResponseEntity<>(cartRepo.save(cart), HttpStatus.CREATED);
    }
    @GetMapping("/api/Cart/{id}")
    public ResponseEntity<Cart>method(@PathVariable Long id){
        Optional<Cart> cart=(cartRepo.findById(id));
        if ((cart.isPresent())){
            return new ResponseEntity<>(cart.get(),HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PutMapping("/api/Cart/{id}")
    public ResponseEntity<Cart>method(@PathVariable Long id ,@RequestBody Cart cart){
        Optional<Cart>cart1=cartRepo.findById(id);
        if (cart1.isPresent()){
            cart1.get().setCart_items(cart.getCart_items());
            cart1.get().setConfirm_order(cart.getConfirm_order());
            return new ResponseEntity<>(cartRepo.save(cart1.get()),HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/api/Cart/{id}")
    public ResponseEntity<Void>method1(@PathVariable Long id){
        Optional<Cart>cart=cartRepo.findById(id);
        if(cart.isPresent()){
            cartRepo.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/api/Cart")

    public ResponseEntity<List<Cart>>method(){
        return new ResponseEntity<>(cartRepo.findAll(),HttpStatus.OK);
    }



}
