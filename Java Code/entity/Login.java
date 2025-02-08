package com.example.FarmarDeliverySystem.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String Customer;
    private String Farmer;
   public Login(){

   }
    public Login(Long id, String customer, String farmer) {
        this.id = id;
        Customer = customer;
        Farmer = farmer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomer() {
        return Customer;
    }

    public void setCustomer(String customer) {
        Customer = customer;
    }

    public String getFarmer() {
        return Farmer;
    }

    public void setFarmer(String farmer) {
        Farmer = farmer;
    }

    @Override
    public String toString() {
        return "Login{" +
                "id=" + id +
                ", Customer='" + Customer + '\'' +
                ", Farmer='" + Farmer + '\'' +
                '}';
    }
}
