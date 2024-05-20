package ex01_twosum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> dummy = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      if (dummy.containsKey(target - nums[i])) {
        return new int[]{dummy.get(target - nums[i]), i};
      }
      dummy.put(nums[i],i);
    }

    return null;
  }
}
