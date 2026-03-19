class Solution(object):
    def finalElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n = len(nums)
        pre = nums[0]
        best = pre
        for i in range(1,n):
            pre = min(pre,nums[i]);
            best = max(best,pre)
        suf = nums[-1]
        best = max(best,suf)
        for i in range(n-2,-1,-1):
            suf = min(suf,nums[i])
            best = max(best,suf)
        return best
        # return max(nums[0],nums[-1])
        
        