package com.bridgelabz.json_data.practice_problems.create_json_object_for_a_students_fields;
import org.json.JSONArray;
import org.json.JSONObject;


public class CreateJSONObject {
    public static String createJSONObject(JSONObject student) {
        // Create a JSON array
        JSONArray array = new JSONArray();
        array.put(student);
        return array.toString(4);
    }
}
