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
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp = new ListNode(0, head);
        ListNode a = temp, b = head;
        while (b!=null && b.next!=null) {
            a = a.next;
            b = b.next.next;
        }
        a.next = a.next.next;
        return temp.next;
    }
}