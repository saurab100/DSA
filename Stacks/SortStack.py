def sortStack(stack):
    if not self.isEmpty(stack):
        temp = pop(stack)
        sortStack(stack)
        insert(stack, temp)

def insert(stack, element):
    if len(stack) == 0 or element > stack[-1]:
        stack.append(element)
        return
    else:
        temp = pop(stack)
        insert(stack,temp)
        stack.append(temp)