package com.example.FarmarDeliverySystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String Payment;
    private String Upi;
    private String Card;
    private String Net_banking;
    private String COD;
    private String Confirm_payment;
    private String Order_confirmed;
    public Payment(){

    }

    public Payment(long id, String payment, String upi, String card, String net_banking, String COD, String confirm_payment, String order_confirmed) {
        this.id = id;
        Payment = payment;
        Upi = upi;
        Card = card;
        Net_banking = net_banking;
        this.COD = COD;
        Confirm_payment = confirm_payment;
        Order_confirmed = order_confirmed;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPayment() {
        return Payment;
    }

    public void setPayment(String payment) {
        Payment = payment;
    }

    public String getUpi() {
        return Upi;
    }

    public void setUpi(String upi) {
        Upi = upi;
    }

    public String getCard() {
        return Card;
    }

    public void setCard(String card) {
        Card = card;
    }

    public String getNet_banking() {
        return Net_banking;
    }

    public void setNet_banking(String net_banking) {
        Net_banking = net_banking;
    }

    public String getCOD() {
        return COD;
    }

    public void setCOD(String COD) {
        this.COD = COD;
    }

    public String getConfirm_payment() {
        return Confirm_payment;
    }

    public void setConfirm_payment(String confirm_payment) {
        Confirm_payment = confirm_payment;
    }

    public String getOrder_confirmed() {
        return Order_confirmed;
    }

    public void setOrder_confirmed(String order_confirmed) {
        Order_confirmed = order_confirmed;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", Payment='" + Payment + '\'' +
                ", Upi='" + Upi + '\'' +
                ", Card='" + Card + '\'' +
                ", Net_banking='" + Net_banking + '\'' +
                ", COD='" + COD + '\'' +
                ", Confirm_payment='" + Confirm_payment + '\'' +
                ", Order_confirmed='" + Order_confirmed + '\'' +
                '}';
    }
}
