package com.bridgelabz.json_data.ipl_and_censor_analyzer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
class IPLDataProcessor {
    private final TeamCensor teamCensor = new TeamCensor();
    
    public List<Map<String, Object>> readJson(String filePath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(new File(filePath), new TypeReference<>() {});
    }

    public void writeJson(List<Map<String, Object>> data, String filePath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(filePath), data);
    }

    public List<Map<String, Object>> applyCensorship(List<Map<String, Object>> data) {
        return data.stream().map(match -> {
            match.put("team1", teamCensor.censorTeamName((String) match.get("team1")));
            match.put("team2", teamCensor.censorTeamName((String) match.get("team2")));
            match.put("winner", teamCensor.censorTeamName((String) match.get("winner")));
            match.put("player_of_match", "REDACTED");
            return match;
        }).collect(Collectors.toList());
    }

    public List<String[]> readCsv(String filePath) throws IOException {
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            return reader.readAll();
        } catch (CsvException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeCsv(List<String[]> data, String filePath) throws IOException {
        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
            writer.writeAll(data);
        }
    }

    public List<String[]> applyCensorshipToCsv(List<String[]> data) {
        List<String[]> result = new ArrayList<>();
        result.add(data.get(0)); // Keep headers
        
        for (int i = 1; i < data.size()-1; i++) {
            String[] row = data.get(i);
            row[1] = teamCensor.censorTeamName(row[1]); // team1
            row[2] = teamCensor.censorTeamName(row[2]); // team2
            row[5] = teamCensor.censorTeamName(row[5]); // winner
            row[6] = "REDACTED"; // player_of_match
            result.add(row);
        }
        return result;
    }
}