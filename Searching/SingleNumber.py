from collections import Counter

class Solution:
    def singleNonDuplicate(self, nums):
        lo, hi = 0, len(nums)-1
        while lo < hi:
            mid = lo+(hi-lo)//2
            print(nums[mid],nums[mid-1],mid%2)
            if nums[mid] == nums[mid-1]:  # duplicate found
                if mid%2:       # target > mid
                    lo = mid+1  # exclude second index mid; mid+1
                else:           # target < mid
                    hi = mid-2  # exclude first index mid-1; mid-1-1
            elif nums[mid] == nums[mid+1]:  # duplicate found
                if mid%2:       # target < mid
                    hi = mid-1  # exclude first index mid; mid-1
                else:           # target > mid
                    lo = mid+2  # exclude second index mid+1; mid+1+1
            else:  # no duplicate found, target == mid
                return nums[mid]
        return nums[lo]

aa = Solution()
aa.singleNonDuplicate([1,1,2,2,3,3,4,4,8])