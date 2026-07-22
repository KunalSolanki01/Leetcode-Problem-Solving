class Solution {
    public int largestRectangleArea(int[] arr) {
        int max = -1;
        int n = arr.length;
        int []nse = nse(arr);
        int []pse = pse(arr);
        for(int i=0;i<n;i++){
            int area = (nse[i]-pse[i]-1)*arr[i];
            max = Math.max(max,area);
        }
        return max;
    }
    public int maximalRectangle(char[][] matrix) {
        int max = -1;
        int []arr = new int[matrix[0].length];
        for(char []chr:matrix){
            int n = chr.length;
            for(int i=0;i<n;i++){
                if(chr[i]=='0') arr[i] = 0;
                else arr[i]+=1;
            }
            max = Math.max(max,largestRectangleArea(arr));
        }
        return max;
    }
    public int[] pse(int []arr){
        Stack<Integer> pse = new Stack<>();
        int n = arr.length;
        int[]ans = new int[n];
        for(int i=0;i<n;i++){
            while(!pse.isEmpty() && arr[pse.peek()]>=arr[i]) pse.pop();
            if(pse.isEmpty()) ans[i] = -1;
            else ans[i] = pse.peek();
            pse.push(i);
        }
        return ans;
    }
    public int[] nse(int []arr){
        Stack<Integer> nse = new Stack<>();
        int n = arr.length;
        int[]ans = new int[n];
        for(int i=n-1;i>=0;i--){
            while(!nse.isEmpty() && arr[nse.peek()]>=arr[i]) nse.pop();
            if(nse.isEmpty()) ans[i] = n;
            else ans[i] = nse.peek();
            nse.push(i);
        }
        return ans;
    }
}