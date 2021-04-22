/*
LeetCode
5. Longest Palindromic Substring
https://leetcode.com/problems/longest-palindromic-substring/
*/

class Solution {
  public String longestPalindrome(String s) {
    String checkString = "";
    String ans = "";
    StringBuilder strb;

    for (int i = 0; i < s.length(); i++) {
      for (int j = i + 1; j < s.length(); j++) {
        if (s.charAt(i) == s.charAt(j)) {
          checkString = s.substring(i, j + 1);
          strb = new StringBuilder(checkString);
          if (ans.length() < checkString.length()) {
            if (checkString.equals(strb.reverse().toString())) {
              ans = checkString;
            }
          }
        }
      }
    }
    if (ans == "") {
      ans = String.valueOf(s.charAt(0));
    }
    return ans;
  }
}
