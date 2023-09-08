# class Solution(object):
#     def findKthLargest(self, nums, k):
#         minHeap = []
#         for i in range(k):
#             minHeap.append(nums[i])
#
#         for i in range(k, len(nums)):
#             minHeap.sort()
#             if (minHeap[0] > nums[i]):
#                 continue
#             else:
#                 minHeap.pop(0)
#                 minHeap.append(nums[i])
#         return min(minHeap)
#
# aa = Solution()
# aa.findKthLargest([-12, 11, -13, -5, 6, -7, 5, -3, -6],4)


class Solution(object):
    def kthSmallest(self, arr, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        n = len(arr)
        maxHeap = []
        for i in range(0, k):
            maxHeap.append(arr[i])

        for i in range(k, n):
            maxHeap.sort(reverse=True)
            if maxHeap[0] < arr[i]:
                continue
            else:
                maxHeap.pop(0)
                maxHeap.append(arr[i])
        print(max(maxHeap))


aa = Solution()
aa.kthSmallest([7, 10, 4, 20, 15],4)


