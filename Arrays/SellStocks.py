class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        a = 0
        b = 0
        p = 0

        for i in range(1, len(prices)):
            if prices[i] >= prices[i-1]:
                b += 1
            else:
                p += prices[b] - prices[a]
                a = b = i
        p += prices[b] - prices[a]
        print(p)

aa = Solution()
aa.maxProfit([1,2,3,4,5])