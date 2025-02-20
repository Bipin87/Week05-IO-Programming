package com.bridgelabz.json_data.hand_on_practice_problems.convert_json_to_xml_format;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;
import org.json.XML;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonToXmlConverter {

    // Convert JSON string to XML
    public static String convertJsonToXml(String jsonString) {
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            return XML.toString(jsonObject, "root"); // "root" is the XML root element
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    // Read JSON from file and convert to XML
    public static String convertJsonFileToXml(String filePath) {

        try {
            // Read JSON file as String
            String jsonContent = new String(Files.readAllBytes(Paths.get(filePath)));
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(new File(filePath));
            String jsonString = objectMapper.writeValueAsString(jsonNode);
            return convertJsonToXml(jsonString);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
