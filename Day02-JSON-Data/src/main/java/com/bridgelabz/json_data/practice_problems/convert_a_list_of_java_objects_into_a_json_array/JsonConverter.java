package com.bridgelabz.json_data.practice_problems.convert_a_list_of_java_objects_into_a_json_array;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;

public class JsonConverter {
    // Converts a list of Person objects into a JSON array
    public static JSONArray convertListToJsonArray(List<Person> personList) {
        JSONArray jsonArray = new JSONArray();
        
        for (Person person : personList) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("name", person.getName());
            jsonObject.put("age", person.getAge());
            jsonObject.put("city", person.getCity());
            
            jsonArray.put(jsonObject);
        }
        
        return jsonArray;
    }
}
