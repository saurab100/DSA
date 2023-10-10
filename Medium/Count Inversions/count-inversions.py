class Solution:
    #User function Template for python3
    
    # arr[]: Input Array
    # N : Size of the Array arr[]
    #Function to count inversions in the array.
    def inversionCount(self, arr, n):
        temp = [0] * n
        return self.mergeSort(arr, temp, 0, n-1)
        
    def mergeSort(self, arr, temp, l, r):
        count = 0
        if l < r:
            mid = (l+r) // 2
            count += self.mergeSort(arr, temp, l, mid)
            count += self.mergeSort(arr, temp, mid+1, r)
            count += self.merge(arr, temp, l, mid, r)
        return count
    
    def merge(self, arr, temp, left, mid, right):
        i = left
        k = left
        j = mid+1
        count = 0
        
        while i <= mid and j <= right:
            if arr[i] <= arr[j]:
                temp[k] = arr[i]
                i += 1
            else:
                temp[k] = arr[j]
                count += mid - i + 1
                j += 1
            k += 1
        
        while i <= mid:
            temp[k] = arr[i]
            k += 1
            i += 1
            
        while j <= right:
            temp[k] = arr[j]
            k += 1
            j += 1
        
        for x in range(left, right + 1):
            arr[x] = temp[x]
        
        return count 
            
            
            
            


#{ 
 # Driver Code Starts
#Initial Template for Python 3

import atexit
import io
import sys

_INPUT_LINES = sys.stdin.read().splitlines()
input = iter(_INPUT_LINES).__next__
_OUTPUT_BUFFER = io.StringIO()
sys.stdout = _OUTPUT_BUFFER

@atexit.register

def write():
    sys.__stdout__.write(_OUTPUT_BUFFER.getvalue())

if __name__=='__main__':
    t = int(input())
    for tt in range(t):
        n = int(input())
        a = list(map(int, input().strip().split()))
        obj = Solution()
        print(obj.inversionCount(a,n))
# } Driver Code Ends