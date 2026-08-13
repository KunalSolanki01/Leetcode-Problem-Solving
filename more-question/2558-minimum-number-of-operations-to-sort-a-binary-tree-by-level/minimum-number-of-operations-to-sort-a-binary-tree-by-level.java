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
    public int minimumOperations(TreeNode root) {
        int sum = 0;
        Queue<TreeNode> q = new ArrayDeque<>();
        if(root!=null) q.add(root);
        while(!q.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            int s = q.size();
            while(s-->0){
                root = q.poll();
                if(root.left!=null) q.add(root.left);
                if(root.right!=null) q.add(root.right);
                temp.add(root.val);
            }
            sum+=(helper(temp));
        }
        return sum;
    }
    int helper(List<Integer> temp){
        int n = temp.size();
        int [][]arr = new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0] = temp.get(i);
            arr[i][1] = i;
        }
        Arrays.sort(arr,(a,b)-> Integer.compare(a[0],b[0]));
        int count = 0;
        boolean []flag = new boolean[n];
        for(int i=0;i<temp.size();i++){
            if(flag[i] || arr[i][1]==i) continue;
            int cy = 0;
            int j = i;
            while(!flag[j]){
                flag[j] = true;
                j = arr[j][1];
                cy++;
            }
            count+=(cy-1);
        }
        return (count);
    }
}