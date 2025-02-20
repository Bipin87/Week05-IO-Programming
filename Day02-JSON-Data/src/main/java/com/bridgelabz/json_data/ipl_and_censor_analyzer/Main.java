package com.bridgelabz.json_data.ipl_and_censor_analyzer;

import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        IPLDataProcessor processor = new IPLDataProcessor();
        
        // Process JSON
        List<Map<String, Object>> jsonData = processor.readJson("src/main/java/com/bridgelabz/json_data/ipl_and_censor_analyzer/sample_ipl_data.json");
        List<Map<String, Object>> censoredJsonData = processor.applyCensorship(jsonData);
        processor.writeJson(censoredJsonData, "src/main/java/com/bridgelabz/json_data/ipl_and_censor_analyzer/ipl_matches_censored.json");
        
        // Process CSV
        List<String[]> csvData = processor.readCsv("src/main/java/com/bridgelabz/json_data/ipl_and_censor_analyzer/sample_ipl_data.csv");
        List<String[]> censoredCsvData = processor.applyCensorshipToCsv(csvData);
        processor.writeCsv(censoredCsvData, "src/main/java/com/bridgelabz/json_data/ipl_and_censor_analyzer/ipl_matches_censored.csv");
    }
}