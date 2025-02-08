package com.example.FarmarDeliverySystem.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProductsAvailable {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String Product_name;
    private String Rating;
    private String Price_per_kg;
    private String Image_of_product;
    private String Add_to_cart;
    public ProductsAvailable(){

    }

    public ProductsAvailable(long id, String product_name, String rating, String price_per_kg, String image_of_product, String add_to_cart) {
        this.id = id;
        Product_name = product_name;
        Rating = rating;
        Price_per_kg = price_per_kg;
        Image_of_product = image_of_product;
        Add_to_cart = add_to_cart;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProduct_name() {
        return Product_name;
    }

    public void setProduct_name(String product_name) {
        Product_name = product_name;
    }

    public String getRating() {
        return Rating;
    }

    public void setRating(String rating) {
        Rating = rating;
    }

    public String getPrice_per_kg() {
        return Price_per_kg;
    }

    public void setPrice_per_kg(String price_per_kg) {
        Price_per_kg = price_per_kg;
    }

    public String getImage_of_product() {
        return Image_of_product;
    }

    public void setImage_of_product(String image_of_product) {
        Image_of_product = image_of_product;
    }

    public String getAdd_to_cart() {
        return Add_to_cart;
    }

    public void setAdd_to_cart(String add_to_cart) {
        Add_to_cart = add_to_cart;
    }

    @Override
    public String toString() {
        return "ProductsAvailable{" +
                "id=" + id +
                ", Product_name='" + Product_name + '\'' +
                ", Rating='" + Rating + '\'' +
                ", Price_per_kg='" + Price_per_kg + '\'' +
                ", Image_of_product='" + Image_of_product + '\'' +
                ", Add_to_cart='" + Add_to_cart + '\'' +
                '}';
    }
}
