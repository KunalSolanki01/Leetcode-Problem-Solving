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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode helper(ListNode head,ListNode last){
        if(last==head) return null;
        ListNode mid = mid(head,last);
        TreeNode root = new TreeNode(mid.val);
        root.left = helper(head,mid);
        root.right = helper(mid.next,last);
        return root;
    }
    public ListNode mid(ListNode head,ListNode last){
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=last && fast.next!=last){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public TreeNode sortedListToBST(ListNode head) {
        return helper(head,null);
    }
}