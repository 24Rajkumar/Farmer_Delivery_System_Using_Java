package com.example.FarmarDeliverySystem.controller;
import com.example.FarmarDeliverySystem.entity.Crops;
import com.example.FarmarDeliverySystem.repository.CropsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CropsController {
    @Autowired
    CropsRepo cropsRepo;
    @PostMapping("/api/Crops")
        public ResponseEntity<Crops>method(@RequestBody Crops crops){
            return new ResponseEntity<>(cropsRepo.save(crops), HttpStatus.CREATED);
        }
        @GetMapping("/api/Crops/{id}")
        public ResponseEntity<Crops>method1(@PathVariable Long id){
            Optional<Crops>crops=cropsRepo.findById(id);
            if (crops.isPresent()){
                return new ResponseEntity<>(crops.get(),HttpStatus.OK);
            }else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
    }
    @PutMapping("/api/Crops/{id}")
    public ResponseEntity<Crops>method2(@PathVariable Long id,@RequestBody Crops crops){
        Optional<Crops>crops1=cropsRepo.findById(id);
        if(crops1.isPresent()){
            crops1.get().setName_of_crop(crops.getName_of_crop());
            crops1.get().setQuantity(crops.getQuantity());
            crops1.get().setVideo(crops.getVideo());
            crops1.get().setPesticides_used(crops.getPesticides_used());
            crops1.get().setPrice_per_kg(crops.getPrice_per_kg());
            return new ResponseEntity<>(cropsRepo.save(crops1.get()),HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/api/Crops/{id}")
    public ResponseEntity<Void>method3(@PathVariable Long id){
        Optional<Crops>crops=cropsRepo.findById(id);
        if(crops.isPresent()){
            cropsRepo.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/api/Crops")
 public ResponseEntity<List<Crops>>method(){
        return new ResponseEntity<>(cropsRepo.findAll(),HttpStatus.OK);
 }


}
