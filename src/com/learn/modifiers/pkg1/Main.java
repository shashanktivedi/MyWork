package com.learn.modifiers.pkg1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String input = "Dilipp";
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Convert the string to lowercase to make it case-insensitive
        input = input.toLowerCase();

        // Loop through each character in the string
        for (char c : input.toCharArray()) {
            // Check if the character is a letter
            if (Character.isLetter(c)) {
                // Update the count in the map
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }

        // Find the most common character(s) and their count(s)
        int maxCount = 0;
        char mostCommonChar = '\0';

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostCommonChar = entry.getKey();
            }
        }

        System.out.println("Most common character: " + mostCommonChar);
        System.out.println("Count: " + maxCount);
    }
}

