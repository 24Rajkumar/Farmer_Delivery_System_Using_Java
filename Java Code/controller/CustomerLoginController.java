package com.example.FarmarDeliverySystem.controller;
import com.example.FarmarDeliverySystem.entity.CustomerLogin;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.FarmarDeliverySystem.service.CustomerLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;
@RequestMapping("/api")
@RestController
public class CustomerLoginController {
    @Autowired
    CustomerLoginService CustomerLoginservice;

    @PostMapping("/addcustomers")
    public ResponseEntity<CustomerLogin> postCustomers(@RequestBody CustomerLogin Customerlogin) {
        CustomerLogin saveCustomers = CustomerLoginservice.addCustomers(Customerlogin);
        return ResponseEntity.ok(saveCustomers);

    }

    @GetMapping("/getcustomers")
    public ResponseEntity<List<CustomerLogin>> getAllCustomers() {
        List<CustomerLogin> getCustomers = CustomerLoginservice.getFindAll();
        return ResponseEntity.ok(getCustomers);
    }

    @GetMapping("/getcustomer/{id}")
    public ResponseEntity<CustomerLogin> getCustomer(@PathVariable Long id) {
        Optional<CustomerLogin> getCustomer = CustomerLoginservice.getFindById(id);
        if (getCustomer.isPresent()) {
            return new ResponseEntity<>(getCustomer.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PutMapping("/updatecustomer/{id}")
    public ResponseEntity<CustomerLogin> updateCustomer(@PathVariable Long id, @RequestBody CustomerLogin Customerlogin) {
        return CustomerLoginservice.updateCustomer(id, Customerlogin);
    }

//    @PutMapping("/updatecustomer/{id}")
//    public ResponseEntity<CustomerLogin> updateCustomer(@PathVariable Long id, @RequestBody CustomerLogin Customerlogin) {
//        return new ResponseEntity<>(CustomerLoginservice.updateCustomer(id, Customerlogin), HttpStatus.OK);
//    }
@DeleteMapping("/deletecustomer/{id}")
public ResponseEntity<Void> deleteCustomer(@PathVariable Long id) {
    return CustomerLoginservice.deleteCustomer(id);
}
}


//    @DeleteMapping("/deletecustomer/{id}")
//    public ResponseEntity<Void> deleteCustomer(@PathVariable Long id) {
//        return CustomerLoginservice.deleteCustomer(id);
//    }





//**********************************                   Methods       ********************************


    //**************************************get method bt id using Optional
//    @GetMapping("/getcustomer/{id}")
//    public ResponseEntity<CustomerLogin> getCustomer(@PathVariable Long id) {
//        Optional<CustomerLogin> getCustomerById = CustomerLoginservice.getFindById(id);
//        return new ResponseEntity<>(getCustomerById.get(),HttpStatus.OK);
//    }
    //***********************************************************************************************
    //**********************Using List to return elements  with Type 1  ***********************************************
//    @GetMapping("/getcustomers")
//    public ResponseEntity<List<CustomerLogin>> getAllCustomers() {
//        return new ResponseEntity<>(CustomerLoginservice.getFindAll(), HttpStatus.OK);
//    }
//*********************************************************************************************************************************
    //**********************Using Iterable to return elements  with Type 1*************************************************************
//    @GetMapping("/getcustomers")
//    public ResponseEntity<Iterable<CustomerLogin>> getAllCustomers1() {
//        Iterable<CustomerLogin> getCustomers = CustomerLoginservice.getFindAll();
//        return ResponseEntity.ok(getCustomers);
//    }
// ******************************************************************************************************************************

//    @PutMapping("/updatecustomer/{id}")
//    public ResponseEntity<CustomerLogin>updatecustomer(@PathVariable Long id,@RequestBody CustomerLogin Customerlogin){
//        Optional<CustomerLogin>putCustomer=CustomerLoginservice.getFindById(id);
//        if(putCustomer.isPresent()){
//            putCustomer.get().setAddress(Customerlogin.getAddress());
//            putCustomer.get().setEmail(Customerlogin.getEmail());
//            putCustomer.get().setName(Customerlogin.getName());
//            putCustomer.get().setPassword(Customerlogin.getPassword());
//            putCustomer.get().setPhone_number(Customerlogin.getPhone_number());
//            return new ResponseEntity<>(CustomerLoginservice.updateCustomer(putCustomer.get()),HttpStatus.OK);
//        }else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//***********************************************************************************************************
//    @DeleteMapping("/cusdelete/{id}")
//    public ResponseEntity<Void>deleteCustomer(@PathVariable Long id){
//        Optional<CustomerLogin>customerLogin=CustomerLoginservice.getFindById(id);
//        if(customerLogin.isPresent()){
//            CustomerLoginservice.deleteById(id);
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        }else{
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }




