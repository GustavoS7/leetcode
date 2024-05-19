package ex242_validanagram;

import java.util.Arrays;
// import java.util.HashMap;
// import java.util.Map;

public class Solution {
  public static boolean isAnagram (String s, String t) {
    if (s.length() != t.length()) return false;

    char[] charS = s.toCharArray();
    char[] charT = t.toCharArray();

    Arrays.sort(charS);
    Arrays.sort(charT);

    return Arrays.equals(charS, charT);

    // Map<Character, Integer> dummy = new HashMap<>();

    // for (int i = 0; i < s.length(); i++) {
    //   char ch = s.charAt(i);
    //   dummy.put(ch, dummy.getOrDefault(ch, 0) + 1);
    // }

    // for (int j = 0; j < t.length(); j++) {
    //   char ch = t.charAt(j);
    //   if (!dummy.containsKey(ch) || dummy.get(ch) == 0) {
    //     return false;
    //   }
    //   dummy.put(ch, dummy.get(ch) - 1);
    // }

    // return true;
  }

  public static void main(String[] args) {
    isAnagram("aa", "a");
  }
}
