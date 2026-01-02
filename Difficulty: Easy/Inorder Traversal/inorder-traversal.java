/*
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    ArrayList<Integer> list = new ArrayList<>();
    public ArrayList<Integer> inOrder(Node root) {
        in(root);
        return list;
    }
    
    public void in(Node root){
        if(root == null) return;
        in(root.left);
        list.add(root.data);
        in(root.right);
    }
}