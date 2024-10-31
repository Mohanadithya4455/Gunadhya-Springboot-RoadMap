package com.example.springbootRelations.entities;


import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
    private String house_no;
    private String city;
    private String pincode;
}
