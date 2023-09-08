from collections import Counter

class Solution(object):
    def majority(self,nums):
        # count = 0
        # x = None
        # for num in nums:
        #     if count == 0:
        #         x = num
        #     count += (1 if num == x else -1)
        # return x

        nums = set(nums)
        sorted(nums)
        print(nums)

aa = Solution()
aa.majority([3,1,4,1,5])



