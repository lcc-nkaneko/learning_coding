/*
LeetCode
８. String to Integer (atoi)
https://leetcode.com/problems/string-to-integer-atoi/

*/

class Solution {
  public int myAtoi(String s) {

    Boolean isNegative = false;
    s = s.trim();

    if (s.isEmpty()) {
      return 0;
    }

    if (s.charAt(0) == '-') {
      isNegative = true;
      s = s.substring(1);
    } else if (s.charAt(0) == '+') {
      s = s.substring(1);
    }

    long num = digitsLong(s);

    if (isNegative == true) {
      num = num * -1;
    }

    if (num > Integer.MAX_VALUE) {
      num = Integer.MAX_VALUE;
    }
    if (num < Integer.MIN_VALUE) {
      num = Integer.MIN_VALUE;
    }
    return (int) num;

  }

  public long digitsLong(String s) {
    String digits = "";
    Boolean startZero = true;
    for (int i = 0; i < s.length(); i++) {
      if (Character.isDigit(s.charAt(i))) {
        if (s.charAt(i) == '0' && digits.length() == 0) {
          continue;
        }
        digits = digits + String.valueOf(s.charAt(i));
        continue;
      } else {
        break;
      }
    }
    // int型の最大値より一桁多い数値までが対象のため11としている。
    if (digits.length() > 11) {
      digits = digits.substring(0, 11);
    }
    if (digits.isEmpty()) {
      return 0;
    }
    return Long.parseLong(digits);
  }
}
