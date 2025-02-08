package com.example.FarmarDeliverySystem.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class CustomerLogin {
    @Id
 //@GeneratedValue(strategy = GenerationType.AUTO)
    @GeneratedValue
    private long id;
    private String Name;
    private String Email;
    private long Phone_number;
    private String Address;
    private String Password;

    public CustomerLogin(){

    }

    public CustomerLogin(long id, String name, String email, long phone_number, String address, String password ) {
        this.id = id;
        Name = name;
        Email = email;
        Phone_number = phone_number;
        Address = address;
        Password = password;

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

    @Override
    public String toString() {
        return "CustomerLogin{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Email='" + Email + '\'' +
                ", Phone_number=" + Phone_number +
                ", Address='" + Address + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }
}
