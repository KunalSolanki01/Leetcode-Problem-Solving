class Solution {
public:
    vector<int> fairCandySwap(vector<int>& aliceSizes, vector<int>& bobSizes) {
        int suma = 0, sumb=0;
        vector<int> arr;
        for(int i:aliceSizes) suma+=i;
        for(int i:bobSizes) sumb+=i;
        for(int i=0;i<aliceSizes.size();i++){
            for(int j=0;j<bobSizes.size();j++){
                if(suma-aliceSizes[i]+bobSizes[j]==sumb-bobSizes[j]+aliceSizes[i]){
                    // arr[0] = aliceSizes[i];
                    // arr[1] = bobSizes[j];
                    arr.push_back(aliceSizes[i]);
                    arr.push_back(bobSizes[j]);
                    return arr;
                }
            }
        }
        return arr;
    }
};