package com.bridgelabz.csv_data_handling.basic_problems.read_and_count_rows_in_a_csv_file;

import com.opencsv.CSVReader;
import java.io.FileReader;
public class ReadAndCountRows {
    public static void readAndCountRows(String filePath) {
        int count =0;
        try (CSVReader reader = new CSVReader(new FileReader(filePath))){
            // Skip the header row
            String[] header = reader.readNext();
            if (header == null) {
                System.out.println("CSV file is empty");
                return;
            }

            String[] nextLine;
            while ((nextLine = reader.readNext()) != null){
                count++;
                System.out.println("ID: " + nextLine[0] + ", Name: " + nextLine[1] +", Deparment: " + nextLine[2] +", Salary: " + nextLine[3]);
            }
            System.out.println("Total number of rows in csv file is: "+ count);
        } catch (Exception e) {
            System.out.println("Exception occur" + e.getMessage());;

        }
    }
}

