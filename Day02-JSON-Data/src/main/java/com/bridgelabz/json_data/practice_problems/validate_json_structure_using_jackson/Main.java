package com.bridgelabz.json_data.practice_problems.validate_json_structure_using_jackson;

import static com.bridgelabz.json_data.practice_problems.validate_json_structure_using_jackson.JsonValidator.isValidJson;

public class Main {
    public static void main(String[] args) {
        // Example valid JSON
        String validJson = "{ \"name\": \"Bipin\", \"email\": \"bipin@example.com\", \"age\": 21 }";

        // Example invalid JSON (missing email field)
        String invalidJson = "{ \"name\": \"Aman\", \"email\": aman@company.com }";

        // Validate and print results
        System.out.println("Valid JSON: " + isValidJson(validJson));
        System.out.println("Invalid JSON: " + isValidJson(invalidJson));
    }
}
