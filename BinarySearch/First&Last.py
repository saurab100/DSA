# class Solution(object):
#     def searchRange(self, nums, target):
#         def binarySearch(find):
#             left, right = 0, len(nums) - 1
#             output = -1
#
#             while left <= right:
#                 mid = (left + right) // 2
#
#                 if nums[mid] > target:
#                     right = mid - 1
#                 elif nums[mid] < target:
#                     left = mid + 1
#                 else:
#                     output = mid
#
#                     # This is the only modification to a standard binary search
#                     if find == 'first':  # To find the first occurence, look to the left
#                         right = mid - 1
#                     elif find == 'last':  # To find the last occurence, look to the right
#                         left = mid + 1
#
#             return output
#
#         return [binarySearch('first'), binarySearch('last')]
#
#
# aa = Solution()
# aa.searchRange([5,7,7,8,10],8)


class Solution(object):
    def valueEqualToIndex(self, arr, n):
        for i in range(0, n):
            if arr[i] == i+1:
                print( arr[i])


aa = Solution()
aa.valueEqualToIndex([15, 2, 45, 12, 7],5)