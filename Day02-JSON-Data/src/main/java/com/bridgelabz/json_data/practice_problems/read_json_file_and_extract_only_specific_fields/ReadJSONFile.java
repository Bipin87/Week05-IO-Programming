package com.bridgelabz.json_data.practice_problems.read_json_file_and_extract_only_specific_fields;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ReadJSONFile {
    public static void extractSpecificFields(String filePath){

        try {
            // Create ObjectMapper instance
            ObjectMapper objectMapper = new ObjectMapper();

            // Read JSON file and map to List of User objects
            List<User> users = objectMapper.readValue(new File(filePath), new TypeReference<List<User>>() {});

            // Print extracted fields (name and email)
            for (User user : users) {
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
