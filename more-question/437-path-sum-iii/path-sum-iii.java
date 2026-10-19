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
    public int dfs(TreeNode root,int target,long sum){
        if(root==null) return 0;
        int count = 0;
        sum+=root.val;
        if(sum==target) count+=1;
        int a = dfs(root.left,target,sum);
        int b = dfs(root.right,target,sum);
        return count+a+b;
    }
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null) return 0;
        return pathSum(root.left,targetSum)+pathSum(root.right,targetSum)+dfs(root,targetSum,0);
    }
}