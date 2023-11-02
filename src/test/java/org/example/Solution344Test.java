package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution344Test {

    @Test
    void reverseString1() {
        char[] s = new char[] {'h','e','l','l','o'};
        new Solution344().reverseString(s);
        assertArrayEquals(new char[] {'o','l','l','e','h'}, s);
    }

    @Test
    void reverseString2() {
        char[] s = new char[] {'H','a','n','n','a','h'};
        new Solution344().reverseString(s);
        assertArrayEquals(new char[] {'h','a','n','n','a','H'}, s);
    }
}