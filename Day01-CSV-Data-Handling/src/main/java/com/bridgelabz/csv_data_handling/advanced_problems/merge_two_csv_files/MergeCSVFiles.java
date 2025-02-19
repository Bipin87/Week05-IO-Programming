package com.bridgelabz.csv_data_handling.advanced_problems.merge_two_csv_files;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class MergeCSVFiles {
    public static void mergeCSVFiles(String file1, String file2, String outputFile) {
        Map<Integer, Student> studentMap = new HashMap<>();

        // Read the first CSV (students1.csv) and store data in the studentMap based on ID
        try (BufferedReader br = new BufferedReader(new FileReader(file1))) {
            String line;
            boolean isHeader = true;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                int id = Integer.parseInt(data[0].trim());
                String name = data[1].trim();
                int age = Integer.parseInt(data[2].trim());

                studentMap.put(id, new Student(id, name, age));
            }
        } catch (IOException e) {
            System.out.println("Error reading " + file1 + ": " + e.getMessage());
            return;
        }

        // Read the second CSV (students2.csv) and merge data with studentMap
        try (BufferedReader br = new BufferedReader(new FileReader(file2))) {
            String line;
            boolean isHeader = true;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                int id = Integer.parseInt(data[0].trim());
                int marks = Integer.parseInt(data[1].trim());
                String grade = data[2].trim();

                if (studentMap.containsKey(id)) {
                    Student student = studentMap.get(id);
                    student.setMarks(marks);
                    student.setGrade(grade);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading " + file2 + ": " + e.getMessage());
            return;
        }

        // Write the merged data into the output file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
            bw.write("ID,Name,Age,Marks,Grade");
            bw.newLine();

            for (Student student : studentMap.values()) {
                bw.write(student.toCSV());
                bw.newLine();
            }

            System.out.println("Merged data saved to " + outputFile);
        } catch (IOException e) {
            System.out.println("Error writing to " + outputFile + ": " + e.getMessage());
        }
    }
}
