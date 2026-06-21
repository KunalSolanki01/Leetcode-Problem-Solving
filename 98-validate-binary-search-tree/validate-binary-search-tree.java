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
    public boolean isValidBST(TreeNode root) {
        return isBST(root,Long.MAX_VALUE,Long.MIN_VALUE);
    }
    public boolean isBST(TreeNode root,Long max,Long min){
        if(root==null) return true;
        if(root.val<=min || root.val>=max) return false;
        return isBST(root.left,(long)root.val,min) && isBST(root.right,max,(long)root.val);
    }
}