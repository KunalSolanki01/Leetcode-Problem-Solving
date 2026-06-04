class Solution {
    public int totalWaviness(int num1, int num2) {
        if(num2<=100) return 0;
        int ans = 0;
        for(int i=num1;i<=num2;i++){
            char []arr = String.valueOf(i).toCharArray();
            for(char j=1;j<arr.length-1;j++){
                if(arr[j-1]>arr[j] && arr[j+1]>arr[j]) ans++;
                if(arr[j-1]<arr[j] && arr[j+1]<arr[j]) ans++;
            }
        }
        return ans;
    }
}