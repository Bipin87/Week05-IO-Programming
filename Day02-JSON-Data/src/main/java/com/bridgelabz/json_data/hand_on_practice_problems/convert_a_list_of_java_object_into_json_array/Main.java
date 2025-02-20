package com.bridgelabz.json_data.hand_on_practice_problems.convert_a_list_of_java_object_into_json_array;

import org.json.JSONArray;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of Person objects
        List<Person> people = Arrays.asList(
                new Person("Bipin Kumar Sahu", 21, "Rewa"),
                new Person("Deepraj", 19, "Bhopal"),
                new Person("Om Tiwari", 21, "Satna")
        );

        // Convert list to JSON array
        JSONArray jsonArray = JsonConverter.convertListToJsonArray(people);

        // Print JSON output
        System.out.println(jsonArray.toString(4));
    }
}
