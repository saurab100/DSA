class Solution:

    # Function to evaluate a postfix expression.
    def evaluatePostfix(self, S):
        stack = []
        for i in S:
            if i not in ["*","-","/","+"]:
                stack.append(int(i))
            else:
                x = stack.pop()
                y = stack.pop()
                if i == "*":
                    stack.append(y * x)
                elif i == "-":
                    stack.append(y - x)
                elif i == "+":
                    stack.append(y + x)
                else:
                    stack.append(int(float(y)/x))
        print(stack[0])

aa = Solution()
aa.evaluatePostfix("231*+9-")