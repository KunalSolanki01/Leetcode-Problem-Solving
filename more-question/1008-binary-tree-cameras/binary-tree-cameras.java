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
    int min;
    public int minCameraCover(TreeNode root) {
        min = 0;
        if(helper(root)==0) min++;
        // helper(root);
        // if(min==0) min++;
        return min;
    }
    public int helper(TreeNode root){
        if(root == null) return 2;
        int l = helper(root.left);
        int r = helper(root.right);
        if(l==0 || r==0){
            min++;
            return 1;
        }
        if(l==1 || r==1){
            return 2;
        }
        return 0;
    }
}