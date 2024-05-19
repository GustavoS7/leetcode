package ex49_groupanagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
  public List<List<String>> groupAnagrams(String[] strs) {
    
    Map<String, List<String>> dummy = new HashMap<>();

    for (String s : strs) {
      char[] charS = s.toCharArray();
      Arrays.sort(charS);
      String helper = String.valueOf(charS);

      List<String> list = dummy.getOrDefault(helper, new ArrayList<>());

      list.add(s);
      dummy.put(helper, list);
    }
    
    return new ArrayList<>(dummy.values());
  }
}
