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
    TreeNode f = null;
    TreeNode s = null;
    TreeNode p = new TreeNode(Integer.MIN_VALUE);
    public void recoverTree(TreeNode root) {
        helper(root);
        int temp = f.val;
        f.val = s.val;
        s.val = temp;
    }
    void helper(TreeNode root){
        if(root==null) return;
        helper(root.left);
        if(f==null && root.val<p.val) f = p;
        if(f!=null && root.val<p.val) s = root;
        p = root;
        helper(root.right);
    }
}