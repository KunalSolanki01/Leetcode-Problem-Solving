class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        StringBuilder sb = new StringBuilder();
        HashMap<String,String> map = new HashMap<>();
        for(int i=0;i<knowledge.size();i++){
            map.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                int st = i+1;
                while(s.charAt(i)!=')') i++;
                String temp = s.substring(st,i);
                System.out.println(temp);
                if(map.containsKey(temp)){
                    sb.append(map.get(temp));
                }else sb.append("?");
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}