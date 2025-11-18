/*
class Node {
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/

class Solution {
    Node lca(Node root, int n1, int n2) {
        // code here
        //1. When root is null
        if(root == null) return null;
        //2. When either n1 or n2 is root -> answer becomes root
        if(n1 == root.data || n2 == root.data) return root;
        //3. When both are on the same side -> it means either left or right side would be null
        Node left = lca(root.left, n1, n2);
        Node right = lca(root.right, n1, n2);
        
        if(left == null) return right;
        if(right == null) return left;
        //4. Both are on different sides -> answer will be root
        return root;
    }
}