#User function Template for python3

class Solution:
    def solve(self, arr, n):
        s = ""
        x = ""
        arr =  sorted(arr)
        if n == 1:
            return arr[0]
        for i in range(0, n, 2):
            s += str(arr[i])
        
        for i in range(1,n,2):
            x += str(arr[i])
        
        return int(s) + int(x)


#{ 
 # Driver Code Starts
#Initial Template for Python 3



if __name__ == '__main__':
    tc = int(input())
    while tc > 0:
        n = int(input())
        arr = list(map(int, input().strip().split()))
        ob = Solution()
        ans = ob.solve(arr, n)
        print(ans)
        tc -= 1

# } Driver Code Ends