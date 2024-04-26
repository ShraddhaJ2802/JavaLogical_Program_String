package com.bridgelab.stringlogicprg;
import java.io.*;
public class PalindromeCheck {
        public static void isPalindrome(String str)
        {
            String rev = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                rev = rev + str.charAt(i);
            }

            // Checking if both the strings are equal
            if (str.equals(rev)) {
                System.out.println("Entered string is a palindrome.");
            }
            else{
                System.out.println("Entered string  is not  a palindrome.");
            }
        }
        public static void main(String[] args)
        {
            // Input string
            String str = "madam";

            // Convert the string to lowercase
            str = str.toLowerCase();
             isPalindrome(str);
        }
    }

