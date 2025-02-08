package com.example.FarmarDeliverySystem.service;
import com.example.FarmarDeliverySystem.entity.CustomerLogin;
import com.example.FarmarDeliverySystem.repository.CustomerLoginRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerLoginService {
    @Autowired
    CustomerLoginRepo CustomerLoginrepo;


    public CustomerLogin addCustomers(CustomerLogin Customerlogin) {
        return CustomerLoginrepo.save(Customerlogin);
    }

    public List<CustomerLogin> getFindAll() {
        return CustomerLoginrepo.findAll();
    }


    public Optional<CustomerLogin> getFindById(Long id) {
        return CustomerLoginrepo.findById(id);
    }

//    public Optional<CustomerLogin> getFindById(Long id) {
//        Optional<CustomerLogin> Customerlogin = CustomerLoginrepo.findById(id);
//        if (Customerlogin.isPresent()) {
//            return Customerlogin;
//        } else {
//            return Optional.empty();
//        }
//    }

    //    public CustomerLogin updateCustomer(Long id, CustomerLogin Customerlogin) {
//        Optional<CustomerLogin> putCustomer = CustomerLoginrepo.findById(id);
//        if (putCustomer.isPresent()) {
//            putCustomer.get().setAddress(Customerlogin.getAddress());
//            putCustomer.get().setEmail(Customerlogin.getEmail());
//            putCustomer.get().setName(Customerlogin.getName());
//            putCustomer.get().setPassword(Customerlogin.getPassword());
//            putCustomer.get().setPhone_number(Customerlogin.getPhone_number());
//            return   CustomerLoginrepo.save(putCustomer.get());
//        } else {
//              throw new RuntimeException("Customer not found");
//        }
//    }
    public ResponseEntity<CustomerLogin> updateCustomer(Long id, CustomerLogin customerlogin) {
        Optional<CustomerLogin> putCustomer = CustomerLoginrepo.findById(id);
        if (putCustomer.isPresent()) {
            putCustomer.get().setAddress(customerlogin.getAddress());
            putCustomer.get().setEmail(customerlogin.getEmail());
            putCustomer.get().setName(customerlogin.getName());
            putCustomer.get().setPassword(customerlogin.getPassword());
            putCustomer.get().setPhone_number(customerlogin.getPhone_number());
            return new ResponseEntity<>(CustomerLoginrepo.save(putCustomer.get()), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }public ResponseEntity<Void> deleteCustomer (Long id){
            Optional<CustomerLogin> customer = CustomerLoginrepo.findById(id);
            if (customer.isPresent()) {
                CustomerLoginrepo.deleteById(id);
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }
    }
//    public void deleteCustomer(Long id) {
//        Optional<CustomerLogin> Customerlogin = CustomerLoginrepo.findById(id);
//        if (Customerlogin.isPresent()) {
//            CustomerLoginrepo.deleteById(id);
//        } else {
//            throw new RuntimeException("Customer not found");
//        }
//    }





