class Solution {
public:
    int rev(int num){
            int rev = 0;
            while(num!=0){
                rev = rev*10+num%10;
                num/=10;
            }
            return rev;
        }
    int mirrorDistance(int n) {
        return abs(n-rev(n));
    }
};