package com.bridgelabz.json_data.hand_on_practice_problems.read_a_json_file_and_print_all_keys_and_values;

import org.json.JSONObject;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

public class ReadJSONFile {
    // Attribute
    private String filePath;

    // Parameterized constructor
    public ReadJSONFile(String filePath) {
        this.filePath = filePath;
    }

    // Reads the JSON file and prints all keys and values
    public void printJson() {
        try {
            String content = new String(Files.readAllBytes(Paths.get(filePath)));
            JSONObject jsonObject = new JSONObject(content);
            printJsonObject(jsonObject);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    // JSON object throw print key-value pairs
    private void printJsonObject(JSONObject jsonObject) {
        Iterator<String> keys = jsonObject.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            Object value = jsonObject.get(key);
            System.out.println(key + ": " + value);
        }
    }
}
