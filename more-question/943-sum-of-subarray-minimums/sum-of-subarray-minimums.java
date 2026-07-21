class Solution {
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
            while(!nse.isEmpty() && arr[nse.peek()]>arr[i]) nse.pop();
            if(nse.isEmpty()) ans[i] = n;
            else ans[i] = nse.peek();
            nse.push(i);
        }
        return ans;
    }
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int mod = 1000000007;
        int[] right = new int[n + 1];
        int[] left = new int[n + 1];
        int[] sum = new int[n + 1];
        for (int i = 0; i < n; ++i) {
            right[i + 1] = arr[i];
        }
        int res = 0;
        for (int i = 1; i <= n; i++) {
            int curr = right[i];
            int j = i - 1;

            while (right[j] >= curr) {
                j = left[j];
            }
            
            left[i] = j;
            sum[i] = sum[j] + curr * (i - j);
            res = (res + sum[i]) % mod;
        }
        return res;
        // long mod = 1000000007;
        // int n = arr.length;
        // long ans = 0;
        // int []nse = nse(arr);
        // int []pse = pse(arr);
        // for(int i=0;i<n;i++){
        //     ans = (ans+((((i-pse[i])*(nse[i]-i)%mod)*arr[i])%mod)%mod);
        // }
        // return (int)(ans%mod);
    }
}