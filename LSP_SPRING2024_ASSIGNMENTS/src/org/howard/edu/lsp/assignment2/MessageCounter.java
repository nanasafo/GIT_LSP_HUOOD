/**
 * Name: Nana Yaw Afum Osafo

 * Graduate Student, PhD 
 */

package org.howard.edu.lsp.assignment2;

import java.io.*;
import java.util.*;

public class MessageCounter {
    private static final String Message= "src/org/howard/edu/lsp/assignment2/words.txt"; 
 // Input file "words.txt" should be in the same folder as the java files in assignment2 folder
    

    public static void main(String[] args) {
        try {
            Set<String> trivialWords = TrivialEvent.generateTrivialWords();
            Map<String, Integer> wordCount = new HashMap<>();

            // Re-read the input file to count non-trivial words
            try (BufferedReader reader = new BufferedReader(new FileReader(Message))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] words = line.toLowerCase().split("\\W+"); // Split based on non-word characters
                    for (String word : words) {
                        if (!word.isEmpty() && !trivialWords.contains(word) && word.matches("[a-z]+")) {
                            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                        }
                    }
                }
            }

            // Display Word Count
            System.out.println("\nWord Frequencies Output:");
            System.out.println("========================");
            wordCount.forEach((key, value) -> System.out.println(key + ": " + value));

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

      
		
		
		
