package com.example.FarmarDeliverySystem.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String Cart_items;
    private String Confirm_order;
    public Cart(){

    }
    public Cart(long id, String cart_items, String confirm_order) {
        this.id = id;
        Cart_items = cart_items;
        Confirm_order = confirm_order;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCart_items() {
        return Cart_items;
    }

    public void setCart_items(String cart_items) {
        Cart_items = cart_items;
    }

    public String getConfirm_order() {
        return Confirm_order;
    }

    public void setConfirm_order(String confirm_order) {
        Confirm_order = confirm_order;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", Cart_items='" + Cart_items + '\'' +
                ", Confirm_order='" + Confirm_order + '\'' +
                '}';
    }
}
