class Solution {
    public boolean isIsomorphic(String s, String t) {
        // int[] mapS = new int[256];
        // int[] mapT = new int[256];
        // for(int i = 0; i < s.length(); i++){
        //     char charS = s.charAt(i);
        //     char charT = t.charAt(i);
        //     if(mapS[charS] != mapT[charT]) return false;
        //     mapS[charS] = i+1;
        //     mapT[charT] = i+1;
        // }
        HashMap<Character,Character> m1 = new HashMap<>();
        HashMap<Character,Character> m2 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(m1.containsKey(c1)){
                if(m1.get(c1)!=c2) return false;
            }
            else m1.put(c1,c2);
            if(m2.containsKey(c2)){
                if(m2.get(c2)!=c1) return false;
            }
            else m2.put(c2,c1);
        }
        return true;
    }
}