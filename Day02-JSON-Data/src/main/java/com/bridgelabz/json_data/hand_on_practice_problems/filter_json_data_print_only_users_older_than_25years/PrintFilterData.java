package com.bridgelabz.json_data.hand_on_practice_problems.filter_json_data_print_only_users_older_than_25years;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class PrintFilterData {

    public static String printFilterData(String filePath){
        try {
            // Read JSON file
            ObjectMapper objectMapper = new ObjectMapper();
            List<Users> users = objectMapper.readValue(new File(filePath), new TypeReference<List<Users>>() {});

            // Filter users older than 25
            List<Users> filteredUsers = users.stream()
                    .filter(user -> user.getAge() > 25)
                    .collect(Collectors.toList());

            return filteredUsers.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Users less than 25 years";
    }

}
