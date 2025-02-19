package com.bridgelabz.csv_data_handling.advanced_problems.validate_csv_data_before_processing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class ValidateCSVData {
    public static List<String[]> validateCSV(String filename) {
        List<String[]> invalidRows = new ArrayList<>();
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$"; // Email regex
        String phoneRegex = "^\\d{10}$"; // Phone number regex for exactly 10 digits

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            boolean isHeader = true;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                if (isHeader) {
                    isHeader = false;
                    continue; // Skip header row
                }

                String email = data[2].trim();
                String phone = data[3].trim();
                boolean validEmail = Pattern.matches(emailRegex, email);
                boolean validPhone = Pattern.matches(phoneRegex, phone);

                if (!validEmail || !validPhone) {
                    invalidRows.add(data);
                    if (!validEmail) {
                        System.out.println("Invalid Email: " + email);
                    }
                    if (!validPhone) {
                        System.out.println("Invalid Phone: " + phone);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        return invalidRows;
    }
}
