package com.gustavo.leetcode.removeelement;

public class Solution {
  public static int removeElement(int[] nums, int val) {
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != val) {
        nums[count] = nums[i];
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    int [] arr = {0,0,1,2,3,0};

    removeElement(arr, 0);
  }
}
