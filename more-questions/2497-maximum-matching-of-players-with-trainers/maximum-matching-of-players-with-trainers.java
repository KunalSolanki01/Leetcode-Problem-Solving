class Solution {
    public int matchPlayersAndTrainers(int[] g, int[] s) {
        int count=0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0,j=0;
        while(i<s.length && j<g.length){
            if(s[i]>=g[j]){
                i++;
                j++;
                count++;
            }
            else i++;
        }
        return count;
    }
}