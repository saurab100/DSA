

# class Solution:
#     def isAnagram(self, s: str, t: str) -> bool:
#         # 0. base case, if the lengths of s and t are different, return False
#         if len(s) != len(t):
#             return False
#         # 1. set up a hashmap with the counts of the letters in s
#         hashmap = {}
#         for letter in s:
#             hashmap[letter] = hashmap.get(letter, 0) + 1
#         # 2. check if the letters in t are in the hashmap, if not return False, remove once the letters cancel out
#         for letter in t:
#             if letter in hashmap:
#                 hashmap[letter] -= 1
#                 if hashmap[letter] == 0:
#                     hashmap.pop(letter)
#             else:
#                 return False
#         # 3. return if the hashmap is blank
#         return hashmap == {}
#
# aa = Solution()
# aa.isAnagram("anagram","nagaram")

# Find all Anagrams

from collections import Counter

class Solution2(object):
    def findAnagrams(self, s, p):

        count1 = Counter(p)
        count2 = Counter(s[:len(p)])
        i, j = 0, len(p)
        size = len(s)
        ans = []
        while j <= size:
            if count2 == count1:
                ans += i,
            if j < size:
                count2[s[j]] += 1
            count2[s[i]] -= 1
            if count2[s[i]] == 0:
                del count2[s[i]]
            i += 1
            j += 1
        return ans

aa = Solution2()
aa.findAnagrams("cbaebabacd","abc")


class Solution(object):
    def checkInclusion(self, s1, s2):
        """
        :type s1: str
        :type s2: str
        :rtype: bool
        """
        # n = len(s1)
        # m = len(s2)
        # window = ""
        #
        # for i in range(m - n + 1):
        #     if i == 0:
        #         window = s2[:n]
        #     else:
        #         window[s2[i - 1]] -= 1
        #         window[s2[i + n - 1]] += 1
        #
        # return window == s1
        # l = 0
        # r = len(s1)
        #
        # # run the loop till the end the of larger string to check for permutation
        # while r <= len(s2):
        #     string_ = list(s2[l:r])  # store all the elements of the window in another string
        #     for char in s1:
        #         if char not in string_:  # if the character is not present in the string to be checked update the window
        #             r += 1
        #             l += 1
        #         else:
        #             string_.remove(char)  # if it is present remove it from the string which we are checking
        #         if len(string_) == 0:  # after removing all the matching characters if length of the string to be checked is 0 it means all of the letters in string match s1 and return True
        #             return True
        # return False




aa = Solution()
aa.checkInclusion("ab","eidbaooo")