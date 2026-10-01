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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        // dfs(root,ans);
        morris(root,ans);
        return ans;
    }
    public void morris(TreeNode root,List<Integer> ans){
        if(root == null) return;
        TreeNode cur = root;
        while(cur!=null){
            if(cur.left==null){
                ans.add(cur.val);
                cur = cur.right;
            }
            else{
                TreeNode temp = cur.left;
                while(temp.right!=null && temp.right!=cur) temp = temp.right;
                if(temp.right==null){
                    temp.right = cur;
                    cur = cur.left;
                }else{
                    temp.right = null;
                    ans.add(cur.val);
                    cur = cur.right;
                }
            }
        }
    }
    public void dfs(TreeNode root,List<Integer> ans){
        if(root==null) return;
        dfs(root.left,ans);
        ans.add(root.val);
        dfs(root.right,ans);
    }
}