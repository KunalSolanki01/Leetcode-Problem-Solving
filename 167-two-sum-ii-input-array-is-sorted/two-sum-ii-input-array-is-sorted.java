class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int []arr = new int[2];
        for(int i = 1; i<numbers.length;i++){
            for(int j = i;j<numbers.length;j++){
                if(numbers[j]+numbers[j-i] == target){
                    arr[0] = j-i+1;
                    arr[1] = j+1;
        return arr;
                }
            }
        }
        return null;
    }
}