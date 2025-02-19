package com.bridgelabz.csv_data_handling.intermediate_problems.search_for_a_records_from_csv;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String filename = "src/main/java/com/bridgelabz/csv_data_handling/intermediate_problems/search_for_a_records_from_csv/employees.csv";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String searchName = scanner.nextLine().trim();

        SearchEmployee.searchEmployee(filename, searchName);
    }
}