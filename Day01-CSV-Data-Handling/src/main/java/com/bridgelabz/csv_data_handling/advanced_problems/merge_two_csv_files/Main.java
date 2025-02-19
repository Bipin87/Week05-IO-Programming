package com.bridgelabz.csv_data_handling.advanced_problems.merge_two_csv_files;

public class Main {
    public static void main(String[] args) {
        String file1 = "src/main/java/com/bridgelabz/csv_data_handling/advanced_problems/merge_two_csv_files/students1.csv";
        String file2 = "src/main/java/com/bridgelabz/csv_data_handling/advanced_problems/merge_two_csv_files/students2.csv";
        String outputFile = "src/main/java/com/bridgelabz/csv_data_handling/advanced_problems/merge_two_csv_files/mergeStudents.csv";

        MergeCSVFiles.mergeCSVFiles(file1, file2, outputFile);
    }
}
