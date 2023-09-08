class Solution(object):
    def maxArea(self, height):
        maxArea = 0
        start = 0
        end = len(height)-1
        while start < end:
            maxArea = max(maxArea, min(height[start], height[end])*(end-start))
            if height[start] > height[end]:
                end -= 1
            else:
                start += 1
        return maxArea

aa = Solution()
aa.maxArea([1,8,6,2,5,4,8,3,7])