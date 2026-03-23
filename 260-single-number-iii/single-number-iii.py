class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        a = []
        n = Counter(nums)
        for key,count in n.items():
            if count==1:
                a.append(key)
        return a