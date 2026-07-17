class Solution {
    boolean isP(int[] arr,int k,int mid){
        int cur = 1;
        int prev = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-prev>=mid){
                cur++;
                prev = arr[i];
            }
        }
        return cur>=k;
    }
    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int n = price.length;
        int l = 0,h = price[n-1]-price[0];
        while(l<=h){
            int mid = l+(h-l)/2;
            if(isP(price,k,mid)) l = mid+1;
            else h = mid-1;
        }
        return h;
    }
}