package com.bridgelabz.json_data.hand_on_practice_problems.merge_two_json_files_into_a_single_json_object;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.File;
import java.io.IOException;

public class JsonMerger {

    // Method to merge two JSON files
    public static ObjectNode mergeJsonFiles(String filePath1, String filePath2) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // Read both JSON files into ObjectNode
            ObjectNode json1 = (ObjectNode) objectMapper.readTree(new File(filePath1));
            ObjectNode json2 = (ObjectNode) objectMapper.readTree(new File(filePath2));

            // Merge json2 into json1
            json1.setAll(json2);

            return json1;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
