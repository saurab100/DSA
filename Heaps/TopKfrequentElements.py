from collections import Counter
import heapq


class Solution(object):
    def topKFrequent(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: List[int]
        """
        # count = Counter(nums)
        hq = []
        d = {}
        for num in nums:
            d[num] = d.get(num, 0) + 1
        for key, val in d.items():
            hq.append((-val, key))

            heapq.heapify(hq)
            res = []
            for _ in range(k):
                res.append(heapq.heappop(hq)[1])
        return res

