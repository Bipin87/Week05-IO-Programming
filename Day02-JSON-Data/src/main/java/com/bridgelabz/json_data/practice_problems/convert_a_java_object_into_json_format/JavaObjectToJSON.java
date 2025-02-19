package com.bridgelabz.json_data.practice_problems.convert_a_java_object_into_json_format;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaObjectToJSON {
    public static String convertInJSON(Car car){
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(car);

            return jsonString;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
