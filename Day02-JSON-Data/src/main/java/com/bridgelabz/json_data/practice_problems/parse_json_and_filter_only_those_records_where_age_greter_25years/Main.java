package com.bridgelabz.json_data.practice_problems.parse_json_and_filter_only_those_records_where_age_greter_25years;

import java.util.List;

import static com.bridgelabz.json_data.practice_problems.parse_json_and_filter_only_those_records_where_age_greter_25years.JsonFilter.filterUsersByAge;

public class Main {
    public static void main(String[] args) {
        // Sample JSON data (array of users)
        String jsonData = "[{\"name\":\"Bipin\",\"age\":28,\"email\":\"bipin@example.com\"},"
                + "{\"name\":\"Deepraj\",\"age\":24,\"email\":\"deepraj@example.com\"},"
                + "{\"name\":\"Aman\",\"age\":27,\"email\":\"aman@example.com\"},"
                + "{\"name\":\"Durgesh\",\"age\":22,\"email\":\"durgesh@example.com\"}]";

        // Call method and get filtered users
        List<User> filteredUsers = filterUsersByAge(jsonData);

        // Print users older than 25
        System.out.println("Users older than 25:");
        filteredUsers.forEach(System.out::println);
    }
}
