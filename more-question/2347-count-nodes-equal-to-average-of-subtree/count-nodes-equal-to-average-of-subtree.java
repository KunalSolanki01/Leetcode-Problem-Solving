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
    int a = 0;

    public int averageOfSubtree(TreeNode r) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(r);

        while (!q.isEmpty()) {
            TreeNode n = q.poll();

            if (n == null)
                continue;

            int s = sum(n);
            int c = count(n);

            if (s / c == n.val)
                a++;

            q.add(n.left);
            q.add(n.right);
        }

        return a;
    }

    int sum(TreeNode r) {
        if (r == null)
            return 0;

        return r.val + sum(r.left) + sum(r.right);
    }

    int count(TreeNode r) {
        if (r == null)
            return 0;

        return 1 + count(r.left) + count(r.right);
    }
}