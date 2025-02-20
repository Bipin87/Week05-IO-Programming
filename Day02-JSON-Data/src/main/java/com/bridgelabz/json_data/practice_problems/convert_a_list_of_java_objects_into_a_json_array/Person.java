package com.bridgelabz.json_data.practice_problems.convert_a_list_of_java_objects_into_a_json_array;

public class Person {
    private String name;
    private int age;
    private String city;

    // Constructor
    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    // Getters methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }
}
