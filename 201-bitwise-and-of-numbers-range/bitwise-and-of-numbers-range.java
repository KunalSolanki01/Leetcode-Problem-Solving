class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        // int a=0;
        // while(left!=right){
        //     left>>=1;
        //     right>>=1;
        //     a+=1;
        // }
        // return left<<a;
        while(right>left){
            right = right&(right-1);
        }
        return right;
    }
}