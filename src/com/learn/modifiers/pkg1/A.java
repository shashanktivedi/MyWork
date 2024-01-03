package com.learn.modifiers.pkg1;

import java.util.HashMap;
import java.util.Map;

public class A {
    public static void main(String[] args) {
        String st = "Shashank Trivedi";
        String s = st.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();
        int count =0;
        System.out.println(s.toCharArray());

        for (char c : s.toCharArray()) {
            // Check if the character is a letter (a-z)
            if (Character.isLetter(c)) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        int maxFrequency = 0;
        for (int frequency : map.values()) {
            if (frequency > maxFrequency) {
                maxFrequency = frequency; 
            }
        }

        System.out.print("Most common letter(s): ");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxFrequency) { count++;
                System.out.print(entry.getKey() + " ");
                System.out.println("count: "+ count);
            }
        }
    }
}

