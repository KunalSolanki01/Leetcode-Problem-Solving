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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode n1 = ans;
        int carry = 0;
        while((l1!=null) || (l2!=null)){
            int val1 = 0,val2 = 0;
            if(l1!=null) val1 = l1.val;
            if(l2!=null) val2 = l2.val;
            int sum = val1+val2+carry;
            carry=sum/10;
            n1.next = new ListNode(sum%10);
            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;
            n1 = n1.next;
        }
        if(carry==1) n1.next = new ListNode(1);
        return ans.next;
    }
}