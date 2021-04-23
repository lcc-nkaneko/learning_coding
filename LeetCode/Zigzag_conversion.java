/*
LeetCode
6. ZigZag Conversion
https://leetcode.com/problems/zigzag-conversion/
*/

class Solution {
  public String convert(String s, int numRows) {
    if (numRows == 1) {
      return s;
    }

    int num = numRows + numRows - 2;
    List<String> beforeMergeArray = new ArrayList<String>();
    Map<Integer, Integer> addedChar = new HashMap<Integer, Integer>();
    for (int i = 0; i < numRows; i++) {
      for (int j = i; j < s.length(); j += num) {
        beforeMergeArray.add(String.valueOf(s.charAt(j)));
        addedChar.put(j, j);
        if ((i > 0) && ((i < numRows - 1))) {
          if ((addedChar.getOrDefault((j + num - i * 2), -1) == -1) && (j + num - i * 2) < s.length()) {
            beforeMergeArray.add(String.valueOf(s.charAt((j + num - i * 2))));
            addedChar.put((j + num - i * 2), (j + num - i * 2));
          }
        }
      }
    }
    String ans = String.join("", beforeMergeArray);
    return ans;
  }
}
