#User function Template for python3


class Solution:
    def nextLargerElement(self,arr,n):
        stack = []
        output = []
        for i in range(n - 1, -1, -1):
            #print(arr[i])
            if len(stack) == 0:
                output.append(-1)
                
            elif stack and arr[i] < stack[-1]:
                output.append(stack[-1])
            
            elif stack and arr[i] >= stack[-1]:
                while stack and arr[i] >= stack[-1]:
                    stack.pop()
                if stack:
                    output.append(stack[-1])
                else:
                    output.append(-1)
            stack.append(arr[i])
                
        output.reverse()
        return output


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

if __name__ == '__main__':
    test_cases = int(input())
    for cases in range(test_cases) :
        n = int(input())

        a = list(map(int,input().strip().split()))
        obj = Solution()
        res = obj.nextLargerElement(a,n)
        for i in range (len (res)):
            print (res[i], end = " ")
        print ()
# } Driver Code Ends