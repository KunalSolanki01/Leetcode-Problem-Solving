class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        char c = keysPressed.charAt(0);
        int dur = releaseTimes[0];
        for(int i=1;i<releaseTimes.length;i++){
            int cur = releaseTimes[i]-releaseTimes[i-1];
            char ch = keysPressed.charAt(i);
            if(dur<cur || (dur==cur && c<ch)){
                c = ch;
                dur = cur;
            }
        }
        return c;
    }
}