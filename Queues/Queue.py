from typing import List
class Queue:
    def __init__(self):
        self.front = 0
        self.rear = -1
        self.size = 100001
        self.arr = [0] * self.size
        self.count = 0

    #  Enqueue (add) element 'e' at the end of the queue.
    def enqueue(self, e: int) -> None:
        if self.rear == self.size - 1:
            exit(1)
        self.rear += 1
        self.arr[self.rear] = e

    #  Dequeue (retrieve) the element from the front of the queue.
    def dequeue(self) -> int:
        if self.rear == -1:
            return -1
        result = self.arr[0]
        for i in range(0, self.rear):
            self.arr[i] = self.arr[i + 1]
        self.rear -= 1
        return result
