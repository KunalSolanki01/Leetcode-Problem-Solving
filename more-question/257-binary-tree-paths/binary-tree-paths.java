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
    public void helper(TreeNode root, List<String> ans, String sb){
        if(root==null) return;
        if(root.left==null && root.right==null){
            sb = sb+Integer.toString(root.val);
            ans.add(sb.substring(0,sb.length()));
            return;
        }
        helper(root.left,ans,sb+Integer.toString(root.val)+"->");
        helper(root.right,ans,sb+Integer.toString(root.val)+"->");
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        if(root==null) return ans;
        helper(root,ans,"");
        return ans;
    }
}