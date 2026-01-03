/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public Node LCA(Node root, Node n1, Node n2) {
        // code here
        if(root == null) return null;
        if(root == n1 || root == n2) return root;
        Node left = LCA(root.left, n1, n2);
        Node right = LCA(root.right, n1, n2);
        if(left == null) return right;
        if(right == null) return left;
        return root;
    }
}