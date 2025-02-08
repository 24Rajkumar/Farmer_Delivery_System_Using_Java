package com.example.FarmarDeliverySystem.entity;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class FarmerLogin{

    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @GeneratedValue
    private long id;
    @JsonProperty("name")
    private String Name;

    @JsonProperty("email")
    private String Email;

    @JsonProperty("phone_number")
    private long Phone_number;

    @JsonProperty("address")
    private String Address;

    @JsonProperty("password")
    private String Password;

    @JsonProperty("register_Crops")
    private String Register_Crops;


    public FarmerLogin(){

   }
    public FarmerLogin(long id, String name, String email, long phone_number, String address, String password, String register_Crops) {
        this.id = id;
        Name = name;
        Email = email;
        Phone_number = phone_number;
        Address = address;
        Password = password;
        Register_Crops = register_Crops;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public long getPhone_number() {
        return Phone_number;
    }

    public void setPhone_number(long phone_number) {
        Phone_number = phone_number;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getRegister_Crops() {
        return Register_Crops;
    }

    public void setRegister_Crops(String register_Crops) {
        Register_Crops = register_Crops;
    }

    @Override
    public String toString() {
        return "FarmerLogin{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Email='" + Email + '\'' +
                ", Phone_number=" + Phone_number +
                ", Address='" + Address + '\'' +
                ", Password='" + Password + '\'' +
                ", Register_Crops='" + Register_Crops + '\'' +
                '}';
    }
}
