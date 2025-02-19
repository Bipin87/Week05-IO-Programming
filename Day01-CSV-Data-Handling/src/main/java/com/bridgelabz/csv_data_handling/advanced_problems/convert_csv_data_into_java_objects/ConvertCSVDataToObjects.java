package com.bridgelabz.csv_data_handling.advanced_problems.convert_csv_data_into_java_objects;

import java.io.*;
import java.util.*;

public class ConvertCSVDataToObjects {
    public static List<Student> readCSVAndConvertToObjects(String filename) {
        List<Student> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            boolean isHeader = true;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                // Skip header row
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                // Convert the row into a Student object
                int id = Integer.parseInt(data[0].trim());
                String name = data[1].trim();
                int age = Integer.parseInt(data[2].trim());
                String grade = data[3].trim();

                Student student = new Student(id, name, age, grade);
                students.add(student);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        return students;
    }
}