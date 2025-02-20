package com.bridgelabz.json_data.hand_on_practice_problems.convert_csv_data_into_json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String csvFilePath = "src/main/java/com/bridgelabz/json_data/hand_on_practice_problems/convert_csv_data_into_json/data.csv"; // Ensure this file exists
        String outputJsonFile = "src/main/java/com/bridgelabz/json_data/hand_on_practice_problems/convert_csv_data_into_json/output_data.json";

        String jsonData = CsvToJsonConverter.convertCsvToJson(csvFilePath);
        System.out.println("Converted JSON:\n" + jsonData);

        // Write JSON to a file
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(outputJsonFile), jsonData);
            System.out.println("JSON saved to: " + outputJsonFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
