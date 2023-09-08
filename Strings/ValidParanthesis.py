# #from collections import
#
# class Solution(object):
#     def isValid(self, s: str) -> bool:
#         dt = {'(': ')', '[': ']', '{': '}'}
#         stack = []
#         for i in s:
#             if i == '(' or i == '[' or i == '{':
#                 stack.append(i)
#             else:
#                 print(dt[stack[-1]])
#                 if not stack or i != dt[stack[-1]]:
#                     return False
#                 else:
#                     stack.pop()
#
#         if stack:
#             return False
#         else:
#             return True
#
# aa = Solution()
# aa.isValid("([]{}")

#415. Add Strings
# class Solution(object):
#     def addStrings(self, num1, num2):
#         """
#         :type num1: str
#         :type num2: str
#         :rtype: str
#         """
#         def func2(n):
#             d = {'0':0,'1':1,'2':2,'3':3,'4':4,'5':5,'6':6,'7':7,'8':8,'9':9}
#             num = 0
#             for i in n:
#                 num = num * 10 + d[i]
#             return num
#         num3 = func2(num1) + func2(num2)
#         print(str(num3))
#
# aa = Solution()
# aa.addStrings("1200","123")

#989. Add to Array-Form of Integer

# class Solution(object):
#     def addToArrayForm(self, num, k):
#         """
#         :type num: List[int]
#         :type k: int
#         :rtype: List[int]
#         """
#         a = ''.join(map(str, num)) # convert array into string
#         a = int(a)
#         a = a + k
#         b = str(a)
#         l = [i for i in b]
#         return l
#
# aa = Solution()
# aa.addToArrayForm([1,2,0,0],34)

#389. Find the Difference
class Solution(object):
    def findTheDifference(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: str
        """
        t = list(t)
        for i in s:
            if i in t:
                t.remove(i)
        return "".join(t)

aa = Solution()
aa.findTheDifference("", "y")