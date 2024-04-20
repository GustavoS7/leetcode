package com.gustavo.leetcode.romamtointeger;

import java.util.HashMap;
import java.util.Map;

public class Solution {
  public int romamToInt(String s) {
    Map<Character, Integer> romamNumbers = new HashMap<>();
    romamNumbers.put('I', 1);
    romamNumbers.put('V', 5);
    romamNumbers.put('X', 10);
    romamNumbers.put('L', 50);
    romamNumbers.put('C', 100);
    romamNumbers.put('D', 500);
    romamNumbers.put('M', 1000);

    int size = s.length() - 1;
    int previousValue = 0;
    int total = 0;
    
    for (int i = size; i >= 0; i--) {
      int value = romamNumbers.get(s.charAt(i));

      if (value < previousValue) {
        total -= value;
      } else {
        total += value;
      }

      previousValue = value;
    }

    return total;
  }

  public static void main(String[] args) {
    String teste = "HEY";
    System.out.println(teste.charAt(0));
  }
}
