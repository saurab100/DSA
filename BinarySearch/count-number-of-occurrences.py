# class Solution:
# 	def count(self,arr, n, x):
# 		i = 0
# 		j = n - 1
# 		a = -1
# 		b = -1
# 		while i <= j:
# 			mid = i + (j - i) // 2
# 			if arr[mid] == x:
# 				a = mid
# 				j = mid - 1
# 			elif arr[mid] > x:
# 				j = mid - 1
# 			else:
# 				i = mid + 1
# 		i = 0
# 		j = n - 1
# 		while i <= j:
# 			mid = i + (j - i) // 2
# 			if arr[mid] == x:
# 				b = mid
# 				i = mid + 1
# 			elif arr[mid] > x:
# 				j = mid - 1
# 			else:
# 				i = mid + 1
# 		print(b - a + 1)
#
# aa = Solution()
# aa.count([10,11],2,10)
