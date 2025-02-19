package com.bridgelabz.csv_data_handling.advanced_problems.read_large_csv_file_efficiently;

public class Main {
    public static void main(String[] args) {
        String filename = "src/main/java/com/bridgelabz/csv_data_handling/advanced_problems/read_large_csv_file_efficiently/largeFile.csv";
        int size = 100; // Process 100 lines at a time
        ProcessLargeCSVFile.processCSVInChunks(filename, size);
    }

}
