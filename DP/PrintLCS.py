class Solution(object):
    def func(self, x, y, n, m):
        t = [[0 for j in range(m + 1) for i in range(n + 1)]]
        # result = 0
        for i in range( n + 1):
            for j in range( m + 1):
                # if i == 0 or j == 0:
                #     t[i][j] = 0
                if x[i - 1] == y[j - 1]:
                    t[i][j] = 1 + t[i - 1][j - 1]
                    # result = max(result, t[i][j])
                else:
                    t[i][j] = max(t[i - 1][j], t[i][j - 1])

        Str = " "
        i, j = n, m
        while i > 0 or j > 0:
            if x[i - 1] == y[j - 1]:
                Str += x[i - 1]
                i -= 1
                j -= i

            elif t[i - 1][j] > t[i][j - 1]:
                i -= 1
            else:
                j -= 1
        print(Str)

aa =  Solution()
aa.func("abcdaf", "acbcf", 6, 5)
