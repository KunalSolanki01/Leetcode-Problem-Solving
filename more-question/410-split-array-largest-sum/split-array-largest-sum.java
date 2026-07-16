class Solution {
    public boolean isP(int []nums,int k,int mid){
        // int count = 1;
        // int cur = 0;
        // for(int i:nums){
        //     if(i>mid) return false;
        //     else if(i+cur<=mid){
        //         cur+=i;
        //     }
        //     else{
        //         count++;
        //         cur=i;
        //     }
        // }
        int count = 0,cur = 0;
        for(int i:nums){
            // System.out.print(cur+" ");
            if(cur<i){
                count++;
                cur = mid;
            }
            cur-=i;
        }
        // System.out.println();
        // System.out.println(count);
        return count<=k;
    }
    public int splitArray(int[] nums, int k) {
        int l = 0,h = 0;
        for(int i:nums){ h+=i; l = Math.max(l,i);}
        while(l<=h){
            int mid = l+(h-l)/2;
            if(isP(nums,k,mid)){ 
                h = mid-1;
            }
            else l = mid+1;
        }
        return l;
    }
}