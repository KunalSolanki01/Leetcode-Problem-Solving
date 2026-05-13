class Solution {
    public void sortColors(int[] arr) {
        // Arrays.sort(nums);
        int low=0, mid=0,high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==1) mid++;
            else if(arr[mid]==0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++;low++;
            }
            else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
}