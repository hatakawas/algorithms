package com.example.algorithms.leetcode;

/**
 * Created on Nov 04, 2021.
 *
 * @author hatakawas
 */
public class P0002AddTwoNumbers {
    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head, tail;
        head = tail = new ListNode(0);
        int carry = 0;
        int value = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            if (carry != 0) {
                sum += carry;
            }
            carry = sum / 10;
            value = sum % 10;
            tail.next = new ListNode(value);
            tail = tail.next;
        }
        return head.next;
    }
}


