package com.bridgelabz.csv_data_handling.intermediate_problems.modify_csv_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UpdateSalaries {
    public static void updateSalaries(String inputFile, String outputFile) {
        List<String[]> records = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            boolean isHeader = true;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                if (isHeader) {
                    records.add(data); // Add header as is
                    isHeader = false;
                    continue;
                }

                if (data.length >= 3) {
                    String department = data[1].trim();
                    double salary = Double.parseDouble(data[2].trim());

                    if (department.equalsIgnoreCase("IT")) {
                        salary *= 1.10; // Increase by 10%
                    }
                    data[2] = String.format("%.2f", salary);
                }
                records.add(data);
            }

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            return;
        }

        // Write updated data to new CSV file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
            for (String[] record : records) {
                bw.write(String.join(",", record));
                bw.newLine();
            }
            System.out.println("Updated salaries saved to " + outputFile);
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }


    }

}
