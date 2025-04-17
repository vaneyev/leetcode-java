package org.example;

/**
 * Merge k Sorted Lists
 */
public class Solution23 {
    public ListNode mergeTwoLists(ListNode first, ListNode second) {
        if (first == null) {
            return second;
        }
        if (second == null) {
            return first;
        }
        if (first.val < second.val) {
            first.next = mergeTwoLists(first.next, second);
            return first;
        } else {
            second.next = mergeTwoLists(first, second.next);
            return second;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        return divideAndMerge(lists, 0, lists.length - 1);
    }

    public ListNode divideAndMerge(ListNode[] lists, int left, int right) {
        if (left == right) {
            return lists[left];
        }
        int mid = (left + right) / 2;
        ListNode l1 = divideAndMerge(lists, left, mid);
        ListNode l2 = divideAndMerge(lists, mid + 1, right);
        return mergeTwoLists(l1, l2);
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
}

