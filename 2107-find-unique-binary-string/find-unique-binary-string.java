class Solution {
    public String findDifferentBinaryString(String[] nums) {
        List<String> arr = new ArrayList<>(Arrays.asList(nums));
        StringBuilder sb = new StringBuilder(nums[0]);
        int n = nums[0].length();
        for(int i=0;i<n;i++){
            sb.setCharAt(i,'0');
        }
        for(int i=0;i<arr.size();i++){
            if(!arr.contains(sb.toString())) return sb.toString();
            else{
                sb.setCharAt(n-i-1,'1');
            } 
        }
        return sb.toString();

        // StringBuilder sb = new StringBuilder();
        // for (int i = 0; i < nums.length; i++) {
        //     sb.append(nums[i].charAt(i) == '0' ? '1' : '0');
        // }
        // return sb.toString();
    }
}