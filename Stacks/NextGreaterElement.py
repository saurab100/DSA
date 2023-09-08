class Solution(object):
    def nextGreaterElements(self, nums):
        # run Next Greater Element I two times
        n = len(nums)
        s = nums[::-1]
        res = []
        for i in range(n - 1, -1, -1):
            if not s:
                res.append(-1)
            elif s and s[-1] > nums[i]:
                res.append(s[-1])
            elif s and s[-1] <= nums[i]:
                while s and s[-1] <= nums[i]:
                    s.pop()
                if not s:
                    res.append(-1)
                else:
                    res.append(s[-1])
            s.append(nums[i])
        print(res[::-1])

aa = Solution()
aa.nextGreaterElements([2,1,5,6,2,3])


#496

# class Solution(object):
#     def nextGreaterElement(self, nums1, nums2) :
#         d, res, stack = {}, [], [nums2[-1]]
#         d[nums2[-1]] = -1
#         for i in range(len(nums2) - 2, -1, -1):
#             while stack and stack[-1] < nums2[i]:
#                 stack.pop()
#             if stack:
#                 d[nums2[i]] = stack[-1]
#             else:
#                 d[nums2[i]] = -1
#             stack.append(nums2[i])
#         for i in range(len(nums1)):
#             res.append(d[nums1[i]])
#         return res
#
# aa = Solution()
# aa.nextGreaterElement([4,1,2],[1,3,4,2])