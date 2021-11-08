package com.example.algorithms.leetcode;

/**
 * Created on Nov 05, 2021
 *
 * @author hatakawas
 */
public class P0019RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = null; // 目标节点
        ListNode prev = null;
        int i = 1;
        while (fast != null) {
            fast = fast.next;
            i++;
            if (i + 1 - n > 0) {
                if (slow == null) {
                    slow = head;
                } else {
                    prev = slow;
                    slow = slow.next;
                }
            }
        }
        if (slow == null) {
            return head;
        }
        if (prev == null) {
            return slow.next;
        } else {
            prev.next = slow.next;
            return head;
        }
    }
}


