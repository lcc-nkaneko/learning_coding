class Solution {
  public int reverse(int x) {
    Boolean isNegative = false;
    int ans = x;
    if (0 == x) {
      return 0;
    }
    if (0 > x) {
      isNegative = true;
      ans = x * -1;
    }
    String s = String.valueOf(ans);
    ArrayList<String> list = new ArrayList<String>();

    for (int i = s.length() - 1; i >= 0; i--) {
      list.add(String.valueOf(s.charAt(i)));
    }
    String test = String.join("", list);
    try {
      ans = Integer.parseInt(test);
    } catch (NumberFormatException e) {
      return 0;
    }
    if (isNegative == true) {
      return ans * -1;
    }
    return ans;
  }
}
