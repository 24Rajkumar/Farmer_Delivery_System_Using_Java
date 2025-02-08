package com.example.FarmarDeliverySystem.controller;
import com.example.FarmarDeliverySystem.entity.Crops;
import com.example.FarmarDeliverySystem.entity.Login;
import com.example.FarmarDeliverySystem.repository.LoginRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LoginController {
    @Autowired
    LoginRepo loginRepo;
    @PostMapping("/api/Login")
    public ResponseEntity<Login>method(@RequestBody Login login){
        return new ResponseEntity<>(loginRepo.save(login), HttpStatus.CREATED);
    }
    @GetMapping("/api/Login/{id}")
    public ResponseEntity<Login>method(@PathVariable Long id){
        Optional<Login>login=loginRepo.findById(id);
        if (login.isPresent()){
            return new ResponseEntity<>(login.get(),HttpStatus.OK);
        } else {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PutMapping("/api/Login/{id}")
    public ResponseEntity<Login>method(@PathVariable Long id,@RequestBody Login login){
        Optional<Login>login1=loginRepo.findById(id);
        if(login1.isPresent()){
            login1.get().setCustomer(login.getCustomer());
            login1.get().setFarmer(login.getFarmer());
            return new ResponseEntity<>(loginRepo.save(login1.get()),HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    public ResponseEntity<Void>method1(@PathVariable Long id){
        Optional<Login>login=loginRepo.findById(id);
        if (login.isPresent()){
            loginRepo.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);

        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }
    @GetMapping("/api/Login")
    public ResponseEntity<List<Login>>method(){
        return new ResponseEntity<>(loginRepo.findAll(),HttpStatus.OK);
    }


}

