#{ 
 # Driver Code Starts

# } Driver Code Ends
def reverse(S):
    stack = []
    for i in S:
        stack.append(i)
    
    result = ""
    while stack:
        result += stack.pop()
    
    return result
    
   

#{ 
 # Driver Code Starts.
if __name__=='__main__':
    t=int(input())
    for i in range(t):
        str1=input()
        print(reverse(str1))
# } Driver Code Ends