package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Find All Anagrams in a String
 */
public class Solution438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) {
            return result;
        }
        int[] pCounts = new int[26];
        int[] sCounts = new int[26];
        int count = 0;
        for (int i = 0; i < p.length(); i++) {
            pCounts[p.charAt(i) - 'a']++;
            sCounts[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < pCounts.length; i++) {
            if (pCounts[i] != sCounts[i]) {
                count++;
            }
        }
        if (count == 0) {
            result.add(0);
        }
        for (int i = 1; i <= s.length() - p.length(); i++) {
            int prev = s.charAt(i - 1) - 'a';
            int cur = s.charAt(i + p.length() - 1) - 'a';
            if (prev != cur) {
                sCounts[prev]--;
                if (pCounts[prev] == sCounts[prev]) {
                    count--;
                } else if (pCounts[prev] == sCounts[prev] + 1) {
                    count++;
                }
                sCounts[cur]++;
                if (pCounts[cur] == sCounts[cur]) {
                    count--;
                } else if (pCounts[cur] == sCounts[cur] - 1) {
                    count++;
                }
            }
            if (count == 0) {
                result.add(i);
            }
        }
        return result;
    }
}
