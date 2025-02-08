package com.example.FarmarDeliverySystem.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class FdsOpenController {
    @GetMapping("/")
    public String fdsOpen() {
        return "fds";
    }
    @GetMapping("/login")
    public String showLoginPage() {
        return "login"; // Returns login.html
    }

    @GetMapping("/signin")
    public String showSigninPage() {
        return "signin"; // Returns signin.html
    }

    @GetMapping("/fregister")
    public String farmerRegistrationPage() {
        return "farmerregistration"; // Returns farmerregistration.html
    }

    @GetMapping("/cregister")
    public String customerRegistrationPage() {
        return "customerregistration"; // Returns customerregistration.html
    }

    @GetMapping("/clogin")
    public String customerLoginPage() {
        return "customerlogin"; // Returns customerlogin.html
    }

    @GetMapping("/flogin")
    public String farmerLoginPage() {
        return "farmerlogin"; // Returns farmerlogin.html
    }



}
