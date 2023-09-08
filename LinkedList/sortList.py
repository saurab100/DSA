# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def sortList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        left = head
        right = self.mid(head)
        temp = right.next
        right.next = None
        right = temp

        left = self.sortList(left)
        right = self.sortList(right)

        return self.mergeTwo(left, right)

    def mid(self, head):
        slow = head
        fast = head.next
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
        return slow

    def mergeTwo(self, list1, list2):
        p1 = list1
        p2 = list2
        prev = None
        while p1 is not None and p2 is not None:
            if p1.val < p2.val:
                prev = p1
                p1 = p1.next
            else:
                if prev is not None:
                    prev.next = p2
                prev = p2
                p2 = p2.next
                prev.next = p1
        if p1 is None:
            prev.next = p2
        return list1 if list1.val < list2.val else list2
