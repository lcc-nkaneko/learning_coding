/*
LeetCode
4. Median of Two Sorted Arrays
https://leetcode.com/problems/median-of-two-sorted-arrays/
*/

class Solution {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    List<Integer> list = new ArrayList<Integer>();

    for (int i : nums1) {
      list.add(i);
    }
    for (int i : nums2) {
      list.add(i);
    }
    Collections.sort(list);
    int startArrayNumber = list.get(0);
    int arrayLength = list.size();
    if (arrayLength < 2) {
      return startArrayNumber;
    }

    int reminder = arrayLength % 2;
    int medianIterator = (arrayLength / 2) - 1;
    if (reminder == 0) {
      double median;
      return median = (list.get(medianIterator) + list.get(medianIterator + 1)) / 2.0;
    } else {
      return list.get(medianIterator + 1);
    }
  }
}
