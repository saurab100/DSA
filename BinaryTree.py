# class Node:
#
#     def __init__(self, data, left, right):
#         self.data = data
#         self.left = None
#         self.right = None
#
#
# class Pair:
#     def __init__(self, node, state):
#         self.node = node
#         self.state = state
#
#     def construct(arr):
#         root = Node(arr[0], None, None)
#         rtp = Pair(root, 1);
#         st = []
#         st.append(rtp);
#         idx = 0;
#         n = len(arr)
#         while (len(st) > 0):
#             top = st[-1];
#             if top.state == 1:
#                 idx += 1
#                 st[-1].state += 1
#                 if (arr[idx] != -1):
#                     top.node.left = Node(arr[idx], None, None);
#                     lp = Pair(top.node.left, 1);
#                     st.append(lp);
#                 else:
#                     top.node.left = None;
#             elif top.state == 2:
#                 idx += 1
#                 st[-1].state += 1
#                 if (arr[idx] != -1):
#                     top.node.right =  Node(arr[idx], None, None);
#                     rp =  Pair(top.node.right, 1);
#                     st.append(rp);
#                 else:
#                     top.node.right = None;
#             else:
#                 st.pop()
#         return root;
#
#
#
# def size(node):
#     if (node == None):
#         return 0
#     else:
#         return size(node.left) + size(node.right) + 1
#     #Write your code here
#
# def add(node):
#     return
# # Write your code here
#
# def maximum(node):
#     return
# # Write your code here
#
# def height(node):
#     return
# # Write your code here
#
# n = int(input())
# st = input()
# arr = list(map(int, st.replace("n", "-1").split(" ")));
# con = Pair()
# root = con.construct(arr)
# print(size(root))
# print(add(root))
# print(maximum(root))
# print(height(root))













# Python program to for tree traversals

# A class that represents an individual node in a
# Binary Tree


class Node:
	def __init__(self, key):
		self.left = None
		self.right = None
		self.val = key


# A function to do inorder tree traversal
def printInorder(root):

	if root:

		# First recur on left child
		printInorder(root.left)

		# then print the data of node
		print(root.val),

		# now recur on right child
		printInorder(root.right)


# A function to do postorder tree traversal
def printPostorder(root):

	if root:

		# First recur on left child
		printPostorder(root.left)

		# the recur on right child
		printPostorder(root.right)

		# now print the data of node
		print(root.val),


# A function to do preorder tree traversal
def printPreorder(root):

	if root:

		# First print the data of node
		print(root.val),

		# Then recur on left child
		printPreorder(root.left)

		# Finally recur on right child
		printPreorder(root.right)


# Driver code

# print ("Preorder traversal of binary tree is")
# printPreorder(root)
#
# print ("\nInorder traversal of binary tree is")
# printInorder(root)
#
# print ("\nPostorder traversal of binary tree is")
# printPostorder(root)


# def traversal(root):
# 	if root is None:
# 		return
# 	print("Preorder:", root.val)
# 	traversal(root.left)
# 	print("Inorder:", root.val)
# 	traversal(root.right)
# 	print("PostOrder:", root.val)
#
#
#
# def level(node):
# 	queue = []
# 	queue.append(node)
# 	while len(queue) > 0:
# 		count = len(queue)
# 		for x in range(0,count):
# 			print(node.val)
# 			if node.left is not None:
# 				queue.append(node.left)
# 			if node.right is not None:
# 				queue.append(node.right)
#
# 	print("")
class Solution(object):
	def sumOfLeftLeaves(self, root):
		"""
        :type root: TreeNode
        :rtype: int
        """
		result = 0
		if root == 1:
			return 0
		if root.left:
			result = root.left.val
		self.sumOfLeftLeaves(root.left)
		self.sumOfLeftLeaves(root.right)
		return result

root = Node(1)
root.left = Node(2)
root.right = Node(3)
root.left.left = Node(None)
root.left.right = Node(5)

aa = Solution()
aa.sumOfLeftLeaves(root)

