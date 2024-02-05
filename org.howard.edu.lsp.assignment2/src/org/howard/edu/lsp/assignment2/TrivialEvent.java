/**
 * Name: Nana Yaw Afum Osafo

 * Graduate Student, PhD 
 */

package org.howard.edu.lsp.assignment2;

import java.io.*;
import java.util.*;

public class TrivialEvent {
	private static final String Message= "src/org/howard/edu/lsp/assignment2/words.txt"; 
	// Generate Trivial Words from input file based on the given criteria 

    public static Set<String> generateTrivialWords() throws IOException {
        Set<String> trivialWords = new HashSet<>();
       // Map<String, Integer> wordFrequencies = new HashMap<>();

        // Read the input file and count word frequencies
        try (BufferedReader reader = new BufferedReader(new FileReader(Message))) {
            String line;
            System.out.println("Input File, words.txt:");
            System.out.println("=====================");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                String[] words = line.toLowerCase().split("\\W+"); // Split based on non-word characters
                for (String word : words) {
                    if (!word.isEmpty() && word.matches("[a-z]+") && word.length() <= 3) {
                        trivialWords.add(word);
                    }
                }
            }
        }

        // Display Trivial Words
        System.out.println("\nGenerate Trivial Words from the input file:");
        System.out.println("=============================================");
        trivialWords.forEach(System.out::println);

        return trivialWords;
    }

}
