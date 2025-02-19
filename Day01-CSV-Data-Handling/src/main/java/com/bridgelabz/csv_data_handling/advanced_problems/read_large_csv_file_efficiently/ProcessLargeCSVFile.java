package com.bridgelabz.csv_data_handling.advanced_problems.read_large_csv_file_efficiently;
import java.io.*;
import java.util.*;
public class ProcessLargeCSVFile {
    public static void processCSVInChunks(String filename, int chunkSize) {
        int totalRecordsProcessed = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            List<String[]> chunk = new ArrayList<>(chunkSize);
            boolean isHeader = true;

            while ((line = br.readLine()) != null) {
                // Skip header row if present
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                // Add each line to the chunk
                String[] data = line.split(",");
                chunk.add(data);

                // Process chunk when we reach the chunk size
                if (chunk.size() == chunkSize) {
                    totalRecordsProcessed += processChunk(chunk);
                    chunk.clear(); // Clear the chunk for the next set of records
                }
            }

            // Process any remaining records in the last chunk
            if (!chunk.isEmpty()) {
                totalRecordsProcessed += processChunk(chunk);
            }

            System.out.println("Total records processed: " + totalRecordsProcessed);

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
    public static int processChunk(List<String[]> chunk) {
        // Example processing: just count the records in the chunk
        System.out.println("Processing " + chunk.size() + " records...");
        return chunk.size();
    }
}
