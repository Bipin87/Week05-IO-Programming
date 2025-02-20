package com.bridgelabz.json_data.hand_on_practice_problems.validate_an_email_field_using_json_schema;

import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONException;

public class EmailValidator {
    
    // JSON Schema definition
    private static final String JSON_SCHEMA = "{"
            + "\"type\": \"object\","
            + "\"properties\": {"
            + "    \"name\": {\"type\": \"string\"},"
            + "    \"email\": {"
            + "        \"type\": \"string\","
            + "        \"format\": \"email\""
            + "    }"
            + "},"
            + "\"required\": [\"name\", \"email\"]"
            + "}";

    public static boolean isValidEmailJson(String jsonData) {
        try {
            JSONObject jsonSchema = new JSONObject(JSON_SCHEMA);
            JSONObject jsonObject = new JSONObject(jsonData);

            Schema schema = SchemaLoader.load(jsonSchema);
            schema.validate(jsonObject); // Validate JSON against schema

            return true;
        } catch (JSONException | org.everit.json.schema.ValidationException e) {
            System.out.println("Validation failed: " + e.getMessage());
            return false;
        }
    }

}
