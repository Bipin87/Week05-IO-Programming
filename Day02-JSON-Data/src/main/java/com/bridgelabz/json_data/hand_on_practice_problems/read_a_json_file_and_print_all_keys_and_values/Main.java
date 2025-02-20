package com.bridgelabz.json_data.hand_on_practice_problems.read_a_json_file_and_print_all_keys_and_values;


public class Main {
    public static void main(String[] args) {

        String filePath = "src/main/java/com/bridgelabz/json_data/hand_on_practice_problems/read_a_json_file_and_print_all_keys_and_values/read_json.csv";
        ReadJSONFile reader = new ReadJSONFile(filePath);
        reader.printJson();
    }
}
