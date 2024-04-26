package com.bridgelab.stringlogicprg;

public class ReverseWord {
    public String reverseWords(String s) {
        if (s == null || s.isEmpty())
            return "";

        // Split the string into words
        String[] words = s.split("\\s+");

        // Reverse the order of the words
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        ReverseWord reverseWords = new ReverseWord();
        String s = "the sky is blue";
        System.out.println(reverseWords.reverseWords(s)); // Output: "blue is sky the"

        s = "  hello world  ";
        System.out.println(reverseWords.reverseWords(s)); // Output: "world hello"

        s = "a good   example";
        System.out.println(reverseWords.reverseWords(s)); // Output: "example good a"
    }

}
