class Solution(object):
    # def longestOnes(self, nums, k):
    #     """
    #     :type nums: List[int]
    #     :type k: int
    #     :rtype: int
    #     """
    #     ml = 0
    #     for i in range(0, len(nums) - 1):
    #         arr = []
    #         for j in range(i, len(nums) - 1):
    #             if nums[j] == 0:
    #                 arr.append(nums[j])
    #                 if len(arr) > k:
    #                     break
    #             ml = max(ml, j - i + 1)
    #     return ml

    def func(self, n):
        x = 0
        while n!=0:
            x = n // 10
            n //= 10
            print(x)

aa = Solution()
aa.func(345289467)

s= " "
print(s.isalpha())
