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
        long mod = 1000000007;
        int n = arr.length;
        long ans = 0;
        int []nse = nse(arr);
        int []pse = pse(arr);
        for(int i=0;i<n;i++){
            ans = (ans+((((i-pse[i])*(nse[i]-i)%mod)*arr[i])%mod)%mod);
        }
        return (int)(ans%mod);
    }
}