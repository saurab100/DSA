/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    int minDepth(Node root) {
        // code here
        if(root == null) return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if(left == 0 && right != 0) return right+1;
        else if(left != 0 && right == 0) return left+1;
        else return 1 + Math.min(left, right);
    }
    
    
}