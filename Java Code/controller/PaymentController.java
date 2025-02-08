package com.example.FarmarDeliverySystem.controller;
import ch.qos.logback.core.joran.conditional.IfAction;
import com.example.FarmarDeliverySystem.entity.Cart;
import com.example.FarmarDeliverySystem.entity.Crops;
import com.example.FarmarDeliverySystem.entity.Payment;
import com.example.FarmarDeliverySystem.repository.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PaymentController {
    @Autowired
    PaymentRepo paymentRepo;
    @PostMapping("/api/Payment")
    public ResponseEntity<Payment>method(@RequestBody Payment payment){
        return new ResponseEntity<>(paymentRepo.save(payment), HttpStatus.CREATED);
    }
    @GetMapping("/api/Payment/{id}")
    public ResponseEntity<Payment>method(@PathVariable Long id){
        Optional<Payment>payment=paymentRepo.findById(id);
        if (payment.isPresent()){
            return new ResponseEntity<>(payment.get(),HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PutMapping("/api/Payment/{id}")
    public ResponseEntity<Payment>method(@PathVariable Long id,@RequestBody Payment payment){
        Optional<Payment>payment1=paymentRepo.findById(id);
        if(payment1.isPresent()){
            payment1.get().setPayment(payment.getPayment());
            payment1.get().setConfirm_payment(payment.getConfirm_payment());
            payment1.get().setCard(payment.getCard());
            payment1.get().setCOD(payment.getCOD());
            payment1.get().setNet_banking(payment.getNet_banking());
            payment1.get().setOrder_confirmed(payment.getOrder_confirmed());
            payment1.get().setUpi(payment.getUpi());
            return new ResponseEntity<>(paymentRepo.save(payment1.get()),HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/api/PaymentController/{id}")
    public ResponseEntity<Void>method1(@PathVariable Long id){
        Optional<Payment>payment=paymentRepo.findById(id);
        if(payment.isPresent()){
            paymentRepo.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/api/Payment")
    public ResponseEntity<List<Payment>>method(){
        return new ResponseEntity<>(paymentRepo.findAll(),HttpStatus.OK);
    }




}
