package org.example;

/**
 * First Unique Character in a String
 */
public class Solution387 {
    public int firstUniqChar(String s) {
        int res = -1;
        int id;
        for(char c = 'a'; c <= 'z'; c++) {
            id = s.indexOf(c);
            if (id == -1) continue;
            if (id == s.lastIndexOf(c)) {
                if (res != -1) {
                    res = Math.min(id, res);
                } else {
                    res = id;
                }
            }
        }
        return res;
    }

    public int firstUniqChar2(String s) {
        int[] ids = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        for (int i = s.length() - 1; i >= 0; i--) {
            int charId = s.charAt(i) - 'a';
            if (ids[charId] == -1) {
                ids[charId] = i;
            } else {
                ids[charId] = -2;
            }
        }
        int min = -1;
        for (int id : ids) {
            if (id < 0) continue;
            if (min < 0) {
                min = id;
            } else if (id < min) {
                min = id;
            }
        }
        return min;
    }
}
