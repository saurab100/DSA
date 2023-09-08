from collections import deque

class Solution:
    def maxSlidingWindow(self, nums, k) :
        q = deque()
        ans = []
        i, j = 0, 0
        while j < len(nums):
            while q and nums[j] > q[-1]:
                q.pop()
            q.append(nums[j])
            if j - i + 1 < k:
                j += 1
            else:
                ans.append(q[0])
                if nums[i] == q[0]:
                    q.popleft()
                i += 1
                j += 1
        print(ans)

aa = Solution()
aa.maxSlidingWindow([4,3,-1,-3,5,3,6,7], 3)