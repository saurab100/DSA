class Solution(object):
    def subsets(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        res = []
        out = []
        n = len(nums)

        def solve(nums, out, i):
            if i < 0:
                res.append(out)
                return
            solve(nums, out, i - 1)
            solve(nums, out + [nums[i]], i - 1)

        solve(nums, out, n - 1)
        return res