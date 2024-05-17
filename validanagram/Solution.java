package validanagram;

import java.util.HashSet;

public class Solution {
  public boolean isAnagram (String s, String t) {

    HashSet<Character> dummy = new HashSet<>();

    for (int i = 0; i < s.length(); i++) {
      dummy.add(s.charAt(i));
    }

    for (int j = 0; j < t.length(); j++) {
      if (!dummy.contains(t.charAt(j))) {
        return false;
      }
    }

    return true;
  }
}
