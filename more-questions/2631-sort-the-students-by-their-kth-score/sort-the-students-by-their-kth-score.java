class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score,(a,b)->b[k]-a[k]);
        // int [][]arr = new int[score.length][score[0].length];
        // for(int i=0;i<score.length;i++){
        //     for(int j=0;j<score[0].length;j++){
        //         arr[i][j]=score[i][j];
        //     }
        // }
        return score;
    }
}