package com.bridgelabz.csv_data_handling.basic_problems.write_data_to_a_csv_file;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;

public class WriteDataInCSV {
    public static void writeDataInCSV(String filePath) {
        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
            String[] header = {"ID", "Name", "Department", "Salary"};
            String[] emp1 = {"104", "Bipin Kumar Sahu", "Finance", "62000"};
            String[] emp2 = {"105", "Amit Sahu", "Sales", "58000"};
            String[] emp3 = {"106", "Arun Tiwari", "Marketing", "65000"};
            String[] emp4 = {"107", "Aryan", "IT", "72599"};
            String[] emp5 = {"108", "Deepraj", "HR", "68000"};


            writer.writeNext(header);
            writer.writeNext(emp1);
            writer.writeNext(emp2);
            writer.writeNext(emp3);
            writer.writeNext(emp4);
            writer.writeNext(emp5);


            System.out.println("CSV file written successfully using OpenCSV!");
        } catch (IOException e) {

            System.out.println("IOException occur: " + e.getMessage());
        }
    }
}
