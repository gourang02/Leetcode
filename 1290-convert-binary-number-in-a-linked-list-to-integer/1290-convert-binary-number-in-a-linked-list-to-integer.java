/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {

        int sum = 0;
        ListNode p1 = head;

        while (p1 != null) {
            sum = sum * 2 + p1.val;
            p1 = p1.next;
        }

        return sum;
    }
}