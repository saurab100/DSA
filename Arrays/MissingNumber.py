class Solution(object):
    def missingNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums.sort()
        #print(nums)
        d = {}
        # if len(nums) == 1:
        #     if nums[0] == 1:
        #         return 0
        #     else:
        #         return 1
#         n=len(nums)
#         for i in range(0, n):
#             if i != nums[i]:
#                 return i
#         return n
#
# aa = Solution()
# aa.missingNumber([9,6,4,2,3,5,7,0,1])
from collections import Counter

class Solution(object):
    def frequencySort(self, s):
        """
        :type s: str
        :rtype: str
        """
        d = Counter(s)
        print(d.most_common())
        t = ""
        sorted_d = sorted(d.items(), key=lambda x :x[1], reverse = True)
        for i, j in sorted_d.items():
            t += i*j
        return t


d = Counter("Aabb")
print(d.most_common())