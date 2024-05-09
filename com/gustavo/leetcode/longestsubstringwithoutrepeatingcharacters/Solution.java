package com.gustavo.leetcode.longestsubstringwithoutrepeatingcharacters;

import java.util.HashMap;
import java.util.Map;

public class Solution {
  public static int lengthOfLongestSubstring(String s) {
    int max = 0;

    Map<Character, Integer> list = new HashMap<Character, Integer>();
    for (int i = 0, j = 0; i < s.length(); i++) {
      if (list.containsKey(s.charAt(i))) {
        j = Math.max(list.get(s.charAt(i)) + 1, j);
      }

      list.put(s.charAt(i), i);
      max = Math.max(max, i - j + 1);
    }

    return max;
  }

  public static void main(String[] args) {
    lengthOfLongestSubstring("sadsadsa");
  }
}
