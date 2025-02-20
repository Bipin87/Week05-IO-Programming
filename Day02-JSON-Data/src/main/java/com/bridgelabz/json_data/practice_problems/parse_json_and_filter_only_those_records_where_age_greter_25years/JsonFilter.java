package com.bridgelabz.json_data.practice_problems.parse_json_and_filter_only_those_records_where_age_greter_25years;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.List;
import java.util.stream.Collectors;

public class JsonFilter {
    
    // Method to filter users older than 25
    public static List<User> filterUsersByAge(String jsonString) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // Parse JSON string into a List of Users
            List<User> users = objectMapper.readValue(jsonString, new TypeReference<List<User>>() {});

            // Filter users where age > 25
            return users.stream()
                        .filter(user -> user.getAge() > 25)
                        .collect(Collectors.toList());

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


}
