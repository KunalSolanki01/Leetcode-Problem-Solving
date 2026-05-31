class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        int n = asteroids.length;
        long x = mass;
        for(int i=0;i<n;i++){
            if(asteroids[i]<=x){
                x+=asteroids[i];
            }else{
                return false;
            }
        }
        return true;
    }
}