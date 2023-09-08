class Solution(object):
    def reverseBetween(self, head, left, right):
        prev = None
        curr = head
        while left > 1:
            prev = curr
            curr = curr.next
            left, right = left-1, right-1
        tail = prev
        con = curr
        while right:
            third = curr.next
            curr.next = prev
            prev = curr
            curr = third
            right -= 1
        if con:
            con.next = prev
        else:
            head = prev
        tail.next = curr
        return head