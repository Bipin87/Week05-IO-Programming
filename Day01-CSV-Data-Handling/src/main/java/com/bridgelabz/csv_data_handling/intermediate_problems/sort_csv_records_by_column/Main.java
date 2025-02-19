package com.bridgelabz.csv_data_handling.intermediate_problems.sort_csv_records_by_column;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filename = "src/main/java/com/bridgelabz/csv_data_handling/intermediate_problems/sort_csv_records_by_column/employees.csv";
        List<String[]> records = SortCSVRecords.readCSV(filename);

        if (records != null) {
            // Sort by Salary in descending order
            records.sort((a, b) -> Double.compare(Double.parseDouble(b[2]), Double.parseDouble(a[2])));

            // Print top 5 highest-paid employees
            System.out.println("Top 5 highest-paid employees:");
            for (int i = 0; i < Math.min(5, records.size()); i++) {
                String[] record = records.get(i);
                System.out.println("Employee: " + record[0] + ", Department: " + record[1] + ", Salary: " + record[2]);
            }
        }
    }
}
