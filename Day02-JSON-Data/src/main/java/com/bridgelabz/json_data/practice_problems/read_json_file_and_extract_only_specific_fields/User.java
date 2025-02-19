package com.bridgelabz.json_data.practice_problems.read_json_file_and_extract_only_specific_fields;

public class User {
    private String name;
    private String email;

    public User(){}

    public User(String name,String email) {
        this.name = name;
        this.email = email;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

