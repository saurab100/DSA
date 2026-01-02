/*Structure of the node class is
class Node
{
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
} */

class Solution {
    // The given root is the root of the Binary Tree
    // Return the root of the generated BST
    ArrayList<Integer> list = new ArrayList<>();
    int i = 0;
    Node binaryTreeToBST(Node root) {
        // Your code here
        list = inOrderTraversal(root);
        Collections.sort(list);
        inOrder(root);
        return root;
    }
    
    ArrayList<Integer> inOrderTraversal(Node root){
        if(root == null) return list;
        inOrderTraversal(root.left);
        list.add(root.data);
        inOrderTraversal(root.right);
        return list;
    }
    
    public void inOrder(Node root){
        if(root == null) return;
        inOrder(root.left);
        root.data = list.get(i++);
        inOrder(root.right);
    }
}