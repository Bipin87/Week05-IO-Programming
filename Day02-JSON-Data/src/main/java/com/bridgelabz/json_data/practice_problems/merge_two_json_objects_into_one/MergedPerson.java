package com.bridgelabz.json_data.practice_problems.merge_two_json_objects_into_one;

public class MergedPerson {
    private String name;
    private int age;
    private String city;
    private String country;

    // Default constructor
    public MergedPerson() {}

    public MergedPerson(String name, int age, String city, String country) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.country = country;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

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
