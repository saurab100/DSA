class Solution:
    
    #Function to find minimum number of pages.
    def findPages(self,A, N, M):
        def isValid(A, N, M, mid):
            total = 0
            studentCount = 1
            for i in range(0, N):
                total += A[i]
                if total > mid:
                    studentCount += 1
                    total = A[i]
                    if studentCount > M:
                        return False
            return True
        
        i = max(A)
        j = sum(A)
        result = -1
        if M > N:
            return -1
        while i <= j:
            mid = i + (j-i) // 2
            if isValid(A, N, M, mid) == True:
                result = mid
                j = mid - 1
            else:
                i = mid + 1
        return result
                
        
        



#{ 
 # Driver Code Starts
#Initial Template for Python 3

#contributed by RavinderSinghPB
if __name__=='__main__':
    t=int(input())
    for _ in range(t):
        
        n=int(input())
        
        arr=[int(x) for x in input().strip().split()]
        m=int(input())
        
        ob=Solution()
        
        print(ob.findPages(arr,n,m))
# } Driver Code Ends