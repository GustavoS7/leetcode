package ex26_removeduplicatesfromsortedarray;

public class Solution {
  public static int removeDuplicates(int[] nums) {
    int i = 0;
    for (int j = 1; j < nums.length; j++) {
      System.out.println("J " + j);
      System.out.println("I " + i);
      System.out.println("Numeros " + nums[i] +  " " + nums[j]);
      if (nums[i] != nums[j]) {
        i++;
        nums[i] = nums[j];
        System.out.println("Append " + nums[i]);
      }
    }

    System.out.println(nums);

    System.out.println(i);

    return i + 1;
  }

  public static void main(String[] args) {
    int[] nums = {1, 1, 2};

    removeDuplicates(nums);
  }
}
