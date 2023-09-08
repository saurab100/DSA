from collections import Counter
from collections import defaultdict
from heapq import heapify,heappush,heappop


# result= Counter(string)
# key = result.get
# print(str(key))
# result= max(result, key=result.get)
# test_str= "pppppppghhhijeuupffe"
# all_freq = {}
# for i in test_str:
#     if i in all_freq:
#         all_freq[i] += 1
#     else:
#         all_freq[i] = 1
# print(all_freq.get)
# res = max(all_freq, key = all_freq.get)
#
# print("Most frequent character: ",res)

#2
# class Solution(object):
#     def mostCommonWord(self, paragraph, banned):
#         """
#         :type paragraph: str
#         :type banned: List[str]
#         :rtype: str
#         """
#         dict1 = {}
#         for x in paragraph:
#             dict1[x] = 1
#         for x in banned:
#             if x not in dict1.keys():
#
#                 print(set(x))
#                 del dict1[x]
#
# aa = Solution()
# aa.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", "hit")


#class Solution(object):
    # def countWords(self, words1, words2):
    #     """
    #     :type words1: List[str]
    #     :type words2: List[str]
    #     :rtype: int
    #     """
    #     counter = 0
    #     d = {}
    #     c = {}
    #     for x in words1:
    #         if x in d:
    #             d[x] += 1
    #         else:
    #             d[x] = 1
    #     for x in words2:
    #         if x in c:
    #             c[x] += 1
    #         else:
    #             c[x] = 1
    #     for x in words2:
    #         if x in d and d[x] == 1 and c[x] == 1:
    #             counter += 1
    #     if counter > 0:
    #         print(counter)
    #     else:
    #         return 0



# aa = Solution()
# aa.countWords(["a","ab"],["a","a","a","ab"])


# class Solution2():
#     def longestConsecutive(self, nums):
#         nums_set = set(nums)
#         msp = 0
#         for x in nums_set:
#             if x - 1 not in nums_set:
#                 val = x
#                 total = 1
#                 while val + 1 in nums_set:
#                     val += 1
#                     total += 1
#                 msp = max(msp, total)
#         return msp
#
#
#
# aa = Solution2()
# aa.longestConsecutive([100,4,200,1,3,2])

# class Solution(object):
#     def findKthLargest(self, nums, k):
#         """
#         :type nums: List[int]
#         :type k: int
#         :rtype: int
#         """
#         minHeap = []
#         for i in range(k):
#             minHeap.append(nums[i])
#
#         for i in range(k, len(nums)):
#             minHeap.sort()
#
#             if (minHeap[0] > nums[i]):
#                 continue
#             else:
#                 minHeap.pop(0)
#                 minHeap.append(nums[i])
#
#         return minHeap
#
#
# aa = Solution()
# aa.findKthLargest([63,-74,61,-17,-55,-59,-10,2,-60,-65],9)

# class Solution(object):
#     def thirdMax(self, nums):
#         """
#         :type nums: List[int]
#         :rtype: int
#         """
#         nums = set(nums)
#         nums = list(nums)
#         maxHeap = []
#         if len(nums) <= 2:
#             print(max(nums))
#             exit()
#         for i in range(3):
#             maxHeap.append(nums[i])
#         print(maxHeap)
#         for i in range(3, len(nums)):
#             maxHeap.sort()
#             if maxHeap[0] > nums[i]:
#                 continue
#             else:
#                 maxHeap.pop(0)
#                 maxHeap.append(nums[i])
#         print(min(maxHeap))
#
# aa = Solution()
# aa.thirdMax([1,2])

class Solution(object):
    def sort(l, n, k):
        heap = l[:k + 1]
        heapify(heap)
        j = 0
        for i in range(k + 1, n):
            print(heappop(heap))
            heappush(heap, l[i])
        while len(heap) != 0:
            print(heappop(heap))

aa = Solution()
aa.sort([])