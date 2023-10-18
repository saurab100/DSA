class Solution:
    # your task is to complete this function
    # function sort the stack such that top element is max
    # funciton should return nothing
    # s is a stack
    def Sorted(self, s):
        if len(s) == 1:
            return
        element = s.pop()
        self.Sorted(s)
        self.insertSort(s, element)
    
    def insertSort(self, s, element):
        if len(s) == 0 or s[-1] <= element:
            s.append(element)
            return
        else:
            temp = s.pop()
            self.insertSort(s, element)
            s.append(temp)



#{ 
 # Driver Code Starts

if __name__=='__main__':
    t = int(input())
    for i in range(t):
        n = int(input())
        arr = list(map(int, input().strip().split()))
        ob = Solution()
        ob.Sorted(arr)
        for e in range(len(arr)):
            print(arr.pop(), end=" ")
        print()


# } Driver Code Ends