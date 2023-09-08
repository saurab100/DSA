from collections import Counter
class Solution(object):
    def findPairs(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        count = 0
        for i in range(0, len(nums)):
            for j in range(1, len(nums)):
                print(nums[i],nums[j])
                if abs(nums[i] - nums[j]) == k and i < j:
                    count += 1
        print(count)
        # c = Counter(nums)
        # count = 0
        # if k == 0:
        #     for key, val in c.items():
        #         if val > 1:
        #             count += 1
        # else:
        #     for key, val in c.items():
        #         if key+k in c:
        #             count +=1
        # print(count)

aa = Solution()
aa.findPairs([3,2,1,5,4],2)