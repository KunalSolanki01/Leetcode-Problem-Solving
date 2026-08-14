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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode temp =head;
        int sum = 0;
        HashMap<Integer,ListNode> map = new HashMap<>();
        while(temp!=null){
            sum += temp.val;
            map.put(sum, temp);
            temp = temp.next;
        }
        if(map.containsKey(0)) {
            head = map.get(0).next;
        }
        temp = head;
        sum=0;
        while(temp != null) {
            sum += temp.val;
            temp.next = map.get(sum).next;
            temp = temp.next;
        }
        return head;
    }
}