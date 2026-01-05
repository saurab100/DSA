/*
class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Solution {
    // return the Kth largest element in the given BST rooted at 'root'
    int counter = 0;
    public int kthLargest(Node root, int k) {
        // Your code here
        if(root == null) return -1;
        int right = kthLargest(root.right, k);
        if(right != -1) return right;
        
        if(counter + 1 == k) return root.data;
        counter++;
        int left = kthLargest(root.left, k);
        if(left != -1) return left;
        return -1;
        
    }
}