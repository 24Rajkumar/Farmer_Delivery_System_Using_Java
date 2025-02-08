package com.example.FarmarDeliverySystem.controller;
import com.example.FarmarDeliverySystem.entity.FarmerLogin;
import com.example.FarmarDeliverySystem.service.FarmerLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
@RequestMapping("/api")
@RestController
public class FarmerLoginController {

    @Autowired
    private FarmerLoginService FarmerLoginservice;

    @PostMapping("/addfarmers")
    public ResponseEntity<FarmerLogin> addfarmers(@RequestBody FarmerLogin Farmerlogin) {
        //  System.out.println("Received request with body: " + Farmerlogin);
        FarmerLogin savedfarmers = FarmerLoginservice.addfarmers(Farmerlogin);
        // System.out.println("Saved farmer: " + savedfarmers);
        return ResponseEntity.ok(savedfarmers);

    }

    @GetMapping("/getfarmers")
    public ResponseEntity<List<FarmerLogin>> getFarmers() {
        return new ResponseEntity<>(FarmerLoginservice.getFindAll(), HttpStatus.OK);
    }

    @GetMapping("/getfarmer/{id}")
    public ResponseEntity<FarmerLogin> getFarmers(@PathVariable Long id) {
        Optional<FarmerLogin> getFarmers = FarmerLoginservice.getFindById(id);
        if (getFarmers.isPresent()) {
            return new ResponseEntity<>(getFarmers.get(), (HttpStatus.OK));
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/updatefarmer/{id}")
    public ResponseEntity<FarmerLogin> updateFarmer(@PathVariable long id, @RequestBody FarmerLogin Farmerlogin) {
        Optional<FarmerLogin> putFarmer = FarmerLoginservice.getFindById(id);
        if (putFarmer.isPresent()) {
            putFarmer.get().setName(Farmerlogin.getName());
            putFarmer.get().setAddress(Farmerlogin.getAddress());
            putFarmer.get().setEmail(Farmerlogin.getEmail());
            putFarmer.get().setPassword(Farmerlogin.getPassword());
            putFarmer.get().setPhone_number(Farmerlogin.getPhone_number());
            putFarmer.get().setRegister_Crops(Farmerlogin.getRegister_Crops());
            return new ResponseEntity<>(FarmerLoginservice.putSave(putFarmer.get()), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/deletefarmer/{id}")
    public ResponseEntity<Void> deleteFarmer(@PathVariable Long id) {
     Optional<FarmerLogin>deleteFarmer= FarmerLoginservice.getFindById(id);
        if (deleteFarmer.isPresent()) {
            FarmerLoginservice.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}






