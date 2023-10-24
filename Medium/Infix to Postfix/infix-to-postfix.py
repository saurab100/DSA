#User function Template for python3


class Solution:
    def __init__(self):
        self.priority = {'+':1, '-': 1, '*': 2, '/': 2, '^': 3}
        self.Operators = set(['+', '-', '*', '/', '(', ')', '^'])
    
    #Function to convert an infix expression to a postfix expression.
    def InfixtoPostfix(self, exp):
        stack = []
        result = ''
        for i in exp:
            if i not in self.Operators:
                result += i
            elif i == '(':
                stack.append(i)
            elif i == ')':
                while stack and stack[-1] != '(':
                    result += stack.pop()
                stack.pop()
            else:
                while stack and stack[-1] != '(' and self.priority[i] <= self.priority[stack[-1]] :
                    result += stack.pop()
                stack.append(i)
        
        while len(stack):
            result += stack.pop()
        
        return result
                
        


#{ 
 # Driver Code Starts
#Initial Template for Python 3

import atexit
import io
import sys

# This code is contributed by Nikhil Kumar Singh(nickzuck_007)


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
        exp = str(input())
        ob=Solution()
        print(ob.InfixtoPostfix(exp))
# } Driver Code Ends