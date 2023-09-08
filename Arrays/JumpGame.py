class Solution(object):
    def canJump(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        reachable = 0
        last = len(nums) - 1
        for i in range(len(nums)):
            if i > reachable:
                return False
            if nums[i] + i > reachable:
                reachable = nums[i] + i
            if reachable >= last:
                return True

aa = Solution()
aa.canJump([1,1,2,5,2,1,0,0,1,3])