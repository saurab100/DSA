# class Solution(object):
#     def findDuplicate(self, nums):
#         """
#         :type nums: List[int]
#         :rtype: int
#         """
#         #n = nums[0]
#         for i in range(1, len(nums)):
#             n = nums[i-1]
#             if n in nums:
#                 print(n)
#
#
# aa = Solution()
# aa.findDuplicate([1,3,4,2,2])

# 88. Merge Sorted Array

class Solution(object):
    def merge(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        result = []
        for i in range(0, len(nums1)):
            for j in range(0, len(nums2)):
                if nums1[i] < nums2[j]:
                    result.append(nums1[i])
                else:
                    result.append(nums2[j])
        print(result)




aa = Solution()
aa.merge([1,2,3,7],[4,5,6])