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
    public ListNode partition(ListNode head, int x) {
        ListNode temp = head;
        ListNode ls = new ListNode(-1);
        ListNode gr = new ListNode(-1);
        ListNode l = ls;
        ListNode g = gr;
        while(temp!=null){
            if(temp.val<x){
                l.next = temp;
                l = l.next;
            }
            else{
                g.next = temp;
                g = g.next;
            }
            temp = temp.next;
        }
        l.next = gr.next;
        g.next = null;
        head = ls.next;
        return head;
    }
}