# Binary Tree Node
""" utility that allocates a newNode
with the given key """


class newNode:

	# Construct to create a newNode
	def __init__(self, key):
		self.data = key
		self.left = None
		self.right = None

# function to fill the map

class Solution(object):
    def fillMap(self, root, d, l, m):
	    if(root == None):
		    return

	    if d not in m:
		    m[d] = [root.data, l]
	    elif(m[d][1] > l):
		    m[d] = [root.data, l]
	    self.fillMap(root.left, d - 1, l + 1, m)
	    self.fillMap(root.right, d + 1, l + 1, m)

# function should print the topView of
# the binary tree


    def topView(self, root):

	# map to store the pair of node value and its level
	# with respect to the vertical distance from root.
	    m = {}

	    self.fillMap(root, 0, 0, m)
	    for it in sorted(m.keys()):
		    print(m[it][0], end=" ")


# Driver Code
root = newNode(1)
root.left = newNode(2)
root.right = newNode(3)
root.left.right = newNode(4)
root.left.right.right = newNode(5)
root.left.right.right.right = newNode(6)
print("Following are nodes in top view of Binary Tree")

aa = Solution()
aa.topView(root)

