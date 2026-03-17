class Solution {
    public boolean check(String s,String r){
        s = s.toLowerCase();
        for(char c:s.toCharArray()){
            if(r.indexOf(c)==-1) return false;
        }
        return true;
    }
    public String[] findWords(String[] words) {
        List<String> arr = new ArrayList<>();
        String s1 = "qwertyuiop";
        String s2 = "asdfghjkl";
        String s3 = "zxcvbnm";
        for(int i=0;i<words.length;i++){
            if(check(words[i],s1)||check(words[i],s2)||check(words[i],s3)){
                arr.add(words[i]);
            }
        }
        return arr.toArray(new String[0]);
    }
}