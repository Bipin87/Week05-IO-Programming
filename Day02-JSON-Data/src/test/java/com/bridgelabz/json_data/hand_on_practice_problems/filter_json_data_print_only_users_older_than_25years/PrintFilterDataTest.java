package com.bridgelabz.json_data.hand_on_practice_problems.filter_json_data_print_only_users_older_than_25years;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintFilterDataTest {
    @Test
    public void testPerform(){
        String filePath = "src/main/java/com/bridgelabz/json_data/hand_on_practice_problems/filter_json_data_print_only_users_older_than_25years/json_data.json";
        PrintFilterData.printFilterData(filePath);
        assertFalse(filePath.isEmpty());
        assertEquals("[{ \"name\": \"Sanjay Rajput\", \"age\": 26 }, { \"name\": \"Durgesh\", \"age\": 32 }, { \"name\": \"Deepraj\", \"age\": 45 }]",PrintFilterData.printFilterData(filePath));
    }

}