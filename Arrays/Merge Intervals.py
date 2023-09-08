class Solution(object):
    def merge(self, intervals):
        """
        :type intervals: List[List[int]]
        :rtype: List[List[int]]
        """
        # intervals.sort()
        # merged = []
        # for interval in intervals:
        #     # if the list of merged intervals is empty or if the current
        #     # interval does not overlap with the previous, simply append it.
        #     if not merged or merged[-1][1] < interval[0]:
        #         print(interval[0])
        #         merged.append(interval)
        #         print(merged[-1][1])
        #     else:
        #         # otherwise, there is overlap, so we merge the current and previous
        #         # intervals.
        #         print(interval[1])
        #         merged[-1][1] = max(merged[-1][1], interval[1])
        #         print(merged[-1][1])
        #
        # return merged


aa = Solution()
aa.merge([[1,3],[2,6],[8,10],[9,18]])


# 252 Meeting room

class Solution:
    """
    @param intervals: an array of meeting time intervals
    @return: if a person could attend all meetings
    """

    def minMoves(self, arr):
        arr1 = sorted(arr)
        #print(arr1)
        arr2 = sorted(arr, reverse=True)
        #print(arr2)

        # if arr == arr1 or arr == arr2:
        #     return 0
        count1 = 0
        dis = 0
        for num in arr:
            if num == 1:
                count1 += 1
            if num == 0:
                dis += count1

        count0 = len(arr) - count1
        rev_dis = count1 * count0 - dis
        return min(dis, rev_dis)


aa = Solution()
aa.minMoves([1, 1, 0, 1, 0, 0, 0, 0])

from collections import Counter


def countPairs(numbers, k):
    count = 0
    mapCount = Counter(numbers)

    if k == 0:
        for key, val in mapCount.items():
            if val > 1:
                count += 1
    else:
        for key, val in mapCount.items():
            if key + k in mapCount:
                count += 1
    return count