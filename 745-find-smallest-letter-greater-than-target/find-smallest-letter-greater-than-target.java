class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        int l = 0; 
        int h = n-1;
        while(l <= h){
            int mid = l + (h-l)/2;
            if(letters[mid] <= target) l = mid+1;
            else h = mid-1;   
        }
        return letters[l % n];
    }
}