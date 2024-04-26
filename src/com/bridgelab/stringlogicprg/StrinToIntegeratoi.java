package com.bridgelab.stringlogicprg;

public class StrinToIntegeratoi {
    public int myAtoi(String s) {
        if (s == null || s.length() == 0)
            return 0;

        int index = 0, sign = 1, result = 0;
        // Skip leading whitespaces
        while (index < s.length() && s.charAt(index) == ' ')
            index++;

        // Check if there is a sign
        if (index < s.length() && (s.charAt(index) == '+' || s.charAt(index) == '-')) {
            sign = (s.charAt(index) == '-') ? -1 : 1;
            index++;
        }

        // Process digits
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';
            // Check for overflow
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + digit;
            index++;
        }

        return result * sign;
    }

    public static void main(String[] args) {
        StrinToIntegeratoi atoi = new StrinToIntegeratoi();
        String s = "42";
        System.out.println(atoi.myAtoi(s)); // Output: 42

        s = "   -42";
        System.out.println(atoi.myAtoi(s)); // Output: -42

        s = "4193 with words";
        System.out.println(atoi.myAtoi(s)); // Output: 4193

        s = "words and 987";
        System.out.println(atoi.myAtoi(s)); // Output: 0
    }
}
