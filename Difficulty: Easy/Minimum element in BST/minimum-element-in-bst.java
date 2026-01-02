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
    ArrayList<Integer> list = new ArrayList<>();
    public int minValue(Node root) {
        inOrder(root);
        return list.get(0);
    }
    
    public void inOrder(Node root){
        if(root == null) return;
        inOrder(root.left);
        list.add(root.data);
        inOrder(root.right);
    }
}