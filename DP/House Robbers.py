class Solution(object):
    def rob(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        N = len(nums)

        def travel(index):
            if index >= N:
                return 0
            robber = nums[index] + travel(index + 2)
            not_robber = travel(index + 1)
            return max(robber, not_robber)

        return travel(0)

aa = Solution()
aa.rob()