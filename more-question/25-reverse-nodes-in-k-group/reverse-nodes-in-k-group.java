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
// class Solution {
//     public ListNode reverse(ListNode head){
//         ListNode temp = head;
//         ListNode prev = null;
//         ListNode next = null;
//         while(temp!=null){
//             next = temp.next;
//             temp.next = prev;
//             prev = temp;
//             temp = next;
//         }
//         return prev;
//     }
//     public ListNode reverseKGroup(ListNode head, int k) {
//         if(head==null || head.next==null || k==1) return head;
//         ListNode ans = head;

//     }
// }

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode temp = current.next; 
            current.next = prev; 
            prev = current; 
            current = temp; 
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null || k <= 0) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        while(curr != null){
           ListNode temp = curr;
           for(int i = 0; i < k; i++){
                temp = temp.next;
                if(temp == null) return dummy.next;
           }
           ListNode st = curr.next;
           ListNode nst = temp.next;
           temp.next = null;
           curr.next = reverseList(st);
           st.next = nst;
           curr = st;
        }
        return dummy.next;
    }
}