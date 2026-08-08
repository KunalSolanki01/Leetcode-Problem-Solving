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
    public ListNode insertionSortList(ListNode head) {
        ListNode temp = new ListNode(0);

        while (head != null) {
            ListNode next = head.next;
            ListNode curr = temp;

            while (curr.next != null && curr.next.val < head.val) {
                curr = curr.next;
            }

            head.next = curr.next;
            curr.next = head;
            head = next;
        }

        return temp.next;
    }
}