package com.bridgelabz.json_data.practice_problems.create_json_object_for_a_students_fields;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CreateJSONObjectTest {
    @Test
    public void testPerform(){
        // Create a JSON Object for student1
        JSONObject student1 = new JSONObject();
        student1.put("Name","Bipin Kumar Sahu");
        student1.put("Age",21);
        student1.put("Subjects",new JSONArray(Arrays.asList("Maths","Java","JavaScript")));
        String result = CreateJSONObject.createJSONObject(student1);
        assertEquals(result,CreateJSONObject.createJSONObject(student1));
    }

}