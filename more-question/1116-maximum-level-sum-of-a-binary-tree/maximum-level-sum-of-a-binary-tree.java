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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new ArrayDeque<>();
        int max = Integer.MIN_VALUE;
        int level = 0,ans = 0;
        if(root!=null) q.add(root);
        while(!q.isEmpty()){
            level++;
            int s = q.size();
            int sum = 0;
            while(s-->0){
                root = q.poll();
                if(root.left!=null) q.add(root.left);
                if(root.right!=null) q.add(root.right);
                sum+=root.val;
            }
            if(max<sum){
                max = sum;
                ans = level;
            }
        }
        return ans;
    }
}