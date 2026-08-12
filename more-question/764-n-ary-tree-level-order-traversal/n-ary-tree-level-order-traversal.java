/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<Node> q = new ArrayDeque<>();
        if(root!=null) q.add(root);
        while(!q.isEmpty()){
            int s = q.size();
            List<Integer> temp = new ArrayList<>();
            while(s-->0){
                root = q.poll();
                if(root.children!=null){
                    for(Node i:root.children){
                        q.add(i);
                    }
                }
                temp.add(root.val);
            }
            ans.add(temp);
        }
        return ans;
    }
}