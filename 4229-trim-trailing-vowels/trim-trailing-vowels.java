class Solution {
    public String trimTrailingVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i=sb.length()-1;i>=0;i--){
            if(sb.charAt(i)=='a' || sb.charAt(i)=='e' || sb.charAt(i)=='i' || sb.charAt(i)=='o' || sb.charAt(i)=='u'){
                sb.deleteCharAt(i);
            }
            else break;
        }
        return sb.toString();
    }
}