class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        String s = "123456789";
        int min = String.valueOf(low).length();
        int max = String.valueOf(high).length();
        for(int len = min;len<=max;len++){
            for(int i=0;i<=9-len;i++){
                int temp = Integer.valueOf(s.substring(i,i+len));
                if(temp>=low && temp<=high) ans.add(temp);
            }
        }
        System.gc();
        return ans;
    }
}