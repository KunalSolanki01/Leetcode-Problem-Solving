class Solution {
    public String reformatDate(String date) {
        String []mon = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String []arr = date.split(" ");
        StringBuilder sb = new StringBuilder();
        sb.append(arr[2]);
        sb.append("-");
        for(int i=0;i<12;i++){
            if(arr[1].equals(mon[i])){
                if(i<9){
                    sb.append("0");
                }
                sb.append(String.valueOf(i+1));
                sb.append("-");
            }
        }
        if(Character.isDigit(arr[0].charAt(1))){
            sb.append(arr[0].charAt(0));
            sb.append(arr[0].charAt(1));
        }
        else{ 
            sb.append("0");
            sb.append(arr[0].charAt(0));
        }
        return sb.toString();
    }
}