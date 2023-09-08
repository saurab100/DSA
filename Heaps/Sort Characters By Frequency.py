from collections import Counter
import heapq

class Solution(object):
    def frequencySort(self, s):
        """
        :type s: str
        :rtype: str
        """
        count = Counter(s)
        hq = []
        for key, val in count.items():
            hq.append((-val, key))

        heapq.heapify(hq)
        string = []
        while hq:
            key, val = heapq.heappop(hq)
            string += [val] * -key
        print(string)

aa = Solution()
aa.frequencySort("tree")