# s = "saurabh"
# print(s[::-1])
# rev = '-'.join(reversed(s))
# print(rev)

class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        s = s.lower()
        s = ''.join(ch for ch in s if ch.isalnum())
        print(s)
        return s == s[::-1]

aa = Solution()
aa.isPalindrome("A man, a plan, a canal: Panama")

# words = ["abc","car","ada","racecar","cool"]
# for i in words:
#     s = i[::-1]
#     if i == s:
#         print(i)
#     else:
#         print("")


#     def firstPalindrome(self, words):
#         """
#         :type words: List[str]
#         :rtype: str
#         """
#         for i in words:
#             s = i[::-1]
#             #print(s)
#             if i == s:
#                  return i
#             else:
#                 print("")
#
# aa = Solution()
# aa.firstPalindrome(["abc","car","ada","racecar","cool"])

# class Solution2(object):
#     def validPalindrome(self, s: str) -> bool:
#         p1 = 0
#         p2 = len(s) - 1
#         while p1 <= p2:
#             if s[p1] != s[p2]:
#                 string1 = s[:p1] + s[p1 + 1:]
#                 string2 = s[:p2] + s[p2 + 1:]
#                 return string1 == string1[::-1] or string2 == string2[::-1]
#             p1 += 1
#             p2 -= 1
#         return True

# aa = Solution()
# aa.validPalindrome("abca")

# class Solution2(object):
#     def detectCapitalUse(self, word):
#         """
#         :type word: str
#         :rtype: bool
#         """
#         if word.isupper():
#             return True
#         if word[0].isupper():
#             i = 1
#             j = len(word)
#             for i in range(i,j):
#                 if word[i].isupper():
#                     return False
#         return True
#
# a = Solution2()
# a.detectCapitalUse("ffffffffffffffffffffF")