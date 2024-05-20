package ex09_palindromenumber;

public class Solution {
  public boolean isPalindrome(int x) {
    // First Solution
    // String dummy = Integer.toString(x);
    // for (int i = 0; i < dummy.length() / 2; i++) {
    //   if (dummy.charAt(i) != dummy.charAt(dummy.length() -i -1)) {
    //     return false;
    //   }
    // }


    // Second Solution
    if (x < 0) return false;

    int dummy = x;
    int numCompare = 0;

    while (dummy > 0) {
      int helper = dummy % 10;
      numCompare = numCompare * 10 + helper;
      dummy /= 10;
    }

    return numCompare == x;
  }
}
