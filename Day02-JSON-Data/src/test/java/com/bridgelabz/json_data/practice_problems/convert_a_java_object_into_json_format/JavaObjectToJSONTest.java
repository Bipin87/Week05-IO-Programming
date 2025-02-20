package com.bridgelabz.json_data.practice_problems.convert_a_java_object_into_json_format;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaObjectToJSONTest {
    @Test
    public void test(){
        Car car = new Car("BMW","X5",2023);
        String result = JavaObjectToJSON.convertInJSON(car);

        // test performs
        assertEquals("BMW",car.getBrand());
        assertEquals(2023,car.getYear());
        assertEquals(result,JavaObjectToJSON.convertInJSON(car));
    }

}