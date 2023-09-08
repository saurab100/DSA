class Solution(object):
    def search(self, nums, target):
        l = 0
        r = len(nums) - 1
        while l <= r:
            mid = (l + r) // 2
            if nums[mid] == target:
                return mid
            elif nums[l] <= nums[mid]:
                if target >= nums[l] and target <= nums[mid]:
                    r = mid - 1
                else:
                    l = mid + 1
            else:
                if target >= nums[mid] and target <= nums[r]:
                    l = mid + 1
                else:
                    r = mid - 1
        return -1
aa = Solution()
aa.search([3,4,5,1,2],2)

# class Solution(object):
#     def mySqrt(self, x):
#         """
#         :type x: int
#         :rtype: int
#         """
#         l = 0
#         r = x
#         while l <= r:
#             mid = (l + r) / 2
#             if mid * mid <= x:
#                 l = mid + 1
#                 ans = mid
#             else:
#                 r = mid - 1
#         return ans
#
# aa = Solution()
# aa.mySqrt(16)