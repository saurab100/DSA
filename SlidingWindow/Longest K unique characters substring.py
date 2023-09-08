class Solution:

    def longestKSubstr(self, s, k):
        # code here
        i, j, mx = 0,0,-1
        d = {}
        for j in range(len(s)):
            if s[j] in d:
                d[s[j]] += 1
            else:
                d[s[j]] = 1
            if len(d) < k:
                j += 1
            elif len(d) == k:
                mx = max(mx, j - i + 1)
                j += 1
            else:
                while len(d) > k:
                    d[s[i]] -= 1
                    if d[s[i]] == 0:
                        d.pop(s[i])
                    i += 1
                j += 1
        print(mx)

aa = Solution()
aa.longestKSubstr("aabacbebebe",3)