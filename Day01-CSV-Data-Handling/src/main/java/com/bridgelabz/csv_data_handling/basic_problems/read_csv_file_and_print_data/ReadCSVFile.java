package com.bridgelabz.csv_data_handling.basic_problems.read_csv_file_and_print_data;
import com.opencsv.CSVReader;
import java.io.FileReader;

import java.io.*;
public class ReadCSVFile {
    public static void readCSVFile(String filePath) {
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null){
                System.out.println("ID: " + nextLine[0] + ", Name: " + nextLine[1]);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
}   }
