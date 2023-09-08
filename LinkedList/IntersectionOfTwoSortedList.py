class Node(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution(object):
    def getIntersectionNode(self, headA, headB):
        """
        :type head1, head1: ListNode
        :rtype: ListNode
        """
        p1 = headA
        p2 = headB
        while p1 != p2:
            if p1:
                p1 = p1.next
            else:
                p1 = headB
            if p2:
                p2 = p2.next
            else:
                p2 = headA

        return p1

aa = Solution()
aa.getIntersectionNode(['4','1','8','4','5'],['5','6','1','8','4','5'])


def sortList(self, head: Optional[ListNode]) -> Optional[ListNode]:
    if not head or not head.next:
        return head

    # Split the list into two halfs
    left = head
    right = self.getMid(head)
    tmp = right.next
    right.next = None
    right = tmp

    left = self.sortList(left)
    right = self.sortList(right)

    return self.merge(left, right)


def getMid(self, head):
    slow = head
    fast = head.next

    while fast and fast.next:
        slow = slow.next
        fast = fast.next.next
    return slow


# Merge the list
def merge(self, list1, list2):
    newHead = tail = ListNode()
    while list1 and list2:
        if list1.val > list2.val:
            tail.next = list2
            list2 = list2.next
        else:
            tail.next = list1
            list1 = list1.next
        tail = tail.next

    if list1:
        tail.next = list1
    if list2:
        tail.next = list2

    return newHead.next