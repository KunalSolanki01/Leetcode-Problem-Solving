class Solution:
    def fairCandySwap(self, aliceSizes: List[int], bobSizes: List[int]) -> List[int]:
        a = sum(aliceSizes)
        b = sum(bobSizes)
        dif = (b-a)//2
        c = set(bobSizes)
        for  i in aliceSizes:
            d = i+dif
            if d in c:
                return [i,d]
        return []