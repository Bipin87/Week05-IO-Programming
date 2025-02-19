package com.bridgelabz.json_data.practice_problems.create_json_object_for_a_students_fields;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create a JSON Object for student1
        JSONObject student1 = new JSONObject();
        student1.put("Name","Bipin Kumar Sahu");
        student1.put("Age",21);
        student1.put("Subjects",new JSONArray(Arrays.asList("Maths","Java","JavaScript")));

        // Create a JSON Object for student2
        JSONObject student2 = new JSONObject();
        student2.put("Name","Abhinav");
        student2.put("Age",45);
        student2.put("Subjects",new JSONArray(Arrays.asList("Maths","Java","JavaScript")));


        // Call the method
        String result = CreateJSONObject.createJSONObject(student1);
        String result1= CreateJSONObject.createJSONObject(student2);
        // Display outputs
        System.out.println(result);
        System.out.println(result1);
    }
}
