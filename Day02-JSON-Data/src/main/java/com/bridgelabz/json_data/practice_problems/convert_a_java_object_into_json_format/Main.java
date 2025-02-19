package com.bridgelabz.json_data.practice_problems.convert_a_java_object_into_json_format;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota","Camry",2022);
        System.out.println(JavaObjectToJSON.convertInJSON(car));
    }
}
