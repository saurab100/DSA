class Solution(object):
    def maxSum(self, arr, k):
        n = len(arr)
        totalSum = sum(arr)

        # k must be smaller than n
        if (n < k):
            print("Invalid")
            return -1

        # Compute sum of first
        # window of size k
        res = 0
        for i in range(k):
            res += arr[i]

        # Compute sums of remaining windows by
        # removing first element of previous
        # window and adding last element of
        # current window.
        curr_sum = res
        for i in range(k, n):
            curr_sum += arr[i] - arr[i - k]
            res = max(res, curr_sum)

        print(totalSum - res)


aa = Solution()
aa.maxSum([4,6,10,8,2,1],3)


# def subarraySum(self, nums, k):
#     s = 0
#     count = 0
#     d = {}
#     d[0] = 1
#     for i in range(len(nums)):
#         s += nums[i]
#         if s - k in d:
#             count += d[s - k]
#         if s in d:
#             d[s] += 1
#         else:
#             d[s] = 1
#     print(count)