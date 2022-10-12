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
    ListNode newHead = null;
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode prev = null, curr = head, next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
        // reverse(head);
        // return newHead;
    }
    public void reverse(ListNode curr){
        if(curr == null) return;
        if(curr.next == null){
            newHead = curr;
                return;
        }
        reverse(curr.next);
        curr.next.next = curr;
        curr.next = null;
    }
}