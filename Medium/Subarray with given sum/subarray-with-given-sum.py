#User function Template for python3

#Function to find a continuous sub-array which adds up to a given number.
class Solution:
    def subArraySum(self,arr, n, s):
        beg = 0
        j = 0
        result = 0
        final = [-1]
        for i in range(n):
            j = i
            result += arr[i]
            while result > s and beg < i:
                result -= arr[beg]
                beg += 1
            if result == s:
                final = [beg+1, j+1]
                break
                
        return final


#{ 
 # Driver Code Starts
#Initial Template for Python 3

import math

def main():
        T=int(input())
        while(T>0):
            
            NS=input().strip().split()
            N=int(NS[0])
            S=int(NS[1])
            
            A=list(map(int,input().split()))
            ob=Solution()
            ans=ob.subArraySum(A, N, S)
            
            for i in ans:
                print(i, end=" ")
                
            print()
            
            T-=1


if __name__ == "__main__":
    main()
# } Driver Code Ends