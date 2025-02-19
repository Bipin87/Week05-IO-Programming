package com.bridgelabz.csv_data_handling.advanced_problems.encrypt_and_decrypt_data;

import static com.bridgelabz.csv_data_handling.advanced_problems.encrypt_and_decrypt_data.EncryptAndDecryptCSV.readDecryptedCSV;
import static com.bridgelabz.csv_data_handling.advanced_problems.encrypt_and_decrypt_data.EncryptAndDecryptCSV.writeEncryptedCSV;

public class Main {
    public static void main(String[] args) {
        String filePath = "src/main/java/com/bridgelabz/csv_data_handling/advanced_problems/encrypt_and_decrypt_data/demo.csv";

        try {
            // Write encrypted data to CSV
            writeEncryptedCSV(filePath);

            // Read and decrypt data from CSV
            System.out.println("Decrypted employee data:");
            readDecryptedCSV(filePath);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
