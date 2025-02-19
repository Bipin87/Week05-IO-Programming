package com.bridgelabz.csv_data_handling.intermediate_problems.filter_records_from_csv;

import com.opencsv.CSVReader;

import java.io.FileReader;

public class FilterStudentsMarks {
    public static void filterHighScores(String filePath){
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            // Skip header row
            String[] header = reader.readNext();
            if (header == null) {
                System.out.println("CSV file is empty!");
                return;
            }

            System.out.println("Students with Marks > 80:");
            boolean found = false;
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                try {
                    int marks = Integer.parseInt(nextLine[2].trim());
                    if (marks > 80) {
                        found = true;
                        System.out.println("ID: " + nextLine[0] + ", Name: " + nextLine[1] + ", Marks: " + marks);
                    }
                }catch (NumberFormatException e) {
                    System.out.println("Error occur in file: " + e.getMessage());
                }


            }
            if(!found) {
                System.out.println("No one students score more than 80.");
            }

        }catch(Exception e){
            System.out.println("IOException occur: " + e.getMessage());
        }
    }
}
