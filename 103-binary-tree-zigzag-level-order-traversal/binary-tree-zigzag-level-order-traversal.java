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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) {
            return ans;
        }
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        boolean l=true;
        while(q.size()>0){
            int size = q.size();
            List<Integer> cur = new ArrayList<>();
            while(size-->0){
                root = q.remove();
                if(l){
                   cur.add(root.val);
                }
                else cur.addFirst(root.val);
                if(root.left!=null) q.add(root.left);
                if(root.right!=null) q.add(root.right);
                
                // cur.add(root.val);
            }
            ans.add(cur);
            l=!l;
        }
        return ans;
    }
}