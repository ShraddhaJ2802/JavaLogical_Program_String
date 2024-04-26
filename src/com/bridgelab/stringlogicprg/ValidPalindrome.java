package com.bridgelab.stringlogicprg;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s == null || s.isEmpty())
            return true;

        int left = 0, right = s.length() - 1;
        while (left < right) {
            char leftChar = Character.toLowerCase(s.charAt(left));
            char rightChar = Character.toLowerCase(s.charAt(right));

            // Move pointers to the next valid alphanumeric characters
            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(rightChar)) {
                right--;
                continue;
            }

            // Compare characters
            if (leftChar != rightChar)
                return false;

            // Move pointers
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        String s = "A man, a plan, a canal: Panama";
        System.out.println(validPalindrome.isPalindrome(s)); // Output: true

        s = "race a car";
        System.out.println(validPalindrome.isPalindrome(s)); // Output: false
    }

}
