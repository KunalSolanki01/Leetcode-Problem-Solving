class Solution {
    public boolean isPerfectSquare(int num) {
        long l = 0,h = num;
        while(l<=h){
            long mid = l+(h-l)/2;
            long t = mid*mid;
            if(num==t) return true;
            else if(num>t) l = mid+1;
            else h = mid-1;
        }
        return false;
        // if(num >= 0){
        //     int a = (int)Math.sqrt(num);
        //     return (a*a == num);
        // }
        // return false;
    }
}