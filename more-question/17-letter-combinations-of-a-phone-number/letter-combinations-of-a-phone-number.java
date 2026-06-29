class Solution {
    public List<String> letterCombinations(String digits) {
        String[] nums = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        helper(res,digits,nums,sb,0);
        return res;
    }
    public void helper(List<String> res,String digits,String[]nums,StringBuilder cur,int idx){
        if(idx==digits.length()){
            res.add(cur.toString());
            return;
        }
        String x = nums[digits.charAt(idx)-'2'];
        // System.out.print(x + " ");
        for(char c:x.toCharArray()){
            cur.append(c);
            helper(res,digits,nums,cur,idx+1);
            cur.deleteCharAt(cur.length()-1);
        }
    }
}