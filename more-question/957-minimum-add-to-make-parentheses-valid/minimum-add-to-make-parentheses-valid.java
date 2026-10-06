class Solution {
    public int minAddToMakeValid(String s) {
        int size = 0,count = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='(') size++;
            else{
                size--;
                if(size<0){
                    count++;
                    size = 0;
                }
            }
        }
        return size+count;
    }
}