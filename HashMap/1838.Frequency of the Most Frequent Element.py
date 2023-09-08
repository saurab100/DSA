class Solution(object):
    def maxFrequency(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        n = len(nums)
        d = {}
        s = 0
        x = 0
        for i in range(0, n):
            if nums[i] in d:
                d[nums[i]] += 1
            else:
                d[nums[i]] = 1
        print(d)
        for i in range(0, n):
            s = nums[i]
            x += k
            while x:
                s += 1
                if s in d:
                    d[s] += 1
                x -= 1
        print(d)
        result = []
        for key, val in d.items():
            result.append(val)
        return max(result)

aa = Solution()
aa.maxFrequency( [3,9,6], 2)