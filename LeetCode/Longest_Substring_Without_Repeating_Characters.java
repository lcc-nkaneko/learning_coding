/*
LeetCode
3. Longest Substring Without Repeating Characters
https://leetcode.com/problems/longest-substring-without-repeating-characters/
*/

class Solution {
  public int lengthOfLongestSubstring(String s) {
    if (s.equals("")) {
      return 0;
    }

    String[] splitOfS = s.split("");
    int nowLongChar = 1; // 最低１文字は確定しているため。
    for (int i = 0; i < splitOfS.length; i++) {
      int checkChar = 1; // 最低１文字は確定しているため。
      ArrayList<String> repeatList = new ArrayList<>();

      for (int j = i + 1; j < splitOfS.length; j++) {
        if (splitOfS[i].equals(splitOfS[j])) {
          break;
        }
        if (repeatList.contains(splitOfS[j])) {
          break;
        }
        repeatList.add(splitOfS[j]);
        checkChar++;
      }

      if (nowLongChar < checkChar) {
        nowLongChar = checkChar;
      }
    }
    return nowLongChar;
  }
}

public class Longest_Substring_Without_Repeating_Characters {

}
