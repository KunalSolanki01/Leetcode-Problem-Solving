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
    public void helper(TreeNode root,int target,List<List<Integer>> ans,List<Integer> temp,int sum){
        if(root==null) return;
        temp.add(root.val); 
        sum+=root.val;
        if(root.left==null && root.right==null){
            if(sum==target){
                ans.add(new ArrayList<>(temp));
            }
            temp.remove(temp.size()-1);
            return;
        }
        helper(root.left,target,ans,temp,sum);
        helper(root.right,target,ans,temp,sum);
        temp.remove(temp.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        List<Integer> temp = new ArrayList<>();
        helper(root,targetSum,ans,temp,0);
        return ans;
    }
}