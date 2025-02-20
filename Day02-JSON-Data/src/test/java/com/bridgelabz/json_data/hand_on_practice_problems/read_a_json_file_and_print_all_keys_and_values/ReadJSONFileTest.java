package com.bridgelabz.json_data.hand_on_practice_problems.read_a_json_file_and_print_all_keys_and_values;

import org.json.JSONObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ReadJSONFileTest {
    private static final String TEST_FILE = "test.json";
    private ReadJSONFile readJSONFile;

    @BeforeEach
    void setUp() throws IOException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "Aman");
        jsonObject.put("age", 23);
        jsonObject.put("city", "Pune");

        try (FileWriter file = new FileWriter(TEST_FILE)) {
            file.write(jsonObject.toString());
        }

        readJSONFile = new ReadJSONFile(TEST_FILE);
    }

    @Test
    void testPrintJson() throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(TEST_FILE)));
        JSONObject jsonObject = new JSONObject(content);

        Map<String, Object> expected = new HashMap<>();
        expected.put("name", "Aman");
        expected.put("age", 23);
        expected.put("city", "Pune");

        Map<String, Object> actual = new HashMap<>();
        Iterator<String> keys = jsonObject.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            actual.put(key, jsonObject.get(key));
        }

        assertEquals(expected, actual);
    }
}
