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
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        int lh = height(root.left,true);
        int rh = height(root.right,false);
        if(lh==rh) return (1<<(lh+1))-1;
        return 1+countNodes(root.left)+countNodes(root.right);
    }
    public int height(TreeNode root,boolean flag){
        if(flag){
            if(root==null) return 0;
            int lh = 0;
            while(root!=null){
                lh++;
                root = root.left;
            }
            return lh;
        }
        if(root==null) return 0;
        int lh = 0;
        while(root!=null){
            lh++;
            root = root.right;
        }
        return lh;
    }
}