class Solution(object):

    def createStack(self):
        stack = []
        return stack
    def reveseStack(self, stack):
        if not self.isEmpty(stack):
            temp = self.pop(stack)
            self.reveseStack(stack)
            self.insertAtBottom(stack, temp)

    def isEmpty(self,stack, item):
        return len(stack) == 0

    def pop(self,stack):
        if len(stack) == 0:
            exit(1)
        return stack.pop()

    def push(self, stack, item):
        stack.append(item)

    def insertAtBottom(self,stack, item):
        if self.isEmpty(stack):
            self.push(stack, item)
        else:
            temp = self.pop(stack)
            self.insertAtBottom(stack, item)
            self.push(stack, temp)


