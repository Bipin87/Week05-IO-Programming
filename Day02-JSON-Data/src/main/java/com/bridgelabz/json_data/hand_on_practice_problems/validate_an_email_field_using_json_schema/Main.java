package com.bridgelabz.json_data.hand_on_practice_problems.validate_an_email_field_using_json_schema;

import static com.bridgelabz.json_data.hand_on_practice_problems.validate_an_email_field_using_json_schema.EmailValidator.isValidEmailJson;

public class Main {
    public static void main(String[] args) {
        class InnerMain {
            public static void run() {
                String validJson = "{ \"name\": \"Bipin\", \"email\": \"bipin@example.com\" }";
                String invalidJson = "{ \"name\": \"aryan\", \"email\": \"invalid-email\" }";

                System.out.println("Valid JSON Test: " + isValidEmailJson(validJson)); // Expected: true
                System.out.println("Invalid JSON Test: " + isValidEmailJson(invalidJson)); // Expected: false
            }
        }

        InnerMain.run();
    }
}
