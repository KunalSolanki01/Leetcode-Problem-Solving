class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int move1 = 0;
        int move2 = 0;
        int move3 = 0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='L') move1+=1;
            else if(moves.charAt(i)=='R') move2+=1; 
            else move3+=1;
        }
        return Math.max(Math.abs(move1+move3-move2),Math.abs(move2+move3-move1));
    }
}