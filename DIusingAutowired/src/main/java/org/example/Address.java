package org.example;

import org.springframework.stereotype.Component;

@Component
public class Address {
    private String city;
    private String pincode;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}
