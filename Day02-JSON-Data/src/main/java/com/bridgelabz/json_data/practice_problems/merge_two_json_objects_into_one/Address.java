package com.bridgelabz.json_data.practice_problems.merge_two_json_objects_into_one;

public class Address {
    private String city;
    private String country;

    // Default constructor
    public Address() {}

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }

    // Getters and Setters
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
