package com.bridgelabz.json_data.hand_on_practice_problems.convert_csv_data_into_json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class CsvToJsonConverter {

    // Convert CSV file to JSON
    public static String convertCsvToJson(String csvFilePath) {
        ObjectMapper objectMapper = new ObjectMapper();
        ArrayNode jsonArray = objectMapper.createArrayNode();

        try (CSVParser csvParser = new CSVParser(new FileReader(csvFilePath), CSVFormat.DEFAULT.withFirstRecordAsHeader())) {
            Iterator<CSVRecord> iterator = csvParser.iterator();

            while (iterator.hasNext()) {
                CSVRecord record = iterator.next();
                ObjectNode jsonObject = objectMapper.createObjectNode();

                for (String header : csvParser.getHeaderMap().keySet()) {
                    jsonObject.put(header, record.get(header));
                }

                jsonArray.add(jsonObject);
            }
        } catch (IOException e) {
            throw new RuntimeException("Error reading CSV file: " + e.getMessage());
        }

        try {
            return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonArray);
        } catch (IOException e) {
            throw new RuntimeException("Error converting to JSON: " + e.getMessage());
        }
    }


}
