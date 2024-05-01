package com.gustavo.leetcode.mergetwosortedlist;

public class Solution {
  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode headNode = new ListNode();
    ListNode current = headNode;

    while (list1 != null && list2 != null) {
      if (list1.val < list2.val) {
        current.next = list1;
        list1 = list1.next;
      } else {
        current.next = list2;
        list2 = list2.next;
      }

      current = current.next;
    }

    while (list1 != null) {
      current.next = list1;
      list1 = list1.next;
      current = current.next;
    }

    while (list2 != null) {
      current.next = list2;
      list2 = list2.next;
      current = current.next;
    }

    return headNode.next;
  }
}
