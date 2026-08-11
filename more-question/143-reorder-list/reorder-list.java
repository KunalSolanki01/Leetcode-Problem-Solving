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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast !=null && fast.next!=null){
            slow = slow.next;
            fast= fast.next.next;
        }
        ListNode prev = null;
        ListNode temp = slow.next;
        slow.next = null;
        while(temp!=null){
            ListNode next = temp.next;
            temp.next=prev;
            prev = temp;
            temp = next;
        }
        ListNode h1 = head;
        ListNode h2 = prev;
        while(h2!=null){
            ListNode t1 = h1.next;
            ListNode t2 = h2.next;
            h1.next = h2;
            h2.next = t1;
            h1 = t1;
            h2=t2;
        }
 
    }
}