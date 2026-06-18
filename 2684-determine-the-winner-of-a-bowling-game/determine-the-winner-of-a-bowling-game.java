class Solution {
    public int score(int []arr){
        int score = 0;
        for(int i=0;i<arr.length;i++){
            if((i>=1 && arr[i-1]==10) || (i>=2 && arr[i-2]==10)) score+=(arr[i]*2);
            else score+=arr[i];
        }
        return score;
    }
    public int isWinner(int[] player1, int[] player2) {
        int p1 = score(player1);
        int p2 = score(player2);
        if(p1>p2) return 1;
        if(p1<p2) return 2;
        return 0;
    }
}