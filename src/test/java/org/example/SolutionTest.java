package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void solutionTest() {
        Solution.ListNode head = new Solution.ListNode(3);
        head.next = new Solution.ListNode(2);
        head.next.next = new Solution.ListNode(0);
        head.next.next.next = new Solution.ListNode(-4);
        head.next.next.next.next = head.next;
        Solution solution = new Solution();
        boolean result = solution.hasCycle(head);
        assertTrue(result);
    }

    @Test
    void solutionTest2() {
        Solution.ListNode head = new Solution.ListNode(1);
        head.next = new Solution.ListNode(2);
        head.next.next = head;
        Solution solution = new Solution();
        boolean result = solution.hasCycle(head);
        assertTrue(result);
    }

    @Test
    void solutionTest3() {
        Solution.ListNode head = new Solution.ListNode(1);
        Solution solution = new Solution();
        boolean result = solution.hasCycle(head);
        assertFalse(result);
    }
}