package com.bridgelabz.json_data.hand_on_practice_problems.convert_a_list_of_java_object_into_json_array;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ConvertListToJSONArrayTest {
    private List<Person>people;
    @BeforeEach
    public void setup(){
        // Create a list of Person objects
        people = Arrays.asList(
                new Person("Bipin Kumar Sahu", 21, "Rewa"),
                new Person("Deepraj", 19, "Bhopal"),
                new Person("Om Tiwari", 21, "Satna")
        );
    }
    @Test
    public void testPerform(){
        // Convert list to JSON array
        JSONArray jsonArray = JsonConverter.convertListToJsonArray(people);
        assertEquals(3,jsonArray.length());
        // Perform test in first person data
        JSONObject person = jsonArray.getJSONObject(0);
        assertNotEquals("Bipin", person.getString("name"));
        assertEquals(21, person.getInt("age"));
        assertEquals("Rewa", person.getString("city"));
    }

}