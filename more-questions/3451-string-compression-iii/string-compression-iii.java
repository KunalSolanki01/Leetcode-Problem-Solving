class Solution {
    public String compressedString(String word) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i=0;i<word.length()-1;i++){
            if(word.charAt(i)==word.charAt(i+1)){
                if(count==9){
                    sb.append(9);
                    sb.append(word.charAt(i));
                    count = 0;
                }
                count++;
            }
            else{
                sb.append(count);
                sb.append(word.charAt(i));
                count = 1;
            }
        } 
        sb.append(count);
        sb.append(word.charAt(word.length()-1));
        return sb.toString();  
    }
}