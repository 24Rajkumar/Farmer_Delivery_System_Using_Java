package com.example.FarmarDeliverySystem.service;
import com.example.FarmarDeliverySystem.entity.FarmerLogin;
import com.example.FarmarDeliverySystem.repository.FarmerLoginRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FarmerLoginService {
    @Autowired
     private  FarmerLoginRepo FarmerLoginrepo;


    public  FarmerLogin addfarmers(FarmerLogin Farmerlogin) {
        return  FarmerLoginrepo.save(Farmerlogin);
    }

    public List<FarmerLogin> getFindAll() {
        return FarmerLoginrepo.findAll();
    }

    public Optional<FarmerLogin> getFindById(Long id) {
        return FarmerLoginrepo.findById(id);
    }


    public FarmerLogin putSave(FarmerLogin Farmerlogin) {
        return FarmerLoginrepo.save(Farmerlogin);
    }


    public Optional<FarmerLogin> deleteById(Long id) {
        FarmerLoginrepo.deleteById(id);
        return Optional.empty();
    }
//      public void deleteById(Long id) {
//         FarmerLoginrepo.deleteById(id);
//         }


}
