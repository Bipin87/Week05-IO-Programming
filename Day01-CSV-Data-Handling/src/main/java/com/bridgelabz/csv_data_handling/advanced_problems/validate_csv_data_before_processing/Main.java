package com.bridgelabz.csv_data_handling.advanced_problems.validate_csv_data_before_processing;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filename = "src/main/java/com/bridgelabz/csv_data_handling/advanced_problems/validate_csv_data_before_processing/employees.csv";
        List<String[]> invalidRows = ValidateCSVData.validateCSV(filename);

        if (!invalidRows.isEmpty()) {
            System.out.println("Invalid rows found:");
            for (String[] row : invalidRows) {
                System.out.println("Invalid row: " + String.join(", ", row));
            }
        } else {
            System.out.println("All rows are valid.");
        }
    }
}
