/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> output = new ArrayList<>();
        bfs(root, 0, output);
        return output;
    }
    
    public void bfs(Node root, int level, ArrayList<ArrayList<Integer>> output){
        Queue<Node> q = new LinkedList<>();
        if(root != null) q.add(root);
        int size = q.size();
        while(!q.isEmpty()){
            ArrayList<Integer> inner = new ArrayList<>();
            for(int i = 0; i < size; i++){
                Node node = q.poll();
                inner.add(node.data);
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
            output.add(inner);
        }
        
    }
}