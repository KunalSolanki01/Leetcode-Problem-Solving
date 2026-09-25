/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Deque<Node> q = new ArrayDeque<>();
        if(root==null) return null;
        Node ans = root;
        q.add(root);
        while(q.size()>0){
            int s = q.size();
            while(s-->0){
                root = q.poll();
                if(s>0) root.next = q.peek();
                if(root.left!=null) q.add(root.left);
                if(root.right!=null) q.add(root.right);
            }

        }
        return ans;
    }
}