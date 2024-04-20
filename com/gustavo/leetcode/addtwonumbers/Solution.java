package com.gustavo.leetcode.addtwonumbers;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode();
    ListNode current = dummy;
    int carry = 0;

    while (l1 != null || l2 != null || carry != 0) {
      int val1 = 0, val2 = 0;

      if (l1 != null) val1 = l1.val;
      if (l2 != null) val2 = l2.val;

      int sum = val1 + val2 + carry;
      carry = sum / 10;
      current.next = new ListNode(sum % 10);

      if (l1 != null) l1 = l1.next;
      if (l2 != null) l2 = l2.next;
      current = current.next;

    }

    return dummy.next;
  }
}