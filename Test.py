# Given an array of integers, return an list of integers which contains
# [1st integer, Sum of next 2 integers (2nd, 3rd), Sum of next 3 integers (4th, 5th, 6th)] and so on
# so on means sum up next 4 , next 5, next 6, next 7
#
# Input :: [1,6,8,5,9,4,7,2]
# Output :: [1,14,18,9]

class Solution(object):
    def reverseStrings(self, s):
        """
        :type s: str
        :type k: int
        :rtype: str
        """
        n = len(s)
        i = 0
        j = n-1
        lst = list(s)
        while i <= j:
            if s[i].isalpha() and s[j].isalpha():
                lst[i], lst[j] = lst[j], lst[i]
                i += 1
                j -= 1
            elif not s[i].isalpha():
                i += 1
            else:
                j -= 1
        print(''.join(lst))




aa =  Solution()
aa.reverseStrings("a-bC-dEf-ghIj")