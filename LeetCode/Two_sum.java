/*
LeetCode
1. Two Sum
https://leetcode.com/problems/two-sum/
*/

package LeetCode;

import java.util.Arrays;

class Solution {
  public int[] twoSum(int[] nums, int target) {
    int[] resultArrays = new int[2];
    boolean isSoluted = false;
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if ((nums[i] + nums[j]) == target) {
          resultArrays[0] = i;
          resultArrays[1] = j;
          isSoluted = true;
          break;
        }
      }
      if (isSoluted) {
        break;
      }
    }
    return resultArrays;
  }
}

public class Two_sum {
  public static void main(String[] args) {
    int[] nums = { 2, 7, 11, 15 };
    int target = 9;

    Solution solution = new Solution();
    int[] result = solution.twoSum(nums, target);

    System.out.println("Input : nums = " + Arrays.toString(nums) + ", target = " + target);
    System.out.println("Output : " + Arrays.toString(result));
  }
}
