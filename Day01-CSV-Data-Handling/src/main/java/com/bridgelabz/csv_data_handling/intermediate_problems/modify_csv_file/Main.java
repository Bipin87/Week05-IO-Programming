package com.bridgelabz.csv_data_handling.intermediate_problems.modify_csv_file;


public class Main {
    public static void main(String[] args) {
        String inputFile = "src/main/java/com/bridgelabz/csv_data_handling/intermediate_problems/modify_csv_file/employees.csv";

        String outputFile = "src/main/java/com/bridgelabz/csv_data_handling/intermediate_problems/modify_csv_file/updatedEmployees.csv";

        UpdateSalaries.updateSalaries(inputFile, outputFile);
    }
}