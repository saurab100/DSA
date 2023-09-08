# # class Solution(object):
# #     def wordBreak(self, s, wordDict):
# #         """
# #         :type s: str
# #         :type wordDict: List[str]
# #         :rtype: bool
# #         """
# #         # intialize memo
# #         memo = {}
# #         # call recursive helper
# #         return self.helper(memo, s, wordDict)
# #
# #
# #     def helper(self, memo, string, wordDict):
# #         print('**************')
# #         print('current: ' + string)
# #         # base case, if string is empty we can return true
# #         if len(string) < 1:
# #             print('empty string found, returning True')
# #             return True
# #     # use memo to save computational time
# #         if string in memo:
# #             return memo[string]
# #     # for each prefix of string
# #         for i in range(len(string) + 1):
# #         # if prefix in wordDict
# #             if string[:i] in wordDict:
# #             # recursively check if remaining string can be segmented
# #                 print('checking ' + string[:i] + ', leaving ' + string[i:] + ' to be evaluated')
# #                 if self.helper(memo, string[i:], wordDict):
# #                     print(memo[string])
# #                     memo[string] = True
# #                     return True
# #     # if not found, return false
# #         memo[string] = False
# #         return False
# #
# # aa =  Solution()
# # aa.wordBreak("leetcode",["leet","code"])
# #
# # from collections import Counter
# # str = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz"
# # result = Counter(str)
# # result = max(result, key=result.get)
# # print(result)
#
# class Solution():
#     def maxLength(self, arr, n, k):
#         _sum = 0
#         cnt = 0
#         maxcnt = 0
#
#         for i in range(n):
#
#             # If adding current element doesn't
#             # Cross limit add it to current window
#             if ((_sum + arr[i]) <= k):
#                 _sum += arr[i]
#                 cnt += 1
#
#             # Else, remove first element of current
#             # window and add the current element
#             elif(sum != 0):
#                 _sum = _sum - arr[i - cnt] + arr[i]
#
#             # keep track of max length.
#             maxcnt = max(cnt, maxcnt)
#
#         print( maxcnt)
#
# aa = Solution()
# aa.maxLength([3,1,2,1],4, 4)
#
# def pointsBelong(x1,y1,x2,y2,x3,y3,xp,yp,xq,yq):
#     import math
#     ab=math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2))
#     bc=math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3))
#     ac=math.sqrt((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1))
#     if (ab+bc)<=ac or (bc+ac)<=ab or (ac+ab)<=bc:
#         return 0
#     total_area=abs((x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))/2.0)
#     p_area1=abs((x1*(y2-yp)+x2*(yp-y1)+xp*(y1-y2))/2.0)
#     p_area2=abs((x1*(yp-y3)+xp*(y3-y1)+x3*(y1-yp))/2.0)
#     p_area3=abs((xp*(y2-y3)+x2*(y3-yp)+x3*(yp-y2))/2.0)
#     q_area1=abs((x1*(y2-yq)+x2*(yq-y1)+xq*(y1 - y2))/2.0)
#     q_area2=abs((x1*(yq-y3)+xq*(y3-y1)+x3*(y1 - yq))/2.0)
#     q_area3=abs((xq*(y2-y3)+x2*(y3-yq)+x3*(yq - y2))/2.0)
#     if (p_area1+p_area2+p_area3)==total_area and (q_area1+q_area2+q_area3)!=total_area:
#         return 1
#     if (p_area1+p_area2+p_area3)!=total_area and (q_area1+q_area2+q_area3)==total_area:
#         return 2
#     if (p_area1+p_area2+p_area3)==total_area and (q_area1+q_area2+q_area3)==total_area:
#         return 3
#     if (p_area1+p_area2+p_area3)!=total_area and (q_area1+q_area2+q_area3)!=total_area:
#         return 4
from collections import  defaultdict
class Solution(object):
    def numTeams(self, values):
        """
        :type rating: List[int]
        :rtype: int
        """
        a = 0
        b = 0
        for i in range(len(values)):
            for j in range(i, len(values)):
                a = values[i] + values[j] + i - j
                b = max(a, b)
                a = 0
        return b

aa = Solution()
aa.numTeams([8,1,5,2,6])