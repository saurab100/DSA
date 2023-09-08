class Solution(object):
    def findMin(self, nums):

        if len(nums) == 1:
            return nums[0]
        l = 0
        r = len(nums) - 1
        if nums[r] > nums[0]:
            return nums[0]
        while l <= r:
            mid = (l + r) // 2
            if nums[mid] > nums[mid + 1]:
                return nums[mid + 1]
            if nums[mid - 1] > nums[mid]:
                return nums[mid]
            if nums[mid] > nums[0]:
                l = mid + 1
            else:
                r = mid - 1

aa = Solution()
aa.findMin([11,12,15,18,2,5,6,8])