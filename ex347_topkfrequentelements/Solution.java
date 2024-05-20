package ex347_topkfrequentelements;

import java.util.HashMap;
import java.util.Map;

public class Solution {
  public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> dummy = new HashMap<>();

    for(int num: nums) {
      dummy.put(num, dummy.getOrDefault(num, 0) + 1);
    }

    System.out.println(dummy);

    return new int[]{1,2,3};
  }
}
