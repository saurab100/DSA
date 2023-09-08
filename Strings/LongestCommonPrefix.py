class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        # result = []
        # result.append(strs[0])
        # for i in range(1,len(strs)):
        # str1, str2 = min(strs), max(strs)
        # i = 0
        # while i < len(str1):
        #     if str1[i] != str2[i]:
        #         str1 = str1[:i]
        #     i += 1
        #
        # print(str1)
        strs = sorted(strs)
        st = ""
        s = strs[0]
        for i in range(1, len(strs)):
            for j in range(len(s)):
                if s[j] == strs[i][j]:
                    st += s[j]
                else:
                    s = st
                    break
            st = ""
        print(s)


aa = Solution()
aa.longestCommonPrefix(["flower","flow","flight"])


