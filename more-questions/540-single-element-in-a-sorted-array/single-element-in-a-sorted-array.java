class Solution {
    public int singleNonDuplicate(int[] arr) {
        int n = arr.length;
        int l=0,h=n-1;
        int mid = 0;
        if(n==1) return arr[0];
        while(l<h){
            mid = l+(h-l)/2;
            if(mid%2!=0){
                mid--;
            }
            if(arr[mid]==arr[mid+1]) l = mid+2;
            else h = mid;
            // else{
            //     if(mid<n && arr[mid]==arr[mid+1]) l=mid+2;
            //     else h = mid;
            // }
        }
        return arr[h];
    }
}