package com.bridgelabz.csv_data_handling.advanced_problems.convert_json_to_csv_and_vise_versa;

import static com.bridgelabz.csv_data_handling.advanced_problems.convert_json_to_csv_and_vise_versa.ConvertJSONToCSV.csvToJSON;
import static com.bridgelabz.csv_data_handling.advanced_problems.convert_json_to_csv_and_vise_versa.ConvertJSONToCSV.jsonToCSV;

public class Main {
    public static void main(String[] args) {
        try {
            // Convert JSON to CSV
            jsonToCSV("src/main/java/com/bridgelabz/csv_data_handling/advanced_problems/convert_json_to_csv_and_vise_versa/students.json", "src/main/java/com/bridgelabz/csv_data_handling/advanced_problems/convert_json_to_csv_and_vise_versa/students.csv");

            // Convert CSV to JSON
            csvToJSON("src/main/java/com/bridgelabz/csv_data_handling/advanced_problems/convert_json_to_csv_and_vise_versa/students.json", "src/main/java/com/bridgelabz/csv_data_handling/advanced_problems/convert_json_to_csv_and_vise_versa/students.csv");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
