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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
         int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = -1;
            }
        }
        int sr = 0;
        int er = m - 1;
        int sc = 0;
        int ec = n - 1;
        ListNode curr = head;
        while (sr <= er && sc <= ec && curr != null) {
            for (int i = sc; i <= ec && curr != null; i++) {
                matrix[sr][i] = curr.val;
                curr = curr.next;
            }
            sr++;
            for (int i = sr; i <= er && curr != null; i++) {
                matrix[i][ec] = curr.val;
                curr = curr.next;
            }
            ec--;       
            if (sr <= er) {
                for (int i = ec; i >= sc && curr != null; i--) {
                    matrix[er][i] = curr.val;
                    curr = curr.next;
                }
                er--;
            }   
            if (sc <= ec) {
                for (int i = er; i >= sr && curr != null; i--) {
                    matrix[i][sc] = curr.val;
                    curr = curr.next;
                }
                sc++;
            }
        }
        return matrix;
    }
}