class Solution(object):
    def lengthOfLongestSubstring(self, s):

        # i, j, ml = 0, 0, 0
        # d = {}
        # for j in range(len(s)):
        #     if s[j] in d:
        #         d[s[j]] += 1
        #     else:
        #         d[s[j]] = 1
        # print(sum(d))
        #     if len(d) == j -i + 1:
        #         ml = max(ml, j -i + 1)
        #         j += 1
        #     elif len(d) < j - i + 1:
        #         while len(d) < j - i + 1:
        #             d[s[i]] -= 1
        #             if d[s[i]] == 0:
        #                 d.pop(s[i])
        #             i += 1
        #         j += 1
        # return ml
        count = 1
        maxCount = 0
        for i in range(0, len(s) - 1):
            for j in range(i + 1, len(s) - 1):
                if s[i] != s[j]:
                    count += 1
                else:
                    maxCount = max(maxCount, count)
                    count = 1
                    break
        print(maxCount)

a = Solution()
a.lengthOfLongestSubstring("abcabcbb")