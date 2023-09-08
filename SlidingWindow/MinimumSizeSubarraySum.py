class Solution(object):
    def minSubArrayLen(self, target, nums):
        i = 0
        j = 0
        n = len(nums)
        s = 0
        minSum = n + 1
        while j < n:
            s += nums[j]
            while s >= target:
                minSum = min(minSum, j - i + 1)
                s -= nums[i]
                i += 1
            j += 1
        return minSum if minSum <= len(nums) else 0

aa = Solution()
aa.minSubArrayLen(7,[2,3,1,2,4,3])