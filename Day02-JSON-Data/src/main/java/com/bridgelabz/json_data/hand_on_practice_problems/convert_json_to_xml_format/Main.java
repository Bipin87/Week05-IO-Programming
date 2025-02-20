package com.bridgelabz.json_data.hand_on_practice_problems.convert_json_to_xml_format;

public class Main {
    public static void main(String[] args) {
        // Convert JSON file to XML
        String jsonFilePath = "src/main/java/com/bridgelabz/json_data/hand_on_practice_problems/convert_json_to_xml_format/data.json"; // Ensure this file exists

        try {

            String xmlFromFile = JsonToXmlConverter.convertJsonFileToXml(jsonFilePath);

            if (xmlFromFile != null) {
                System.out.println("\nConverted XML from file:\n" + xmlFromFile);
            } else {
                System.out.println("\nFailed to convert JSON file.");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
