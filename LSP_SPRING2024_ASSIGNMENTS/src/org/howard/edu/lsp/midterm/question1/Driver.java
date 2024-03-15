package org.howard.edu.lsp.midterm.question1;

/**
 * This class contains the main method to test the encryption functionality.
 */
public class Driver {
    /**
     * The main method to test the encryption functionality.
     *
     * @param args The command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Input text
        String inputText = "I love CSCI363";

        // Encrypt the input text
        String encryptedText = SecurityOps.encrypt(inputText);

        // Display the original and encrypted texts
        System.out.println("Original text: " + inputText);
        System.out.println("Encrypted text: " + encryptedText);
    }
}
