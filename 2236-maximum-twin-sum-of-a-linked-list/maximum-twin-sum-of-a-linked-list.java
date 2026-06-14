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
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null;
        ListNode cur = slow;
        while(cur!=null){
            ListNode nextNode = cur.next;
            cur.next= prev;
            prev=cur;
            cur=nextNode;
        }
        int sum = 0;
        ListNode first = head;
        ListNode second = prev;
        while(second!=null){
            sum = Math.max(sum,first.val+second.val);
            first=first.next;
            second=second.next;
        }
        return sum;
    }
}