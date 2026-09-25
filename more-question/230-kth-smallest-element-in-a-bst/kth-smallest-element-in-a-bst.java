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
    int ans = 0;
    int count = 0;
    public void helper(TreeNode root){
        if(root==null) return;
        helper(root.left);
        count--;
        if(count==0){
            ans = root.val;
            return;
        }
        if(count>0) helper(root.right);
        
    }
    public int kthSmallest(TreeNode root, int k) {
        count = k;
        helper(root);
        return ans;
    }
}