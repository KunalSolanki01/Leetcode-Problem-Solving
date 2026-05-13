class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int ans = 0,max = 0;
        int n = tokens.length;
        int j=n-1;
        int i=0;
       while(i<=j){
            if(tokens[i]<=power){
                ans++;
                power-=tokens[i++];
                // max = Math.max(max,ans);
            }
            else if(ans>0){
                ans--;
                power+=tokens[j--];
            }
            else break;
            // System.out.print(power+" ");
            max = Math.max(max,ans);
        }
        return max;
    }
}