/*
LeetCode
2. Add Two Numbers
https://leetcode.com/problems/add-two-numbers/
*/

package LeetCode;

import java.util.*;

/*
Definition for singly-linked list.
public class ListNode {
  int val;
  ListNodenext;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val,ListNode next) { this.val = val; this.next = next; }
}
*/

class Solution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    int l1IntValue = ListNodeToInt(l1);
    int l2IntValue = ListNodeToInt(l2);
    int resultIntValue = l1IntValue + l2IntValue;
    return new ListNode(resultIntValue);

  }

  public int ListNodeToInt(ListNode node) {
    int nodeValue = 0;
    int digitUp = 10;

    for (int i = 0; i < node.size(); i++) {
      nodeValue = nodeValue * digitUp;
      nodeValue = nodeValue + node.get(i);
    }
    return nodeValue;
  }

}
