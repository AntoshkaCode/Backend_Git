package com.example.housingdata.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "housings")
public class Housing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String address;
    
    @Column(nullable = false)
    private String type;
    
    @Column(name = "square_feet", nullable = false)
    private Integer squareFeet;
    
    @Column(nullable = false)
    private Integer bedrooms;
    
    @Column(nullable = false)
    private Double bathrooms;
    
    @Column(nullable = false)
    private Double price;

    // Default constructor for JPA
    public Housing() {}

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(Integer squareFeet) {
        this.squareFeet = squareFeet;
    }

    public Integer getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(Integer bedrooms) {
        this.bedrooms = bedrooms;
    }

    public Double getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(Double bathrooms) {
        this.bathrooms = bathrooms;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Housing housing = (Housing) o;
        return Objects.equals(id, housing.id) &&
                Objects.equals(address, housing.address) &&
                Objects.equals(type, housing.type) &&
                Objects.equals(squareFeet, housing.squareFeet) &&
                Objects.equals(bedrooms, housing.bedrooms) &&
                Objects.equals(bathrooms, housing.bathrooms) &&
                Objects.equals(price, housing.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, address, type, squareFeet, bedrooms, bathrooms, price);
    }

    @Override
    public String toString() {
        return "Housing{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", type='" + type + '\'' +
                ", squareFeet=" + squareFeet +
                ", bedrooms=" + bedrooms +
                ", bathrooms=" + bathrooms +
                ", price=" + price +
                '}';
    }
}
