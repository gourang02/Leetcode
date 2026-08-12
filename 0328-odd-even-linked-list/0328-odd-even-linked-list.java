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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode curr=head;
        ListNode prev=head.next;
        ListNode evenhead=prev;
        
        while(prev!=null && prev.next!=null ){
            curr.next=prev.next;
            curr=curr.next;
            prev.next=curr.next;
            prev=prev.next;
        }
        curr.next=evenhead;
        return head;
    }
}