# class Solution(object):
#     def fib(self, n):
#         """
#         :type n: int
#         :rtype: int
#         """
#         fibVal = 0
#         func1 = 0
#         if n == 1:
#             return 1
#         func1 = self.fib(n - 1)
#         fibVal = n * func1
#         print(fibVal)

class Solution:
	def myPow(self, x, n) -> bool:
		# if n == 1:
		# 	return True
		# if n % 2 != 0 or n == 0:
		# 	return False
		# return self.isPowerOfTwo(n/2)
		a = 0
		if n == 0:
			return 1
		if n == 1:
			return x
		if n > 0:

			a = self.myPow(x, n // 2)
			if n % 2 == 0:
				return a * a
			elif n % 2 == 1:
				return x * a * a
		if n < 0:
			n = abs(n)
			a = self.myPow(1 / x, n // 2)
			if n % 2 == 0:
				return a * a
			elif n % 2 == 1:
				return 1 / x * a * a
aa = Solution()
aa. myPow(2,3)