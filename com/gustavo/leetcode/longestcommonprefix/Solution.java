package com.gustavo.leetcode.longestcommonprefix;

public class Solution {
  public String longestCommonPrefix(String[] strs) {
    int i = 0;
    
    String needle = strs[0];

    if (strs.length == 1) {
      return needle;
    }

    while (i < strs.length && needle.length() != 0) {
      String equal = "";
      int j = 0;
      while (j < needle.length() && j < strs[i].length()) {
        if (needle.charAt(j) == strs[i].charAt(j)) {
          equal += needle.charAt(j);
        } else {
          break;
        }
        j++;
      }
      needle = equal;
      i++;
    }

    return needle;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    String[] strs = {"ab", "a"};
    System.out.println(solution.longestCommonPrefix(strs));
  }
}
