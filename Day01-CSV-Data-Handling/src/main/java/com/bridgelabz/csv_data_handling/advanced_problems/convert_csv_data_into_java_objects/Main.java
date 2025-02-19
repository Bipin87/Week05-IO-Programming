package com.bridgelabz.csv_data_handling.advanced_problems.convert_csv_data_into_java_objects;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filename = "src/main/java/com/bridgelabz/csv_data_handling/advanced_problems/convert_csv_data_into_java_objects/students.csv";
        List<Student> students = ConvertCSVDataToObjects.readCSVAndConvertToObjects(filename);

        // Print out the student details
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
