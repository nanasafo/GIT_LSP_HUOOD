package org.howard.edu.lsp.midterm.question1;

/**
 * This class provides methods for encrypting text.
 */
public class SecurityOps {
    /**
     * Encrypts the given text by writing all even-index characters followed by odd-index characters,
     * ignoring punctuation and whitespace.
     *
     * @param text The text to be encrypted.
     * @return The encrypted text.
     */
    public static String encrypt(String text) {
        // Remove whitespace and punctuation from the input text
        String cleanText = text.replaceAll("[\\s\\p{Punct}]", "");

        StringBuilder encryptedText = new StringBuilder();

        // Append even-index characters first
        for (int i = 0; i < cleanText.length(); i += 2) {
            encryptedText.append(cleanText.charAt(i));
        }

        // Append odd-index characters next
        for (int i = 1; i < cleanText.length(); i += 2) {
            encryptedText.append(cleanText.charAt(i));
        }

        return encryptedText.toString();
    }
}
