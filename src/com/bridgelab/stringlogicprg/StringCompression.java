package com.bridgelab.stringlogicprg;

public class StringCompression {
        public static String compressString(String s) {
            StringBuilder compressedString = new StringBuilder();
            int count = 1;

            // Iterate through the string, starting from the second character
            for (int i = 1; i < s.length(); i++) {
                // If the current character is the same as the previous one, increase the count
                if (s.charAt(i) == s.charAt(i - 1)) {
                    count++;
                } else {
                    // If the current character is different, add the previous character and its count to the compressed string
                    compressedString.append(s.charAt(i - 1)).append(count);
                    count = 1; // Reset count for the new character
                }
            }

            // Add the last character and its count
            compressedString.append(s.charAt(s.length() - 1)).append(count);

            // If the compressed string is longer than the original, return the original string
            if (compressedString.length() >= s.length()) {
                return s;
            } else {
                return compressedString.toString();
            }
        }

        public static void main(String[] args) {
            String inputString = "aabbbccccc";
            String compressedOutput = compressString(inputString);
            System.out.println(compressedOutput); // Output: "a2b3c4"
        }
    }
