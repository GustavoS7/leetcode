package com.gustavo.leetcode.containsduplicate;

import java.util.HashSet;

public class Solution {
  public boolean containsDuplicate (int[] nums) {
    HashSet<Integer> dummy = new HashSet<>();

    for (int num : nums) {
      if (dummy.contains(num)) {
        return true;
      }
      dummy.add(num);
    }

    return false;
  } 
}
