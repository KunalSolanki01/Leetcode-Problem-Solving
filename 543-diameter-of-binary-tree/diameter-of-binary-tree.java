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
    int dia = 0;
    public int height(TreeNode root){
        if(root==null) return 0;
        int lheight = height(root.left);
        int rheight = height(root.right);
        int myD = lheight+rheight+1;
        dia = Math.max(myD,dia);
        return Math.max(lheight,rheight)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        height(root);
        return dia-1;
    }
}