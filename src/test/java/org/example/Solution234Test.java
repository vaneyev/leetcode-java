package org.example;

import org.example.Solution234.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution234Test {

    @Test
    void isPalindrome1() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        boolean output = new Solution234().isPalindrome(head);
        assertTrue(output);
    }

    @Test
    void isPalindrome2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        boolean output = new Solution234().isPalindrome(head);
        assertFalse(output);
    }

    @Test
    void isPalindrome3() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(0);
        head.next.next = new ListNode(0);
        boolean output = new Solution234().isPalindrome(head);
        assertFalse(output);
    }

}