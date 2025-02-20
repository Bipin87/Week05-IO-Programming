package com.bridgelabz.json_data.hand_on_practice_problems.filter_json_data_print_only_users_older_than_25years;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Users {
    private String name;
    private int age;

    // Default constructor (required for Jackson)
    public Users() {}

    public Users(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "{ \"name\": \"" + name + "\", \"age\": " + age + " }";
    }
}
