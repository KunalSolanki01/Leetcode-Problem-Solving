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
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer, TreeNode> map = new HashMap<>();
        Set<Integer> child = new HashSet<>();
        for(int[] d: descriptions){
            int p = d[0];
            int c = d[1];
            int isLeft = d[2];
            map.putIfAbsent(p, new TreeNode(p));
            map.putIfAbsent(c, new TreeNode(c));
            TreeNode pNode = map.get(p);
            TreeNode cNode = map.get(c);
            if(isLeft == 1) pNode.left = cNode;
            else pNode.right = cNode;
            child.add(c);
        }
        for(int[]d : descriptions){
            int parent = d[0];
            if(!child.contains(parent)) return map.get(parent);
        }
        return null;
    }
}