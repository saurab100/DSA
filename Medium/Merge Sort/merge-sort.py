#User function Template for python3

class Solution:
    
    def mergeSort(self,arr, l, r):
        temp = [0]*len(arr)
        return self.merged(arr, temp, l, r)
        
    def merged(self, arr, temp, l, r):
        if l < r:
            mid = (l+r) // 2
            self.merged(arr,temp, l, mid)
            self.merged(arr,temp, mid+1, r)
            self.merge(arr, temp, l, mid, r)
    
    def merge(self, arr, temp, l, m, r):
        i = l
        k = l
        j = m + 1
        while (i <= m  and j <= r):
            if arr[i] <= arr[j]:
                temp[k] = arr[i]
                i += 1
            else:
                temp[k] = arr[j]
                #count += mid - i + 1
                j += 1
            k += 1
        while i <= m:
            temp[k] = arr[i]
            i += 1
            k += 1
        
        while j <= r:
            temp[k] = arr[j]
            j += 1
            k += 1
        
        for x in range(l, r+1):
            arr[x] = temp[x]
        return temp
        
    


#{ 
 # Driver Code Starts
#Initial Template for Python 3


import sys
input = sys.stdin.readline
if __name__ == "__main__":
    t=int(input())
    for i in range(t):
        n=int(input())
        arr=list(map(int,input().split()))
        Solution().mergeSort(arr, 0, n-1)
        for i in range(n):
            print(arr[i],end=" ")
        print()
# } Driver Code Ends