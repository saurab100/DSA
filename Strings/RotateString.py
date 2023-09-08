
# 796. Rotate String

class Solution(object):
    def rotateString(self, s, goal):
        """
        :type s: str
        :type goal: str
        :rtype: bool
        """
        for i in range(len(s)):
            temp = s[i:] + s[0:i]
            if temp == goal:
                print("True")
        return False


aa = Solution()
aa.rotateString("abcde","cdeab")