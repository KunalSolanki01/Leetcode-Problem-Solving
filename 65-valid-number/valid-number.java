class Solution {
    public boolean isNumber(String s) {
        boolean point = false;
        boolean e = false;
        boolean num = false;
        boolean numE = true;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c>='0' && c<='9'){
                num = true;
                numE = true;
            }
            else if(c=='.'){
                if(e||point) return false;
                point = true;
            }
            else if(c=='e' || c=='E'){
                if(e||!num) return false;
                numE = false;
                e = true;
            }
            else if(c=='-' || c=='+'){
                if(i!=0 && s.charAt(i-1)!='e' && s.charAt(i-1)!='E') return false;
            }
            else return false;
        }
        return num && numE;
    }
}