package com.gustavo.leetcode.validparentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
  public static boolean isValid(String s) {
    if (s.length() % 2 != 0 || s.length() == 0) return false;

    Map<Character, Character> romamNumbers = new HashMap<>();
    romamNumbers.put('[', ']');
    romamNumbers.put('{', '}');
    romamNumbers.put('(', ')');

    Stack<Character> stack = new Stack<Character>();
    
    for (char c : s.toCharArray()) {
      if (romamNumbers.containsKey(c)) {
        stack.push(c);
      } else {
        if (!stack.empty() && romamNumbers.get(stack.lastElement()) == c) {
          stack.pop();
        } else return false;
      }
    }

    return stack.isEmpty();
  }

  public static void main(String[] args) {
    Boolean result = isValid("(");

    System.out.println(result);
  }
}
// package com.gustavo.leetcode.validparentheses;

// import java.util.HashMap;
// import java.util.Map;
// import java.util.Stack;

// public class Solution {
//   public static boolean isValid(String s) {
//     if (s.length() % 2 != 0 || s.length() == 0) return false;

//     Map<Character, Character> romamNumbers = new HashMap<>();
//     romamNumbers.put('[', ']');
//     romamNumbers.put('{', '}');
//     romamNumbers.put('(', ')');

//     Stack<Character> stack = new Stack<Character>();
    
//     for (int i = 0; i < s.length(); i++) {
//       if (romamNumbers.containsKey(s.charAt(i))) {
//         stack.push(s.charAt(i));
//       } else {
//         if (!stack.empty() && romamNumbers.get(stack.lastElement()) == s.charAt(i)) {
//           stack.pop();
//         } else return false;
//       }
//     }

//     if (stack.size() == 0) return true;
//     else return false;
//   }

//   public static void main(String[] args) {
//     Boolean result = isValid("(");

//     System.out.println(result);
//   }
// }
