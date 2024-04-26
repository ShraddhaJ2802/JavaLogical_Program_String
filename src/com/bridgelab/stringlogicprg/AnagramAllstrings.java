package com.bridgelab.stringlogicprg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramAllstrings {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || p == null || p.length() == 0 || s.length() < p.length())
            return result;

        Map<Character, Integer> pFreq = new HashMap<>();
        for (char c : p.toCharArray()) {
            pFreq.put(c, pFreq.getOrDefault(c, 0) + 1);
        }

        int windowStart = 0, matched = 0;
        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            char rightChar = s.charAt(windowEnd);
            if (pFreq.containsKey(rightChar)) {
                pFreq.put(rightChar, pFreq.get(rightChar) - 1);
                if (pFreq.get(rightChar) == 0)
                    matched++;
            }

            if (matched == pFreq.size())
                result.add(windowStart);

            if (windowEnd >= p.length() - 1) {
                char leftChar = s.charAt(windowStart);
                if (pFreq.containsKey(leftChar)) {
                    if (pFreq.get(leftChar) == 0)
                        matched--;
                    pFreq.put(leftChar, pFreq.get(leftChar) + 1);
                }
                windowStart++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        AnagramAllstrings anagramsInString = new AnagramAllstrings  ();
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(anagramsInString.findAnagrams(s, p)); // Output: [0, 6]
    }
}
