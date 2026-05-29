class Solution {
    public int mySqrt(int x) {
        long  l = 0,h=x;
        int c=0;
        while(l<=h){
            long mid = l+(h-l)/2;
            long target = mid*mid;
            if(x==target) return (int)mid;
            else if(x>target) l = mid+1;
            else h = mid-1;


            c++;
        }
        
        System.out.print(c);
        return (int)h;
        // return(int) Math.sqrt(x);
    }
}