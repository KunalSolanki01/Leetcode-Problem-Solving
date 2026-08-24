class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int []fr = new int[2002];
        for(int i:arr) fr[i+1000]++; 
        Arrays.sort(fr);
        for(int i=0;i<2001;i++)
        {
            if(fr[i]==fr[i+1] && fr[i]!=0) return false;
        }
        return true;
    }
}