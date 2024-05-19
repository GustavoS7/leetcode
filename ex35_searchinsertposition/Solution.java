package ex35_searchinsertposition;

public class Solution {
  public int searchInsert(int[] nums, int target) {
    int first = 0;
    int last = nums.length - 1;
    int midpoint = Math.floorDiv(first + last, 2);

    while (first <= last) {
      midpoint = Math.floorDiv(first + last, 2);
      if (nums[midpoint] == target) {
        return midpoint;
      } else if (nums[midpoint] > target) {
        last = midpoint - 1;
      } else {
        first = midpoint + 1;
      }
    }

    return first;
  }
}
