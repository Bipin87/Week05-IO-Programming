package com.bridgelabz.json_data.hand_on_practice_problems.merge_two_json_files_into_a_single_json_object;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String file1Path = "src/main/java/com/bridgelabz/json_data/hand_on_practice_problems/merge_two_json_files_into_a_single_json_object/user.json";
        String file2Path = "src/main/java/com/bridgelabz/json_data/hand_on_practice_problems/merge_two_json_files_into_a_single_json_object/user_details.json";
        String outputPath = "src/main/java/com/bridgelabz/json_data/hand_on_practice_problems/merge_two_json_files_into_a_single_json_object/merge_file.json";

        // Merge JSON files
        ObjectNode mergedJson = JsonMerger.mergeJsonFiles(file1Path, file2Path);

        if (mergedJson != null) {
            System.out.println("Merged JSON: " + mergedJson);

            // Write merged JSON to a file
            try {
                ObjectMapper objectMapper = new ObjectMapper();
                objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(outputPath), mergedJson);
                System.out.println("Merged JSON saved to: " + outputPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Failed to merge JSON files.");
        }
    }
}
