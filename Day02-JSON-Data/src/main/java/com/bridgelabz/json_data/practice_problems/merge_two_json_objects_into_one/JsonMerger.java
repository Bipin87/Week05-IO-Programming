package com.bridgelabz.json_data.practice_problems.merge_two_json_objects_into_one;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonMerger {
    public static MergedPerson mergeJson(Person person, Address address) {
        return new MergedPerson(person.getName(), person.getAge(), address.getCity(), address.getCountry());
    }

    public static void main(String[] args) {
        try {
            // Create sample objects
            Person person = new Person("Bipin Kumar Sahu", 21);
            Address address = new Address("Bhopal", "INDIA");

            // Merge them
            MergedPerson mergedPerson = mergeJson(person, address);

            // Convert to JSON and print
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(mergedPerson);

            System.out.println("Merged JSON:\n" + jsonString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
