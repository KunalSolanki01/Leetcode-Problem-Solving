class Solution {
    public int rearrangeCharacters(String text, String target) {
        int[] achieve = makeStringtoArray(target);
        int[] adup = achieve.clone(); 
        int[] t1 = makeStringtoArray(text);
        int size = 0;
        int count = 0;
        while (true) {
            boolean wordFormed = true;
            for (int i = 0; i < 26; i++) {
                if (achieve[i] > 0) {
                    if (t1[i] >= achieve[i]) {
                        t1[i] -= achieve[i];
                    } else {
                        wordFormed = false; 
                        break;
                    }
                }
            }
            if (wordFormed) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }
    public int[] makeStringtoArray(String t1){
        int []arr = new int[26];
        for(char c:t1.toCharArray()){
            arr[c-'a']++;
        }
        return arr;
    }
}