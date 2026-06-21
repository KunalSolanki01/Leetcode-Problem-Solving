import java.math.*;
class Solution {
    public BigInteger fac(int n){
        BigInteger ans = BigInteger.ONE;
        for(int i=2;i<=n;i++){
            ans=ans.multiply(BigInteger.valueOf(i));
        }
        return ans;
    }
    public int numTrees(int n) {
        return (fac(2*n).divide(fac(n+1).multiply(fac(n)))).intValue();
    }
}