class Solution(object):
    def moveZeroes(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        j = 0
        for i in range(0, n-1):
            if nums[i] == 0:
                while j < n-1:
                    j = i+1
                    nums[i], nums[j] = nums[j], nums[i]
                    i += 1
                j = 0
        return nums

aa = Solution()
aa.moveZeroes([0,0,1])