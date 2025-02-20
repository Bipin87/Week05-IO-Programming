package com.bridgelabz.json_data.hand_on_practice_problems.generate_json_report_from_database_records;

public class Main {
    public static void main(String[] args) {
        String jsonReport = DatabaseToJsonReport.fetchDataAsJson();
        System.out.println("Generated JSON Report:\n" + jsonReport);

        // Save report to file
        String outputFile = "employee_report.json";
        DatabaseToJsonReport.writeJsonToFile(jsonReport, outputFile);
    }
}
