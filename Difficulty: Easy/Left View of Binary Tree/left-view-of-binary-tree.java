/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> leftView(Node root) {
        // code here
        Queue<Node> q = new ArrayDeque<>();
        if(root == null) return new ArrayList<>();
        q.offer(root);
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(!q.isEmpty()){
            
            int size = q.size();
            for(int i = 0; i < size; i++){
                Node node = q.poll();
                if(i == 0) list.add(node.data);
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
            }
        }
        return list;
    }
}