class StockSpanner:

    def next(self, price):
        n = len(price)
        S = [0 for i in range(len(price) + 1)]
        # Create a stack and push index of first element to it
        st = []
        st.append(0)
        st.clear()

        # Span value of first element is always 1
        S[0] = 1

        # Calculate span values for rest of the elements
        for i in range(1, n):

            # Pop elements from stack while stack is not
            # empty and top of stack is smaller than price[i]
            while (len(st) > 0 and price[st[-1]] <= price[i]):
                st.pop()

            # If stack becomes empty, then price[i] is greater
            # than all elements on left of it, i.e. price[0],
            # price[1], ..price[i-1]. Else the price[i] is
            # greater than elements after top of stack
            print(st[-1])
            if len(st) <= 0:
                S[i] = i + 1
            else:
                S[i] = i - st[-1]

            # Push this element to stack
            st.append(i)


obj = StockSpanner()
param_1 = obj.next([100,80,60,70,60,75,85])