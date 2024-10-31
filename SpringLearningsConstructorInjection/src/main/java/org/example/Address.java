package org.example;

public class Address {
    private String house_no;
    private String city;
    private String pincode;

    public Address(String house_no, String city, String pincode) {
        this.house_no = house_no;
        this.city = city;
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "house_no='" + house_no + '\'' +
                ", city='" + city + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}
