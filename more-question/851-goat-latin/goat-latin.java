class Solution {
    public String toGoatLatin(String sentence) {
        String[] arr = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        StringBuilder a = new StringBuilder();
        a.append("maa");
        for(String s:arr){
            if("aeiouAEIOU".indexOf(s.charAt(0))!=-1){
                sb.append(s);
            }
            else{
                sb.append(s.substring(1));
                sb.append(s.charAt(0));
            }
            sb.append(a);
            sb.append(" ");
            a.append("a");
        }
        sb.deleteCharAt(sb.length()-1);
        System.gc();
        return sb.toString();
    }
}