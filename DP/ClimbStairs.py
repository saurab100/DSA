class Solution:
    def climbStairs(self, n: int) -> int:
        if n <= 2:
            return n
        dp = []
        dp.append(1)
        dp.append(2)
        for i in range(2, n):
            print(dp[-1])
            dp.append(dp[i-1] + dp[i-2])
        print(dp[0])

a = Solution()
a.climbStairs(6)