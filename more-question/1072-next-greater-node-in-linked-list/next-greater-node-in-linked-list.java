/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> arr = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            arr.add(temp.val);
            temp = temp.next;
        } 
        int n = arr.size();        
        int[] nge = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) 
        {
            int current = arr.get(i);

            while (!stack.isEmpty() && stack.peek() <= current) 
            {
                stack.pop();
            }

            if (!stack.isEmpty()) 
            {
                nge[i] = stack.peek();
            } 
            else 
            {
                nge[i] = 0;
            }
            stack.push(current);
        }
        return nge;
    }
}