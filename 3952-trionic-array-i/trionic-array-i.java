class Solution {
    public boolean isTrionic(int[] arr) {
        int n = arr.length;
        int p = 0;
        while(p<n-1 && arr[p]<arr[p+1]) p++;
        if(p==0 || p==n-1) return false;
        int q = p;
        while(q<n-1 && arr[q]>arr[q+1]) q++;
        if(p==q || q==n-1) return false;
        for(int i=q;i<n-1;i++){
            if(arr[i]>=arr[i+1]) return false;
        }
        return true;
    }
}
