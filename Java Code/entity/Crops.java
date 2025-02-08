package com.example.FarmarDeliverySystem.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Crops {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String Name_of_crop;
    private String Quantity;
    private String Price_per_kg;
    private String Pesticides_used;
    private String Video;
    public Crops(){

    }

    public Crops(long id, String name_of_crop, String quantity, String price_per_kg, String pesticides_used, String video) {
        this.id = id;
        Name_of_crop = name_of_crop;
        Quantity = quantity;
        Price_per_kg = price_per_kg;
        Pesticides_used = pesticides_used;
        Video = video;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName_of_crop() {
        return Name_of_crop;
    }

    public void setName_of_crop(String name_of_crop) {
        Name_of_crop = name_of_crop;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String quantity) {
        Quantity = quantity;
    }

    public String getPrice_per_kg() {
        return Price_per_kg;
    }

    public void setPrice_per_kg(String price_per_kg) {
        Price_per_kg = price_per_kg;
    }

    public String getPesticides_used() {
        return Pesticides_used;
    }

    public void setPesticides_used(String pesticides_used) {
        Pesticides_used = pesticides_used;
    }

    public String getVideo() {
        return Video;
    }

    public void setVideo(String video) {
        Video = video;
    }

    @Override
    public String toString() {
        return "Crops{" +
                "id=" + id +
                ", Name_of_crop='" + Name_of_crop + '\'' +
                ", Quantity=" + Quantity +
                ", Price_per_kg=" + Price_per_kg +
                ", Pesticides_used='" + Pesticides_used + '\'' +
                ", Video='" + Video + '\'' +
                '}';
    }
}
