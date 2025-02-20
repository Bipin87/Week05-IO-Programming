package com.bridgelabz.json_data.practice_problems.merge_two_json_objects_into_one;

public class Person {
    private String name;
    private int age;

    // Default constructor
    public Person() {}

    public Person(String name, int age) {
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
}
