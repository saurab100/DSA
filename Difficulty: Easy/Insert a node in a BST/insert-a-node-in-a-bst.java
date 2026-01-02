/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public Node insert(Node root, int key) {
        // code here
        if(root == null) return new Node(key);
        if(root.data > key) root.left = insert(root.left, key);
        else root.right = insert(root.right, key);
        return root;
    }
}
