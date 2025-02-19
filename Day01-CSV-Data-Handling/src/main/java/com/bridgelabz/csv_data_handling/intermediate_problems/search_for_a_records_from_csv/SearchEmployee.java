package com.bridgelabz.csv_data_handling.intermediate_problems.search_for_a_records_from_csv;

import java.io.BufferedReader;
import java.io.FileReader;

public class SearchEmployee {
    public static void searchEmployee(String filename, String searchName) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            boolean found = false;

            // Read the first line (header)
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                if (data.length >= 3) {
                    String name = data[0].trim();
                    String department = data[1].trim();
                    String salary = data[2].trim();

                    if (name.equals(searchName)) {
                        System.out.println("Employee: " + data[0]);
                        System.out.println("Department: " + department);
                        System.out.println("Salary: " + salary);
                        found = true;
                        break;
                    }
                }
            }
            if (!found) {
                System.out.println("Employee not found.");
            }
        } catch (Exception e) {
            System.out.println("Error occur in file: " + e.getMessage());
        }

    }

}
