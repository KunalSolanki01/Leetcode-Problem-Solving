class Solution:
    def firstUniqueEven(self, nums: list[int]) -> int:
        f = Counter(nums)
        for i in nums:
            if i%2==0:
                if f[i]==1:
                    return i
        return -1