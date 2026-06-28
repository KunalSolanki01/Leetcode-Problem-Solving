class Solution {
    public List<String> letterCombinations(String digits) {
        String[] nums = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> res = new ArrayList<>();
        helper(res,digits,nums,"",0);
        return res;
    }
    public void helper(List<String> res,String digits,String[]nums,String cur,int idx){
        if(idx==digits.length()){
            res.add(cur);
            return;
        }
        String x = nums[digits.charAt(idx)-'0'-2];
        System.out.print(x + " ");
        for(char c:x.toCharArray()){
            helper(res,digits,nums,cur+c,idx+1);
        }
    }
}