/*
class Node {
    int data;
    Node left, right;

    Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public int height(Node root) {
        // code here
        return helper(root)-1;
        
    }
    
    public int helper(Node root){
        if(root == null) return 0;
        int left = helper(root.left);
        int right = helper(root.right);
        return 1 + Math.max(left, right);
    }
}