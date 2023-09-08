class Solution(object):
    def lenOfLongSubarr(self,arr, n, k):
        mydict = dict()
        sum = 0
        maxLen = 0
        for i in range(n):
            sum += arr[i]
            if (sum == k):
                maxLen = i + 1
            elif (sum - k) in mydict:
                maxLen = max(maxLen, i - mydict[sum - k])
            if sum not in mydict:
                mydict[sum] = i
        return maxLen

aa = Solution()
aa.lenOfLongSubarr([3,9,-2,4,1,-7,2,6,-5,8,-3,-7,6,2,1],15, 5)