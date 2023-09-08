from collections import Counter
# # 412. Fizz Buzz
#
# class Solution:
#     def fizzBuzz(self, n):
#         """
#         :type n: int
#         :rtype: List[str]
#         """
#         # ans list
#         ans = []
#
#         # Dictionary to store all fizzbuzz mappings
#         fizz_buzz_dict = {3 : "Fizz", 5 : "Buzz"}
#
#         for num in range(1,n+1):
#
#             num_ans_str = ""
#
#             for key in fizz_buzz_dict.keys():
#
#                 # If the num is divisible by key,
#                 # then add the corresponding string mapping to current num_ans_str
#                 if num % key == 0:
#                     num_ans_str += fizz_buzz_dict[key]
#
#             if not num_ans_str:
#                 num_ans_str = str(num)
#
#             # Append the current answer str to the ans list
#             ans.append(num_ans_str)
#
#         print(ans)
# aa = Solution()
# aa.fizzBuzz(15)

# class Solution(object):
#     def checkRecord(self, s):
#         """
#         :type s: str
#         :rtype: bool
#         """
#         if 'LLL' in s or s.count('A') > = 2:
#             return False
#         else:
#             return True
#
# aa = Solution()
# aa.checkRecord("PPALLP")


