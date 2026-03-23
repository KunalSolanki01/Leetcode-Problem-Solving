class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        n = Counter(nums)
        for key,count in n.items():
            if count==1:
                return key
        return -1