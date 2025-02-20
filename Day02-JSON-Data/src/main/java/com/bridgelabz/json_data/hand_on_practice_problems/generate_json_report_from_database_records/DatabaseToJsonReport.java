package com.bridgelabz.json_data.hand_on_practice_problems.generate_json_report_from_database_records;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;
import java.io.FileWriter;
import java.sql.*;

public class DatabaseToJsonReport {

    // Database connection details
    private static final String URL = "C:\\Users\\bs410\\OneDrive\\Documents\\dumps\\Dump20250219";
    private static final String USER = "root";  // Change if needed
    private static final String PASSWORD = "Bipin@123";  // Change if needed

    // Fetch data from database and convert to JSON
    public static String fetchDataAsJson() {
        ObjectMapper objectMapper = new ObjectMapper();
        ArrayNode jsonArray = objectMapper.createArrayNode();

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM employees")) {

            while (rs.next()) {
                ObjectNode jsonObject = objectMapper.createObjectNode();
                jsonObject.put("id", rs.getInt("id"));
                jsonObject.put("name", rs.getString("name"));
                jsonObject.put("age", rs.getInt("age"));
                jsonObject.put("department", rs.getString("department"));
                jsonObject.put("salary", rs.getDouble("salary"));

                jsonArray.add(jsonObject);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Database error: " + e.getMessage());
        }

        try {
            return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonArray);
        } catch (Exception e) {
            throw new RuntimeException("Error converting to JSON: " + e.getMessage());
        }
    }

    // Write JSON data to a file
    public static void writeJsonToFile(String jsonData, String filePath) {
        try (FileWriter file = new FileWriter(filePath)) {
            file.write(jsonData);
            System.out.println("JSON Report saved to: " + filePath);
        } catch (Exception e) {
            throw new RuntimeException("Error writing JSON file: " + e.getMessage());
        }
    }


}
