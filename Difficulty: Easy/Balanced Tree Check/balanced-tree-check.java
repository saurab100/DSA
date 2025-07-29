/* A binary tree node class
class Node
{
    int data;
    Node left,right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
} */

class Solution {
    public boolean isBalanced(Node root) {
        if(root == null){
            return true;
        }
       
        int left = height(root.left);
        int right = height(root.right); 
        if (Math.abs(left - right) > 1){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
        
    }
    
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        return 1 + Math.max(left, right);
    }
}