package com.bridgelabz.json_data.practice_problems.validate_json_structure_using_jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

public class JsonValidator {

    // Validate JSON structure by trying to deserialize it into a User object
    public static boolean isValidJson(String jsonString) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.readValue(jsonString, User.class);
            return true;
        } catch (JsonProcessingException e) {
            return false;
        }
    }


}
