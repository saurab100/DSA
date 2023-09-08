class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        #result = []

        j = 0
        while nums1[m - 1] > nums2[j]:
            nums1[m-1], nums2[j] = nums2[j], nums1[m-1]
            m -= 1
            j += 1
        sortednums1
        nums2.sort()
        for i in range(0, n - 1):
            nums1.append(nums2[i])
        print(nums1);


aa = Solution()
aa.merge([1,2,5,6,0,0,0],4,[1,3,7,8],4)